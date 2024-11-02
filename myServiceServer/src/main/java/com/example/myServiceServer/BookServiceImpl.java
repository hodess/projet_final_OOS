package com.example.myServiceServer;

import com.example.lib.*;
import com.example.myServiceServer.data.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;

import java.util.List;

@GrpcService
public class BookServiceImpl extends BookServiceGrpc.BookServiceImplBase {
    private final BookRepository bookRepository; // Repository pour interagir avec la base de données
    private final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        logger.info("BookService initialized.");
        initializeBooks(); // Appel de la méthode pour initialiser les voitures
    }

    // Méthode pour ajouter des voitures initiales
    private void initializeBooks() {
        if (bookRepository.count() == 0) { // Vérifier si la base de données est vide
            logger.info("Ajout des voitures initiales");
            bookRepository.save(new BookJPA("ABC123", "Tolkien", "The Lord of the Ring", false, "Galimard"));
            bookRepository.save(new BookJPA("DEF456", "JK Rowling", "Harry Potter", true, "Folio"));

        } else {
            logger.info("Des livres existent déjà dans la base de données.");
        }
    }

    @Override
    public void getBook(GetBookRequest request, StreamObserver<GetBookResponse> responseObserver) {
        logger.info("Trouver la voiture : " + request.getISBN());

        BookJPA bookJPA = bookRepository.findByISBN(request.getISBN());
        if (bookJPA != null) {
            Book bookProto = BookConverter.bookJPAToProtobuf(bookJPA);
            GetBookResponse response = GetBookResponse.newBuilder().setBook(bookProto).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } else {
            StatusRuntimeException exception = Status.NOT_FOUND
                    .withDescription("Book with ISBN " + request.getISBN() + " not found.")
                    .asRuntimeException();
            responseObserver.onError(exception);
        }
    }

    @Override
    public void getAllBooks(GetAllBooksRequest request, StreamObserver<GetAllBooksResponse> responseObserver) {
        logger.info("Trouver toutes les voitures");

        List<BookJPA> books = bookRepository.findAll(); // Récupérer toutes les voitures depuis la base de données
        GetAllBooksResponse.Builder responseBuilder = GetAllBooksResponse.newBuilder();

        for (BookJPA bookJPA : books) {
            Book bookProto = BookConverter.bookJPAToProtobuf(bookJPA);
            responseBuilder.addBooks(bookProto);
        }

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void rentBook(putRentBook request, StreamObserver<rentGood> responseObserver) {
        logger.info("Réserve la voiture : " + request.getISBN() + ". Si cela est possible");

        BookJPA bookJPA = bookRepository.findByISBN(request.getISBN());
        if (bookJPA != null) {
            if (bookJPA.isRented() == request.getNewStateRent()) {
                StatusRuntimeException exception = Status.FAILED_PRECONDITION
                        .withDescription("La voiture avec le numéro de plaque " + request.getISBN() + " est déjà louée.")
                        .asRuntimeException();
                responseObserver.onError(exception);
            } else {
                // Marquer la voiture comme louée
                bookJPA.setRented(true);
                bookRepository.save(bookJPA); // Enregistrer l'état modifié dans la base de données

                responseObserver.onNext(rentGood.newBuilder().setActualRent(bookJPA.isRented()).build());
                responseObserver.onCompleted();
            }
        } else {
            StatusRuntimeException exception = Status.NOT_FOUND
                    .withDescription("Book with plate number " + request.getISBN() + " not found.")
                    .asRuntimeException();
            responseObserver.onError(exception);
        }
    }
}
