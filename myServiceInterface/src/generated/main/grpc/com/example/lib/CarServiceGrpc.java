package com.example.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service pour gérer les voitures
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: car.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CarServiceGrpc {

  private CarServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.example.CarService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.lib.GetCarRequest,
      com.example.lib.GetCarResponse> getGetCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCar",
      requestType = com.example.lib.GetCarRequest.class,
      responseType = com.example.lib.GetCarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.lib.GetCarRequest,
      com.example.lib.GetCarResponse> getGetCarMethod() {
    io.grpc.MethodDescriptor<com.example.lib.GetCarRequest, com.example.lib.GetCarResponse> getGetCarMethod;
    if ((getGetCarMethod = CarServiceGrpc.getGetCarMethod) == null) {
      synchronized (CarServiceGrpc.class) {
        if ((getGetCarMethod = CarServiceGrpc.getGetCarMethod) == null) {
          CarServiceGrpc.getGetCarMethod = getGetCarMethod =
              io.grpc.MethodDescriptor.<com.example.lib.GetCarRequest, com.example.lib.GetCarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.lib.GetCarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.lib.GetCarResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CarServiceMethodDescriptorSupplier("GetCar"))
              .build();
        }
      }
    }
    return getGetCarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.lib.GetAllCarsRequest,
      com.example.lib.GetAllCarsResponse> getGetAllCarsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllCars",
      requestType = com.example.lib.GetAllCarsRequest.class,
      responseType = com.example.lib.GetAllCarsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.lib.GetAllCarsRequest,
      com.example.lib.GetAllCarsResponse> getGetAllCarsMethod() {
    io.grpc.MethodDescriptor<com.example.lib.GetAllCarsRequest, com.example.lib.GetAllCarsResponse> getGetAllCarsMethod;
    if ((getGetAllCarsMethod = CarServiceGrpc.getGetAllCarsMethod) == null) {
      synchronized (CarServiceGrpc.class) {
        if ((getGetAllCarsMethod = CarServiceGrpc.getGetAllCarsMethod) == null) {
          CarServiceGrpc.getGetAllCarsMethod = getGetAllCarsMethod =
              io.grpc.MethodDescriptor.<com.example.lib.GetAllCarsRequest, com.example.lib.GetAllCarsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllCars"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.lib.GetAllCarsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.lib.GetAllCarsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CarServiceMethodDescriptorSupplier("GetAllCars"))
              .build();
        }
      }
    }
    return getGetAllCarsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.lib.putRentCar,
      com.example.lib.rentGood> getRentCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RentCar",
      requestType = com.example.lib.putRentCar.class,
      responseType = com.example.lib.rentGood.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.lib.putRentCar,
      com.example.lib.rentGood> getRentCarMethod() {
    io.grpc.MethodDescriptor<com.example.lib.putRentCar, com.example.lib.rentGood> getRentCarMethod;
    if ((getRentCarMethod = CarServiceGrpc.getRentCarMethod) == null) {
      synchronized (CarServiceGrpc.class) {
        if ((getRentCarMethod = CarServiceGrpc.getRentCarMethod) == null) {
          CarServiceGrpc.getRentCarMethod = getRentCarMethod =
              io.grpc.MethodDescriptor.<com.example.lib.putRentCar, com.example.lib.rentGood>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RentCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.lib.putRentCar.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.lib.rentGood.getDefaultInstance()))
              .setSchemaDescriptor(new CarServiceMethodDescriptorSupplier("RentCar"))
              .build();
        }
      }
    }
    return getRentCarMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarServiceStub>() {
        @java.lang.Override
        public CarServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarServiceStub(channel, callOptions);
        }
      };
    return CarServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarServiceBlockingStub>() {
        @java.lang.Override
        public CarServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarServiceBlockingStub(channel, callOptions);
        }
      };
    return CarServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarServiceFutureStub>() {
        @java.lang.Override
        public CarServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarServiceFutureStub(channel, callOptions);
        }
      };
    return CarServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service pour gérer les voitures
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Récupérer une voiture par plaque
     * </pre>
     */
    default void getCar(com.example.lib.GetCarRequest request,
        io.grpc.stub.StreamObserver<com.example.lib.GetCarResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCarMethod(), responseObserver);
    }

    /**
     * <pre>
     * Récupérer toutes les voitures
     * </pre>
     */
    default void getAllCars(com.example.lib.GetAllCarsRequest request,
        io.grpc.stub.StreamObserver<com.example.lib.GetAllCarsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllCarsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Récupérer toutes les voitures
     * </pre>
     */
    default void rentCar(com.example.lib.putRentCar request,
        io.grpc.stub.StreamObserver<com.example.lib.rentGood> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRentCarMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CarService.
   * <pre>
   * Service pour gérer les voitures
   * </pre>
   */
  public static abstract class CarServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CarServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CarService.
   * <pre>
   * Service pour gérer les voitures
   * </pre>
   */
  public static final class CarServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CarServiceStub> {
    private CarServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Récupérer une voiture par plaque
     * </pre>
     */
    public void getCar(com.example.lib.GetCarRequest request,
        io.grpc.stub.StreamObserver<com.example.lib.GetCarResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Récupérer toutes les voitures
     * </pre>
     */
    public void getAllCars(com.example.lib.GetAllCarsRequest request,
        io.grpc.stub.StreamObserver<com.example.lib.GetAllCarsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllCarsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Récupérer toutes les voitures
     * </pre>
     */
    public void rentCar(com.example.lib.putRentCar request,
        io.grpc.stub.StreamObserver<com.example.lib.rentGood> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRentCarMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CarService.
   * <pre>
   * Service pour gérer les voitures
   * </pre>
   */
  public static final class CarServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CarServiceBlockingStub> {
    private CarServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Récupérer une voiture par plaque
     * </pre>
     */
    public com.example.lib.GetCarResponse getCar(com.example.lib.GetCarRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCarMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Récupérer toutes les voitures
     * </pre>
     */
    public com.example.lib.GetAllCarsResponse getAllCars(com.example.lib.GetAllCarsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllCarsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Récupérer toutes les voitures
     * </pre>
     */
    public com.example.lib.rentGood rentCar(com.example.lib.putRentCar request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRentCarMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CarService.
   * <pre>
   * Service pour gérer les voitures
   * </pre>
   */
  public static final class CarServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CarServiceFutureStub> {
    private CarServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Récupérer une voiture par plaque
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.lib.GetCarResponse> getCar(
        com.example.lib.GetCarRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCarMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Récupérer toutes les voitures
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.lib.GetAllCarsResponse> getAllCars(
        com.example.lib.GetAllCarsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllCarsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Récupérer toutes les voitures
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.lib.rentGood> rentCar(
        com.example.lib.putRentCar request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRentCarMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAR = 0;
  private static final int METHODID_GET_ALL_CARS = 1;
  private static final int METHODID_RENT_CAR = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAR:
          serviceImpl.getCar((com.example.lib.GetCarRequest) request,
              (io.grpc.stub.StreamObserver<com.example.lib.GetCarResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_CARS:
          serviceImpl.getAllCars((com.example.lib.GetAllCarsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.lib.GetAllCarsResponse>) responseObserver);
          break;
        case METHODID_RENT_CAR:
          serviceImpl.rentCar((com.example.lib.putRentCar) request,
              (io.grpc.stub.StreamObserver<com.example.lib.rentGood>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetCarMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.lib.GetCarRequest,
              com.example.lib.GetCarResponse>(
                service, METHODID_GET_CAR)))
        .addMethod(
          getGetAllCarsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.lib.GetAllCarsRequest,
              com.example.lib.GetAllCarsResponse>(
                service, METHODID_GET_ALL_CARS)))
        .addMethod(
          getRentCarMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.lib.putRentCar,
              com.example.lib.rentGood>(
                service, METHODID_RENT_CAR)))
        .build();
  }

  private static abstract class CarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CarServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.lib.CarProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CarService");
    }
  }

  private static final class CarServiceFileDescriptorSupplier
      extends CarServiceBaseDescriptorSupplier {
    CarServiceFileDescriptorSupplier() {}
  }

  private static final class CarServiceMethodDescriptorSupplier
      extends CarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CarServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CarServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarServiceFileDescriptorSupplier())
              .addMethod(getGetCarMethod())
              .addMethod(getGetAllCarsMethod())
              .addMethod(getRentCarMethod())
              .build();
        }
      }
    }
    return result;
  }
}
