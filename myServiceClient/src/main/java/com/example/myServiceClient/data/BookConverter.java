package com.example.myServiceClient.data;
import com.example.lib.Car;

//Normaliser la convertion : https://www.baeldung.com/spring-type-conversions
public class BookConverter {

    // Convertir un message Protobuf Car en une entité CarJPA
    public static BookClient protobufToCarClient(Car car) {
        return new BookClient(
                car.getPlateNumber(),
                car.getBrand(),
                car.getPrice(),
                car.getRented(),
                car.getId()
        );
    }
}

