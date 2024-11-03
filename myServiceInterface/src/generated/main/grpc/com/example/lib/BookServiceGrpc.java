package com.example.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service pour gérer les voitures
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: book.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BookServiceGrpc {

  private BookServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.example.BookService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.lib.GetBookRequest,
      com.example.lib.GetBookResponse> getGetBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBook",
      requestType = com.example.lib.GetBookRequest.class,
      responseType = com.example.lib.GetBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.lib.GetBookRequest,
      com.example.lib.GetBookResponse> getGetBookMethod() {
    io.grpc.MethodDescriptor<com.example.lib.GetBookRequest, com.example.lib.GetBookResponse> getGetBookMethod;
    if ((getGetBookMethod = BookServiceGrpc.getGetBookMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getGetBookMethod = BookServiceGrpc.getGetBookMethod) == null) {
          BookServiceGrpc.getGetBookMethod = getGetBookMethod =
              io.grpc.MethodDescriptor.<com.example.lib.GetBookRequest, com.example.lib.GetBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.lib.GetBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.lib.GetBookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("GetBook"))
              .build();
        }
      }
    }
    return getGetBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.lib.GetAllBooksRequest,
      com.example.lib.GetAllBooksResponse> getGetAllBooksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllBooks",
      requestType = com.example.lib.GetAllBooksRequest.class,
      responseType = com.example.lib.GetAllBooksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.lib.GetAllBooksRequest,
      com.example.lib.GetAllBooksResponse> getGetAllBooksMethod() {
    io.grpc.MethodDescriptor<com.example.lib.GetAllBooksRequest, com.example.lib.GetAllBooksResponse> getGetAllBooksMethod;
    if ((getGetAllBooksMethod = BookServiceGrpc.getGetAllBooksMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getGetAllBooksMethod = BookServiceGrpc.getGetAllBooksMethod) == null) {
          BookServiceGrpc.getGetAllBooksMethod = getGetAllBooksMethod =
              io.grpc.MethodDescriptor.<com.example.lib.GetAllBooksRequest, com.example.lib.GetAllBooksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllBooks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.lib.GetAllBooksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.lib.GetAllBooksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("GetAllBooks"))
              .build();
        }
      }
    }
    return getGetAllBooksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.lib.putRentBook,
      com.example.lib.rentGood> getRentBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RentBook",
      requestType = com.example.lib.putRentBook.class,
      responseType = com.example.lib.rentGood.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.lib.putRentBook,
      com.example.lib.rentGood> getRentBookMethod() {
    io.grpc.MethodDescriptor<com.example.lib.putRentBook, com.example.lib.rentGood> getRentBookMethod;
    if ((getRentBookMethod = BookServiceGrpc.getRentBookMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getRentBookMethod = BookServiceGrpc.getRentBookMethod) == null) {
          BookServiceGrpc.getRentBookMethod = getRentBookMethod =
              io.grpc.MethodDescriptor.<com.example.lib.putRentBook, com.example.lib.rentGood>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RentBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.lib.putRentBook.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.lib.rentGood.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("RentBook"))
              .build();
        }
      }
    }
    return getRentBookMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceStub>() {
        @java.lang.Override
        public BookServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceStub(channel, callOptions);
        }
      };
    return BookServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceBlockingStub>() {
        @java.lang.Override
        public BookServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceBlockingStub(channel, callOptions);
        }
      };
    return BookServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceFutureStub>() {
        @java.lang.Override
        public BookServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceFutureStub(channel, callOptions);
        }
      };
    return BookServiceFutureStub.newStub(factory, channel);
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
    default void getBook(com.example.lib.GetBookRequest request,
        io.grpc.stub.StreamObserver<com.example.lib.GetBookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBookMethod(), responseObserver);
    }

    /**
     * <pre>
     * Récupérer toutes les voitures
     * </pre>
     */
    default void getAllBooks(com.example.lib.GetAllBooksRequest request,
        io.grpc.stub.StreamObserver<com.example.lib.GetAllBooksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllBooksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Récupérer toutes les voitures
     * </pre>
     */
    default void rentBook(com.example.lib.putRentBook request,
        io.grpc.stub.StreamObserver<com.example.lib.rentGood> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRentBookMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BookService.
   * <pre>
   * Service pour gérer les voitures
   * </pre>
   */
  public static abstract class BookServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BookServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BookService.
   * <pre>
   * Service pour gérer les voitures
   * </pre>
   */
  public static final class BookServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BookServiceStub> {
    private BookServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Récupérer une voiture par plaque
     * </pre>
     */
    public void getBook(com.example.lib.GetBookRequest request,
        io.grpc.stub.StreamObserver<com.example.lib.GetBookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Récupérer toutes les voitures
     * </pre>
     */
    public void getAllBooks(com.example.lib.GetAllBooksRequest request,
        io.grpc.stub.StreamObserver<com.example.lib.GetAllBooksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllBooksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Récupérer toutes les voitures
     * </pre>
     */
    public void rentBook(com.example.lib.putRentBook request,
        io.grpc.stub.StreamObserver<com.example.lib.rentGood> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRentBookMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BookService.
   * <pre>
   * Service pour gérer les voitures
   * </pre>
   */
  public static final class BookServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BookServiceBlockingStub> {
    private BookServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Récupérer une voiture par plaque
     * </pre>
     */
    public com.example.lib.GetBookResponse getBook(com.example.lib.GetBookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Récupérer toutes les voitures
     * </pre>
     */
    public com.example.lib.GetAllBooksResponse getAllBooks(com.example.lib.GetAllBooksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllBooksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Récupérer toutes les voitures
     * </pre>
     */
    public com.example.lib.rentGood rentBook(com.example.lib.putRentBook request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRentBookMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BookService.
   * <pre>
   * Service pour gérer les voitures
   * </pre>
   */
  public static final class BookServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BookServiceFutureStub> {
    private BookServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Récupérer une voiture par plaque
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.lib.GetBookResponse> getBook(
        com.example.lib.GetBookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Récupérer toutes les voitures
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.lib.GetAllBooksResponse> getAllBooks(
        com.example.lib.GetAllBooksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllBooksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Récupérer toutes les voitures
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.lib.rentGood> rentBook(
        com.example.lib.putRentBook request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRentBookMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BOOK = 0;
  private static final int METHODID_GET_ALL_BOOKS = 1;
  private static final int METHODID_RENT_BOOK = 2;

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
        case METHODID_GET_BOOK:
          serviceImpl.getBook((com.example.lib.GetBookRequest) request,
              (io.grpc.stub.StreamObserver<com.example.lib.GetBookResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_BOOKS:
          serviceImpl.getAllBooks((com.example.lib.GetAllBooksRequest) request,
              (io.grpc.stub.StreamObserver<com.example.lib.GetAllBooksResponse>) responseObserver);
          break;
        case METHODID_RENT_BOOK:
          serviceImpl.rentBook((com.example.lib.putRentBook) request,
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
          getGetBookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.lib.GetBookRequest,
              com.example.lib.GetBookResponse>(
                service, METHODID_GET_BOOK)))
        .addMethod(
          getGetAllBooksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.lib.GetAllBooksRequest,
              com.example.lib.GetAllBooksResponse>(
                service, METHODID_GET_ALL_BOOKS)))
        .addMethod(
          getRentBookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.lib.putRentBook,
              com.example.lib.rentGood>(
                service, METHODID_RENT_BOOK)))
        .build();
  }

  private static abstract class BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.lib.BookProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookService");
    }
  }

  private static final class BookServiceFileDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier {
    BookServiceFileDescriptorSupplier() {}
  }

  private static final class BookServiceMethodDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BookServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BookServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookServiceFileDescriptorSupplier())
              .addMethod(getGetBookMethod())
              .addMethod(getGetAllBooksMethod())
              .addMethod(getRentBookMethod())
              .build();
        }
      }
    }
    return result;
  }
}
