package com.example.myServiceClient.data;

import com.example.lib.Book;

//Normaliser la convertion : https://www.baeldung.com/spring-type-conversions
public class BookConverter {

    // Convertir un message Protobuf Book en une entité BookJPA
    public static BookClient protobufToBookClient(Book book) {
        return new BookClient(
                book.getISBN(),
                book.getAuthor(),
                book.getName(),
                book.getRented(),
                book.getEditor()
        );
    }
}