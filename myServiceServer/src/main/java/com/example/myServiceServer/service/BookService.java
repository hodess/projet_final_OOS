package com.example.myServiceServer.service;

import com.example.myServiceServer.data.BookJPA;
import com.example.myServiceServer.data.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Créer une nouvelle voiture
    public BookJPA addCar(BookJPA car) {
        return bookRepository.save(car);
    }

    // Récupérer toutes les voitures
    public List<BookJPA> getAllCars() {
        return bookRepository.findAll();
    }

    // Récupérer une voiture par son ID
    public Optional<BookJPA> getCarById(long id) {
        return bookRepository.findById(id);
    }

    // Mettre à jour une voiture
    public BookJPA updateCar(BookJPA updatedCar) {
        return bookRepository.save(updatedCar);
    }

    // Supprimer une voiture par son ID
    public void deleteCar(long id) {
        bookRepository.deleteById(id);
    }
}
