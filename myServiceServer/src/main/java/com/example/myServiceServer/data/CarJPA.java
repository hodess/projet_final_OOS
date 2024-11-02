package com.example.myServiceServer.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class CarJPA {

    private String plateNumber;
    private String brand;
    private int price;
    private boolean rented;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Constructeur par défaut requis par JPA
    public CarJPA() {
    }

    // Constructeur avec paramètres
    public CarJPA(String plateNumber, String brand, int price, boolean rented, long id) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.price = price;
        this.rented = rented;
        this.id = id;
    }

    // Getters et Setters
    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
