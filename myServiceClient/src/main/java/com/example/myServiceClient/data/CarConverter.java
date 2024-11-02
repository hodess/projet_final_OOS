package com.example.myServiceClient.data;
import com.example.lib.Car;
import com.example.myServiceClient.data.CarClient;

//Normaliser la convertion : https://www.baeldung.com/spring-type-conversions
public class CarConverter {

    // Convertir un message Protobuf Car en une entité CarJPA
    public static CarClient protobufToCarClient(Car car) {
        return new CarClient(
                car.getPlateNumber(),
                car.getBrand(),
                car.getPrice(),
                car.getRented(),
                car.getId()
        );
    }
}

