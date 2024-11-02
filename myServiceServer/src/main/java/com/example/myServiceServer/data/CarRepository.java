package com.example.myServiceServer.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarJPA, Long> {
    CarJPA findByPlateNumber(String plateNumber);
}
