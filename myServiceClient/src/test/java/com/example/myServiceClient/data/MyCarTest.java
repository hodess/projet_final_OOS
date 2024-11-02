package com.example.myServiceClient.data;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import com.example.myServiceClient.data.CarClient;

@SpringBootTest
class MyCarTest {

    CarClient carClientTest;

    @BeforeEach
    public void init() {
        // Initialisation d'une instance de CarClient avec des valeurs par défaut pour les tests
        carClientTest = new CarClient("ABC123", "Toyota", 10000, false, 1L);
    }

    @Test
    void testGetters() {
        // Vérification des getters
        assertEquals("ABC123", carClientTest.getPlateNumber());
        assertEquals("Toyota", carClientTest.getBrand());
        assertEquals(10000, carClientTest.getPrice());
        assertFalse(carClientTest.isRented());
        assertEquals(1L, carClientTest.getId());
    }

    @Test
    void testSetters() {
        // Vérification des setters
        carClientTest.setPlateNumber("XYZ789");
        carClientTest.setBrand("Honda");
        carClientTest.setPrice(12000);
        carClientTest.setRented(true);
        carClientTest.setId(2L);

        assertEquals("XYZ789", carClientTest.getPlateNumber());
        assertEquals("Honda", carClientTest.getBrand());
        assertEquals(12000, carClientTest.getPrice());
        assertTrue(carClientTest.isRented());
        assertEquals(2L, carClientTest.getId());
    }

    @Test
    void contextLoads() {
        // Vérifie que le contexte Spring Boot se charge correctement
        assertNotNull(carClientTest);
    }
}

