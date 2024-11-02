package com.example.myServiceServer;

import com.example.myServiceServer.data.CarJPA;
import com.example.myServiceServer.data.CarRepository;
import com.example.myServiceServer.service.CarService;
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
public class CarJPATest {

    @Autowired
    private CarRepository carRepository;

    private CarJPA car;

    @BeforeEach
    public void setUp() {
        carRepository.deleteAll();
        car = new CarJPA("ABC123", "Toyota", 20000, false, 0);
    }


    @Test
    public void testSaveCar() {
        // Sauvegarder la voiture
        CarJPA savedCar = carRepository.save(car);

        // Vérifier si l'objet a bien été sauvegardé et que l'ID est généré
        assertNotNull(savedCar.getId());
        assertEquals(car.getPlateNumber(), savedCar.getPlateNumber());
    }

    @Test
    public void testFindCarByPlateNumber() {
        // Sauvegarder une voiture
        carRepository.save(car);

        // Chercher par numéro de plaque
        CarJPA foundCar = carRepository.findByPlateNumber("ABC123");

        // Vérifier que la voiture a bien été trouvée
        assertNotNull(foundCar);
        assertEquals("Toyota", foundCar.getBrand());
    }

    @Test
    public void testUpdateCar() {
        // Sauvegarder la voiture
        CarJPA savedCar = carRepository.save(car);

        // Modifier des informations
        savedCar.setRented(true);
        carRepository.save(savedCar);

        // Chercher la voiture modifiée
        CarJPA updatedCar = carRepository.findByPlateNumber("ABC123");

        // Vérifier la mise à jour
        assertTrue(updatedCar.isRented());
    }

    @Test
    public void testDeleteCar() {
        // Sauvegarder la voiture
        CarJPA savedCar = carRepository.save(car);

        // Supprimer la voiture
        carRepository.delete(savedCar);

        // Chercher la voiture supprimée
        CarJPA foundCar = carRepository.findByPlateNumber("ABC123");

        // Vérifier que la voiture n'existe plus
        assertNull(foundCar, "La voiture aurait dû être supprimée");
    }
}
