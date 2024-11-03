/*package com.example.myServiceServer;

import com.example.myServiceServer.data.BookJPA;
import com.example.myServiceServer.data.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback
public class BookJPATest {

    @Autowired
    private BookRepository bookRepository;

    private BookJPA book;

    @BeforeEach
    public void setUp() {
        bookRepository.deleteAll();
        book = new BookJPA("ABC123", "The Hobbit", "Tolkien", false, "Galimard");
    }


    @Test
    public void testSaveBook() {
        // Sauvegarder la voiture
        BookJPA savedBook = bookRepository.save(book);

        // Vérifier si l'objet a bien été sauvegardé et que l'ID est généré
        assertNotNull(savedBook.getISBN());
        assertEquals(book.getISBN(), savedBook.getISBN());
    }

    @Test
    public void testFindBookByISBN() {
        // Sauvegarder un livre
        bookRepository.save(book);

        // Chercher par numéro de plaque
        BookJPA foundBook = bookRepository.findByISBN("ABC123");

        // Vérifier que le livre a bien été trouvée
        assertNotNull(foundBook);
        assertEquals("The Hobbit", foundBook.getName());
    }

    @Test
    public void testUpdateBook() {
        // Sauvegarder le livre
        BookJPA savedBook = bookRepository.save(book);

        // Modifier des informations
        savedBook.setRented(true);
        bookRepository.save(savedBook);

        // Chercher la voiture modifiée
        BookJPA updatedBook = bookRepository.findByISBN("ABC123");

        // Vérifier la mise à jour
        assertTrue(updatedBook.isRented());
    }

    @Test
    public void testDeleteBook() {
        // Sauvegarder la voiture
        BookJPA savedBook = bookRepository.save(book);

        // Supprimer la voiture
        bookRepository.delete(savedBook);

        // Chercher la voiture supprimée
        BookJPA foundBook = bookRepository.findByISBN("ABC123");

        // Vérifier que la voiture n'existe plus
        assertNull(foundBook, "La voiture aurait dû être supprimée");
    }
}
*/