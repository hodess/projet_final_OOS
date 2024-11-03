package com.example.myServiceServer;

import com.example.lib.HelloReply;
import com.example.lib.Empty;
import com.example.lib.MyServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@GrpcService
public class MyServiceImpl extends MyServiceGrpc.MyServiceImplBase {

    Logger logger = LoggerFactory.getLogger(MyServiceImpl.class);

    @Override
    public void sayHello(Empty request, StreamObserver<HelloReply> responseObserver) {
        logger.info("sayHello"); // Log de l'appel
        responseObserver.onNext(HelloReply.newBuilder()
                .setMessage("Hello you are at the librairie : Chat Pitre") // Réponse avec "Hello World"
                .build());
        responseObserver.onCompleted(); // Indique que la réponse est terminée
    }
}
