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
        initializeBooks(); // Appel de la méthode pour initialiser les livres
    }

    // Méthode pour ajouter des livres  initiales
    private void initializeBooks() {
        if (bookRepository.count() == 0) { // Vérifier si la base de données est vide
            logger.info("Ajout des livres initiales");
            bookRepository.save(new BookJPA("ABC123", "Tolkien", "The Lord of the Ring", false, "Galimard"));
            bookRepository.save(new BookJPA("DEF456", "JK Rowling", "Harry Potter", true, "Folio"));

        } else {
            logger.info("Des livres existent déjà dans la base de données.");
        }
    }

    @Override
    public void getAllBooks(GetAllBooksRequest request, StreamObserver<GetAllBooksResponse> responseObserver) {
        logger.info("Trouver toutes les livres");

        List<BookJPA> books = bookRepository.findAll(); // Récupérer toutes les livres depuis la base de données
        GetAllBooksResponse.Builder responseBuilder = GetAllBooksResponse.newBuilder();

        for (BookJPA bookJPA : books) {
            Book bookProto = BookConverter.bookJPAToProtobuf(bookJPA);
            responseBuilder.addBooks(bookProto);
        }
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getBook(GetBookRequest request, StreamObserver<GetBookResponse> responseObserver) {
        logger.info("Trouver le livre : " + request.getISBN());

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
    public void getRentedBooks(GetAllBooksRequest request, StreamObserver<GetAllBooksResponse> responseObserver) {
        logger.info("Finding all rented books");

        // Fetch only rented books from the database
        List<BookJPA> rentedBooks = bookRepository.findByRentedTrue();

        GetAllBooksResponse.Builder responseBuilder = GetAllBooksResponse.newBuilder();

        // Convert each rented BookJPA to Book (Protobuf) and add to response
        for (BookJPA bookJPA : rentedBooks) {
            Book bookProto = BookConverter.bookJPAToProtobuf(bookJPA);
            responseBuilder.addBooks(bookProto);
        }
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void rentBook(putRentBook request, StreamObserver<rentGood> responseObserver) {
        logger.info("Réserve le livre : " + request.getISBN() + ". Si cela est possible");

        BookJPA bookJPA = bookRepository.findByISBN(request.getISBN());
        if (bookJPA != null) {
            if (bookJPA.isRented() == request.getNewStateRent()) {
                StatusRuntimeException exception = Status.FAILED_PRECONDITION
                        .withDescription("Le livre avec le numéro de plaque " + request.getISBN() + " est déjà louée.")
                        .asRuntimeException();
                responseObserver.onError(exception);
            } else {
                // Marquer le livre comme louée
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
