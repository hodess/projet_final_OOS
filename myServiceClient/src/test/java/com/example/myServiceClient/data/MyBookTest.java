package com.example.myServiceClient.data;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyBookTest {

    BookClient bookClientTest;

    @BeforeEach
    public void init() {
        // Initialisation d'une instance de BookClient avec des valeurs par défaut pour les tests
        bookClientTest = new BookClient("ABC123", "Tolkien", "The Lord of the ring", false, "Galimard");
    }

    @Test
    void testGetters() {
        // Vérification des getters
        assertEquals("ABC123", bookClientTest.getISBN());
        assertEquals("Tolkien", bookClientTest.getAuthor());
        assertEquals("The Lord of the ring", bookClientTest.getName());
        assertFalse(bookClientTest.isRented());
        assertEquals("Galimard", bookClientTest.getEditor());
    }

    @Test
    void testSetters() {
        // Vérification des setters
        bookClientTest.setISBN("XYZ789");
        bookClientTest.setAuthor("Chistopher Paolini");
        bookClientTest.setName("Eragon");
        bookClientTest.setRented(false);
        bookClientTest.setEditor("Clair de lune");

        assertEquals("XYZ789", bookClientTest.getISBN());
        assertEquals("Chistopher Paolini", bookClientTest.getAuthor());
        assertEquals("Eragon", bookClientTest.getName());
        assertFalse(bookClientTest.isRented());
        assertEquals("Clair de lune", bookClientTest.getEditor());
    }

    @Test
    void contextLoads() {
        // Vérifie que le contexte Spring Boot se charge correctement
        assertNotNull(bookClientTest);
    }
}

