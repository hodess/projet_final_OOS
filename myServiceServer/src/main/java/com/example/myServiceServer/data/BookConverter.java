package com.example.myServiceServer.data;

import com.example.lib.Book;

public class BookConverter {

    public static Book bookJPAToProtobuf(BookJPA BookClient) {
        return Book.newBuilder()
                .setISBN(BookClient.getISBN())
                .setName(BookClient.getName())
                .setAuthor(BookClient.getAuthor())
                .setRented(BookClient.isRented())
                .setEditor(BookClient.getEditor())
                .build();
    }

    // Convertir un message Protobuf Book en une entité BookJPA
    public static BookJPA protobufToBookJPA(Book book) {
        return new BookJPA(
                book.getISBN(),
                book.getName(),
                book.getAuthor(),
                book.getRented(),
                book.getEditor()
        );
    }
}
