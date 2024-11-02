package com.example.myServiceServer.service;

import com.example.myServiceServer.data.CarJPA;
import com.example.myServiceServer.data.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    // Créer une nouvelle voiture
    public CarJPA addCar(CarJPA car) {
        return carRepository.save(car);
    }

    // Récupérer toutes les voitures
    public List<CarJPA> getAllCars() {
        return carRepository.findAll();
    }

    // Récupérer une voiture par son ID
    public Optional<CarJPA> getCarById(long id) {
        return carRepository.findById(id);
    }

    // Mettre à jour une voiture
    public CarJPA updateCar(CarJPA updatedCar) {
        return carRepository.save(updatedCar);
    }

    // Supprimer une voiture par son ID
    public void deleteCar(long id) {
        carRepository.deleteById(id);
    }
}
