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

    @GetMapping("/cars") // Endpoint pour récupérer toutes les voitures
    @ResponseStatus(HttpStatus.OK)
    public List<BookClient> allCars() {
        return bookService.allCars();
    }

    @GetMapping("/cars/{id}") // Endpoint pour récupérer toutes les voitures
    @ResponseStatus(HttpStatus.OK)
    public BookClient getCarById(@PathVariable("id") String id) {
        return bookService.getCarById(id); // Appel au service pour récupérer la voiture par ID
    }

    @PutMapping("/cars/{id}") // Reserver une voiture
    @ResponseStatus(HttpStatus.OK)
    public String postCarRent(@PathVariable("id") String id, @RequestParam("rent") boolean rent) {
        return bookService.postRentCar(id, rent);
    }
}
