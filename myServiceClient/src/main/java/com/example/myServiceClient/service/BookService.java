package com.example.myServiceClient.service;

import com.example.myServiceClient.data.*;
import com.example.lib.*;
import com.example.myServiceClient.data.BookConverter;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;

@Service
public class BookService {

    Logger logger = LoggerFactory.getLogger(BookService.class);

    @GrpcClient("bookService")
    private BookServiceGrpc.BookServiceBlockingStub bookServiceStub;

    // Méthode pour obtenir tous les livres (BookClient) depuis le serveur gRPC
    public List<BookClient> allBooks() {
        logger.info("Récupération de touts les livres...");

        // Appel gRPC pour obtenir les livres sous forme de message Protobuf
        GetAllBooksResponse reply = bookServiceStub.getAllBooks(GetAllBooksRequest.newBuilder().build());


        // Convertir chaque message Protobuf Book en entité BookClient
        return reply.getBooksList().stream()
                .map(BookConverter::protobufToBookClient) // Conversion Protobuf -> JPA
                .collect(Collectors.toList());
    }

    public List<BookClient> rentedBooks() {
        logger.info("Récupération des livres réservés...");

        // gRPC call to retrieve only the rented books
        GetAllBooksResponse reply = bookServiceStub.getRentedBooks(GetAllBooksRequest.newBuilder().build());

        // Convert each Protobuf Book message to a BookClient entity
        return reply.getBooksList().stream()
                .map(BookConverter::protobufToBookClient) // Conversion Protobuf -> BookClient
                .collect(Collectors.toList());
    }

    // Méthode pour obtenir un livre par son numéro d'isbn
    public BookClient getBookByISBN(String ISBN) {
        logger.info("Récupération du livre avec le numéro ISBN : " + ISBN);

        try {
            GetBookResponse reply = bookServiceStub.getBook(GetBookRequest.newBuilder().setISBN(ISBN).build());
            return BookConverter.protobufToBookClient(reply.getBook());
        } catch (StatusRuntimeException e) {
            if (e.getStatus().getCode() == Status.Code.NOT_FOUND) {
                logger.error("Livre avec le numéro ISBN  " + ISBN + " non trouvée.");
                return null;
            } else {
                logger.error("Erreur lors de la récupération du livre : " + e.getMessage());
                return null;
            }
        }
    }


    public String postRentBook(String ISBN,boolean rent) {
        logger.info("Récuperation du livre avec le numéro ISBN : " + ISBN);
        try{
            rentGood reply = bookServiceStub.rentBook(putRentBook.newBuilder().setISBN(ISBN).setNewStateRent(rent).build());

            // Conversion du message Protobuf en BookClient
            return "{\"Actual_Rent\": " + reply.getActualRent() + "}";
        }catch(StatusRuntimeException e){
            if (e.getStatus().getCode() == Status.Code.FAILED_PRECONDITION){
                logger.warn("Erreur de valeur : " + e.getMessage());
            } else if (e.getStatus().getCode() == Status.Code.NOT_FOUND) {
                logger.error("Book avec le numéro " + ISBN + " non trouvée.");
            }else{
                logger.error("Erreur lors de la réservation du livre : " + e.getMessage());
            }
            return "{\"Erreur\": \"" + e.getStatus().getDescription() + "\", \"Actual_Rent\": null}";
        }
    }
}
