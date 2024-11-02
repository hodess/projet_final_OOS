package com.example.myServiceClient.data;

public class CarClient {
    private String plateNumber;
    private String brand;
    private int price;
    private boolean rented;
    private long id;


    public CarClient(String plateNumber, String brand, int price, boolean rented, long id) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.price = price;
        this.rented = rented;
        this.id = id;
    }

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
