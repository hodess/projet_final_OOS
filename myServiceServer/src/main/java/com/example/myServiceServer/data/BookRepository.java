package com.example.myServiceServer.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookJPA, Long> {
    BookJPA findByISBN(String ISBN);
}
