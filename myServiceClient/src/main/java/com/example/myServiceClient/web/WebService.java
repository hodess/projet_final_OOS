package com.example.myServiceClient.web;

import com.example.myServiceClient.data.*;
import com.example.myServiceClient.service.BookService;
import com.example.myServiceClient.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebService {

    private final MyService myService; // Déclaration finale pour éviter des problèmes de mutabilité
    private final BookService bookService;

    @Autowired
    public WebService(MyService myService, BookService bookService, BookService bookService1) {
        this.myService = myService;
        this.bookService = bookService;
    }

    @GetMapping("/") // Endpoint pour le hello world
    @ResponseStatus(HttpStatus.OK)
    public String sayHello() {
        return myService.sayHello();
    }

    @GetMapping("/books") // Endpoint pour récupérer toutes les livres
    @ResponseStatus(HttpStatus.OK)
    public List<BookClient> allBooks() {
        return bookService.allBooks();
    }

    @GetMapping("/books/rented")
    @ResponseStatus(HttpStatus.OK)
    public List<BookClient> rentedBooks() {
        return bookService.rentedBooks();
    }

    @GetMapping("/books/{ISBN}") // Endpoint pour récupérer toutes les livres
    @ResponseStatus(HttpStatus.OK)
    public BookClient getBooksByISBN(@PathVariable("ISBN") String ISBN) {
        return bookService.getBookByISBN(ISBN); // Appel au service pour récupérer le livre par son ISBN
    }

    @PutMapping("/books/{ISBN}") // Reserver un livre
    @ResponseStatus(HttpStatus.OK)
    public String postBookRent(@PathVariable("ISBN") String ISBN, @RequestParam("rent") boolean rent) {
        return bookService.postRentBook(ISBN, rent);
    }
}
