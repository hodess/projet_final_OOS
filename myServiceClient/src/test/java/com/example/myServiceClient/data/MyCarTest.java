package com.example.myServiceClient.data;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyCarTest {

    BookClient bookClientTest;

    @BeforeEach
    public void init() {
        // Initialisation d'une instance de CarClient avec des valeurs par défaut pour les tests
        bookClientTest = new BookClient("ABC123", "Toyota", 10000, false, 1L);
    }

    @Test
    void testGetters() {
        // Vérification des getters
        assertEquals("ABC123", bookClientTest.getPlateNumber());
        assertEquals("Toyota", bookClientTest.getBrand());
        assertEquals(10000, bookClientTest.getPrice());
        assertFalse(bookClientTest.isRented());
        assertEquals(1L, bookClientTest.getId());
    }

    @Test
    void testSetters() {
        // Vérification des setters
        bookClientTest.setPlateNumber("XYZ789");
        bookClientTest.setBrand("Honda");
        bookClientTest.setPrice(12000);
        bookClientTest.setRented(true);
        bookClientTest.setId(2L);

        assertEquals("XYZ789", bookClientTest.getPlateNumber());
        assertEquals("Honda", bookClientTest.getBrand());
        assertEquals(12000, bookClientTest.getPrice());
        assertTrue(bookClientTest.isRented());
        assertEquals(2L, bookClientTest.getId());
    }

    @Test
    void contextLoads() {
        // Vérifie que le contexte Spring Boot se charge correctement
        assertNotNull(bookClientTest);
    }
}

