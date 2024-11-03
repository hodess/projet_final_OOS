package com.example.myServiceServer.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<BookJPA, Long> {

    // Find a single book by ISBN
    BookJPA findByISBN(String ISBN);

    // Find all books that are currently rented (where rented is true)
    List<BookJPA> findByRentedTrue();
}
