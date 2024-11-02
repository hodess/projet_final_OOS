package com.example.myServiceServer;

import com.example.myServiceServer.data.CarJPA;
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

    private CarJPA car;

    @BeforeEach
    public void setUp() {
        bookRepository.deleteAll();
        car = new CarJPA("ABC123", "Toyota", 20000, false, 0);
    }


    @Test
    public void testSaveCar() {
        // Sauvegarder la voiture
        CarJPA savedCar = bookRepository.save(car);

        // Vérifier si l'objet a bien été sauvegardé et que l'ID est généré
        assertNotNull(savedCar.getId());
        assertEquals(car.getPlateNumber(), savedCar.getPlateNumber());
    }

    @Test
    public void testFindCarByPlateNumber() {
        // Sauvegarder une voiture
        bookRepository.save(car);

        // Chercher par numéro de plaque
        CarJPA foundCar = bookRepository.findByPlateNumber("ABC123");

        // Vérifier que la voiture a bien été trouvée
        assertNotNull(foundCar);
        assertEquals("Toyota", foundCar.getBrand());
    }

    @Test
    public void testUpdateCar() {
        // Sauvegarder la voiture
        CarJPA savedCar = bookRepository.save(car);

        // Modifier des informations
        savedCar.setRented(true);
        bookRepository.save(savedCar);

        // Chercher la voiture modifiée
        CarJPA updatedCar = bookRepository.findByPlateNumber("ABC123");

        // Vérifier la mise à jour
        assertTrue(updatedCar.isRented());
    }

    @Test
    public void testDeleteCar() {
        // Sauvegarder la voiture
        CarJPA savedCar = bookRepository.save(car);

        // Supprimer la voiture
        bookRepository.delete(savedCar);

        // Chercher la voiture supprimée
        CarJPA foundCar = bookRepository.findByPlateNumber("ABC123");

        // Vérifier que la voiture n'existe plus
        assertNull(foundCar, "La voiture aurait dû être supprimée");
    }
}
