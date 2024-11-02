package com.example.myServiceClient.service;

import com.example.myServiceClient.data.*;
import com.example.lib.*;
import com.example.myServiceClient.data.CarConverter;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;

@Service
public class CarService {

    Logger logger = LoggerFactory.getLogger(CarService.class);

    @GrpcClient("carService")
    private CarServiceGrpc.CarServiceBlockingStub carServiceStub;

    // Méthode pour obtenir toutes les voitures (CarClient) depuis le serveur gRPC
    public List<CarClient> allCars() {
        logger.info("Récupération de toutes les voitures...");

        // Appel gRPC pour obtenir les voitures sous forme de message Protobuf
        GetAllCarsResponse reply = carServiceStub.getAllCars(GetAllCarsRequest.newBuilder().build());

        // Convertir chaque message Protobuf Car en entité CarClient
        return reply.getCarsList().stream()
                .map(CarConverter::protobufToCarClient) // Conversion Protobuf -> JPA
                .collect(Collectors.toList());
    }

    // Méthode pour obtenir une voiture par son numéro de plaque (CarClient)
    public CarClient getCarById(String plateNumber) {
        logger.info("Récupération de la voiture avec la plaque : " + plateNumber);

        try {
            GetCarResponse reply = carServiceStub.getCar(GetCarRequest.newBuilder().setPlateNumber(plateNumber).build());
            return CarConverter.protobufToCarClient(reply.getCar());
        } catch (StatusRuntimeException e) {
            if (e.getStatus().getCode() == Status.Code.NOT_FOUND) {
                logger.error("Voiture avec la plaque " + plateNumber + " non trouvée.");
                return null;
            } else {
                logger.error("Erreur lors de la récupération de la voiture : " + e.getMessage());
                return null;
            }
        }
    }


    public String postRentCar(String plateNumber,boolean rent) {
        logger.info("Récuperation de la voiture avec la plaque : " + plateNumber);
        try{
            rentGood reply = carServiceStub.rentCar(putRentCar.newBuilder().setPlateNumber(plateNumber).setNewStateRent(rent).build());

            // Conversion du message Protobuf en CarClient
            return "{\"Actual_Rent\": " + reply.getActualRent() + "}";
        }catch(StatusRuntimeException e){
            if (e.getStatus().getCode() == Status.Code.FAILED_PRECONDITION){
                logger.warn("Erreur de valeur : " + e.getMessage());
            } else if (e.getStatus().getCode() == Status.Code.NOT_FOUND) {
                logger.error("Voiture avec la plaque " + plateNumber + " non trouvée.");
            }else{
                logger.error("Erreur lors de la réservation de la voiture : " + e.getMessage());
            }
            return "{\"Erreur\": \"" + e.getStatus().getDescription() + "\", \"Actual_Rent\": null}";
        }
    }
}
