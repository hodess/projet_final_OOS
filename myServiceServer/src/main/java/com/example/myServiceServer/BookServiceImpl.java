package com.example.myServiceServer;

import com.example.lib.*;
import com.example.myServiceServer.data.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;

import java.util.List;

@GrpcService
public class BookServiceImpl extends CarServiceGrpc.CarServiceImplBase {
    private final BookRepository bookRepository; // Repository pour interagir avec la base de données
    private final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        logger.info("CarService initialized.");
        initializeCars(); // Appel de la méthode pour initialiser les voitures
    }

    // Méthode pour ajouter des voitures initiales
    private void initializeCars() {
        if (bookRepository.count() == 0) { // Vérifier si la base de données est vide
            logger.info("Ajout des voitures initiales");
            bookRepository.save(new CarJPA("ABC123", "Toyota", 20000, false, 1));
            bookRepository.save(new CarJPA("XYZ456", "Honda", 22000, true, 2));
        } else {
            logger.info("Des voitures existent déjà dans la base de données.");
        }
    }

    @Override
    public void getCar(GetCarRequest request, StreamObserver<GetCarResponse> responseObserver) {
        logger.info("Trouver la voiture : " + request.getPlateNumber());

        CarJPA carJPA = bookRepository.findByPlateNumber(request.getPlateNumber());
        if (carJPA != null) {
            Car carProto = BookConverter.carJPAToProtobuf(carJPA);
            GetCarResponse response = GetCarResponse.newBuilder().setCar(carProto).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } else {
            StatusRuntimeException exception = Status.NOT_FOUND
                    .withDescription("Car with plate number " + request.getPlateNumber() + " not found.")
                    .asRuntimeException();
            responseObserver.onError(exception);
        }
    }

    @Override
    public void getAllCars(GetAllCarsRequest request, StreamObserver<GetAllCarsResponse> responseObserver) {
        logger.info("Trouver toutes les voitures");

        List<CarJPA> cars = bookRepository.findAll(); // Récupérer toutes les voitures depuis la base de données
        GetAllCarsResponse.Builder responseBuilder = GetAllCarsResponse.newBuilder();

        for (CarJPA carJPA : cars) {
            Car carProto = BookConverter.carJPAToProtobuf(carJPA);
            responseBuilder.addCars(carProto);
        }

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void rentCar(putRentCar request, StreamObserver<rentGood> responseObserver) {
        logger.info("Réserve la voiture : " + request.getPlateNumber() + ". Si cela est possible");

        CarJPA carJPA = bookRepository.findByPlateNumber(request.getPlateNumber());
        if (carJPA != null) {
            if (carJPA.isRented() == request.getNewStateRent()) {
                StatusRuntimeException exception = Status.FAILED_PRECONDITION
                        .withDescription("La voiture avec le numéro de plaque " + request.getPlateNumber() + " est déjà louée.")
                        .asRuntimeException();
                responseObserver.onError(exception);
            } else {
                // Marquer la voiture comme louée
                carJPA.setRented(true);
                bookRepository.save(carJPA); // Enregistrer l'état modifié dans la base de données

                responseObserver.onNext(rentGood.newBuilder().setActualRent(carJPA.isRented()).build());
                responseObserver.onCompleted();
            }
        } else {
            StatusRuntimeException exception = Status.NOT_FOUND
                    .withDescription("Car with plate number " + request.getPlateNumber() + " not found.")
                    .asRuntimeException();
            responseObserver.onError(exception);
        }
    }
}
