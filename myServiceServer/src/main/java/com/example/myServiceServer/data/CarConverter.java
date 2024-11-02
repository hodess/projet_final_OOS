package com.example.myServiceServer.data;

import com.example.lib.Car;

public class CarConverter {

    public static Car carJPAToProtobuf(CarJPA CarClient) {
        return Car.newBuilder()
                .setPlateNumber(CarClient.getPlateNumber())
                .setBrand(CarClient.getBrand())
                .setPrice(CarClient.getPrice())
                .setRented(CarClient.isRented())
                .setId(CarClient.getId())
                .build();
    }

    // Convertir un message Protobuf Car en une entité CarJPA
    public static CarJPA protobufToCarJPA(Car car) {
        return new CarJPA(
                car.getPlateNumber(),
                car.getBrand(),
                car.getPrice(),
                car.getRented(),
                car.getId()
        );
    }
}
