package com.lyyang.grpc.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeter service definition.
 * </pre>
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.42.2)",
        comments = "Source: greeter.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreeterGrpc {

    private GreeterGrpc() {}

    public static final String SERVICE_NAME = "Greeter";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.lyyang.grpc.model.GreeterProto.HelloRequest,
            com.lyyang.grpc.model.GreeterProto.HelloReply> getSayHelloMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "SayHello",
            requestType = com.lyyang.grpc.model.GreeterProto.HelloRequest.class,
            responseType = com.lyyang.grpc.model.GreeterProto.HelloReply.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.lyyang.grpc.model.GreeterProto.HelloRequest,
            com.lyyang.grpc.model.GreeterProto.HelloReply> getSayHelloMethod() {
        io.grpc.MethodDescriptor<com.lyyang.grpc.model.GreeterProto.HelloRequest, com.lyyang.grpc.model.GreeterProto.HelloReply> getSayHelloMethod;
        if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
            synchronized (GreeterGrpc.class) {
                if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
                    GreeterGrpc.getSayHelloMethod = getSayHelloMethod =
                            io.grpc.MethodDescriptor.<com.lyyang.grpc.model.GreeterProto.HelloRequest, com.lyyang.grpc.model.GreeterProto.HelloReply>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.lyyang.grpc.model.GreeterProto.HelloRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.lyyang.grpc.model.GreeterProto.HelloReply.getDefaultInstance()))
                                    .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHello"))
                                    .build();
                }
            }
        }
        return getSayHelloMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.lyyang.grpc.model.GreeterProto.HelloRequest,
            com.lyyang.grpc.model.GreeterProto.HelloReply> getSayHelloAdminMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "SayHelloAdmin",
            requestType = com.lyyang.grpc.model.GreeterProto.HelloRequest.class,
            responseType = com.lyyang.grpc.model.GreeterProto.HelloReply.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.lyyang.grpc.model.GreeterProto.HelloRequest,
            com.lyyang.grpc.model.GreeterProto.HelloReply> getSayHelloAdminMethod() {
        io.grpc.MethodDescriptor<com.lyyang.grpc.model.GreeterProto.HelloRequest, com.lyyang.grpc.model.GreeterProto.HelloReply> getSayHelloAdminMethod;
        if ((getSayHelloAdminMethod = GreeterGrpc.getSayHelloAdminMethod) == null) {
            synchronized (GreeterGrpc.class) {
                if ((getSayHelloAdminMethod = GreeterGrpc.getSayHelloAdminMethod) == null) {
                    GreeterGrpc.getSayHelloAdminMethod = getSayHelloAdminMethod =
                            io.grpc.MethodDescriptor.<com.lyyang.grpc.model.GreeterProto.HelloRequest, com.lyyang.grpc.model.GreeterProto.HelloReply>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloAdmin"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.lyyang.grpc.model.GreeterProto.HelloRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.lyyang.grpc.model.GreeterProto.HelloReply.getDefaultInstance()))
                                    .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHelloAdmin"))
                                    .build();
                }
            }
        }
        return getSayHelloAdminMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.lyyang.grpc.model.GreeterProto.AuthRequest,
            com.lyyang.grpc.model.GreeterProto.AuthReply> getAuthenticateMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "Authenticate",
            requestType = com.lyyang.grpc.model.GreeterProto.AuthRequest.class,
            responseType = com.lyyang.grpc.model.GreeterProto.AuthReply.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.lyyang.grpc.model.GreeterProto.AuthRequest,
            com.lyyang.grpc.model.GreeterProto.AuthReply> getAuthenticateMethod() {
        io.grpc.MethodDescriptor<com.lyyang.grpc.model.GreeterProto.AuthRequest, com.lyyang.grpc.model.GreeterProto.AuthReply> getAuthenticateMethod;
        if ((getAuthenticateMethod = GreeterGrpc.getAuthenticateMethod) == null) {
            synchronized (GreeterGrpc.class) {
                if ((getAuthenticateMethod = GreeterGrpc.getAuthenticateMethod) == null) {
                    GreeterGrpc.getAuthenticateMethod = getAuthenticateMethod =
                            io.grpc.MethodDescriptor.<com.lyyang.grpc.model.GreeterProto.AuthRequest, com.lyyang.grpc.model.GreeterProto.AuthReply>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Authenticate"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.lyyang.grpc.model.GreeterProto.AuthRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.lyyang.grpc.model.GreeterProto.AuthReply.getDefaultInstance()))
                                    .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("Authenticate"))
                                    .build();
                }
            }
        }
        return getAuthenticateMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.lyyang.grpc.model.GreeterProto.Stock,
            com.lyyang.grpc.model.GreeterProto.StockQuote> getServerSideStreamingGetListStockQuotesMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "serverSideStreamingGetListStockQuotes",
            requestType = com.lyyang.grpc.model.GreeterProto.Stock.class,
            responseType = com.lyyang.grpc.model.GreeterProto.StockQuote.class,
            methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
    public static io.grpc.MethodDescriptor<com.lyyang.grpc.model.GreeterProto.Stock,
            com.lyyang.grpc.model.GreeterProto.StockQuote> getServerSideStreamingGetListStockQuotesMethod() {
        io.grpc.MethodDescriptor<com.lyyang.grpc.model.GreeterProto.Stock, com.lyyang.grpc.model.GreeterProto.StockQuote> getServerSideStreamingGetListStockQuotesMethod;
        if ((getServerSideStreamingGetListStockQuotesMethod = GreeterGrpc.getServerSideStreamingGetListStockQuotesMethod) == null) {
            synchronized (GreeterGrpc.class) {
                if ((getServerSideStreamingGetListStockQuotesMethod = GreeterGrpc.getServerSideStreamingGetListStockQuotesMethod) == null) {
                    GreeterGrpc.getServerSideStreamingGetListStockQuotesMethod = getServerSideStreamingGetListStockQuotesMethod =
                            io.grpc.MethodDescriptor.<com.lyyang.grpc.model.GreeterProto.Stock, com.lyyang.grpc.model.GreeterProto.StockQuote>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "serverSideStreamingGetListStockQuotes"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.lyyang.grpc.model.GreeterProto.Stock.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.lyyang.grpc.model.GreeterProto.StockQuote.getDefaultInstance()))
                                    .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("serverSideStreamingGetListStockQuotes"))
                                    .build();
                }
            }
        }
        return getServerSideStreamingGetListStockQuotesMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static GreeterStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<GreeterStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<GreeterStub>() {
                    @java.lang.Override
                    public GreeterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new GreeterStub(channel, callOptions);
                    }
                };
        return GreeterStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static GreeterBlockingStub newBlockingStub(
            io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub>() {
                    @java.lang.Override
                    public GreeterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new GreeterBlockingStub(channel, callOptions);
                    }
                };
        return GreeterBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static GreeterFutureStub newFutureStub(
            io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub>() {
                    @java.lang.Override
                    public GreeterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new GreeterFutureStub(channel, callOptions);
                    }
                };
        return GreeterFutureStub.newStub(factory, channel);
    }

    /**
     * <pre>
     * The greeter service definition.
     * </pre>
     */
    public static abstract class GreeterImplBase implements io.grpc.BindableService {

        /**
         * <pre>
         * Sends a greeting
         * </pre>
         */
        public void sayHello(com.lyyang.grpc.model.GreeterProto.HelloRequest request,
                             io.grpc.stub.StreamObserver<com.lyyang.grpc.model.GreeterProto.HelloReply> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
        }

        /**
         */
        public void sayHelloAdmin(com.lyyang.grpc.model.GreeterProto.HelloRequest request,
                                  io.grpc.stub.StreamObserver<com.lyyang.grpc.model.GreeterProto.HelloReply> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloAdminMethod(), responseObserver);
        }

        /**
         */
        public void authenticate(com.lyyang.grpc.model.GreeterProto.AuthRequest request,
                                 io.grpc.stub.StreamObserver<com.lyyang.grpc.model.GreeterProto.AuthReply> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticateMethod(), responseObserver);
        }

        /**
         */
        public void serverSideStreamingGetListStockQuotes(com.lyyang.grpc.model.GreeterProto.Stock request,
                                                          io.grpc.stub.StreamObserver<com.lyyang.grpc.model.GreeterProto.StockQuote> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServerSideStreamingGetListStockQuotesMethod(), responseObserver);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            getSayHelloMethod(),
                            io.grpc.stub.ServerCalls.asyncUnaryCall(
                                    new MethodHandlers<
                                            com.lyyang.grpc.model.GreeterProto.HelloRequest,
                                            com.lyyang.grpc.model.GreeterProto.HelloReply>(
                                            this, METHODID_SAY_HELLO)))
                    .addMethod(
                            getSayHelloAdminMethod(),
                            io.grpc.stub.ServerCalls.asyncUnaryCall(
                                    new MethodHandlers<
                                            com.lyyang.grpc.model.GreeterProto.HelloRequest,
                                            com.lyyang.grpc.model.GreeterProto.HelloReply>(
                                            this, METHODID_SAY_HELLO_ADMIN)))
                    .addMethod(
                            getAuthenticateMethod(),
                            io.grpc.stub.ServerCalls.asyncUnaryCall(
                                    new MethodHandlers<
                                            com.lyyang.grpc.model.GreeterProto.AuthRequest,
                                            com.lyyang.grpc.model.GreeterProto.AuthReply>(
                                            this, METHODID_AUTHENTICATE)))
                    .addMethod(
                            getServerSideStreamingGetListStockQuotesMethod(),
                            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
                                    new MethodHandlers<
                                            com.lyyang.grpc.model.GreeterProto.Stock,
                                            com.lyyang.grpc.model.GreeterProto.StockQuote>(
                                            this, METHODID_SERVER_SIDE_STREAMING_GET_LIST_STOCK_QUOTES)))
                    .build();
        }
    }

    /**
     * <pre>
     * The greeter service definition.
     * </pre>
     */
    public static final class GreeterStub extends io.grpc.stub.AbstractAsyncStub<GreeterStub> {
        private GreeterStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected GreeterStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new GreeterStub(channel, callOptions);
        }

        /**
         * <pre>
         * Sends a greeting
         * </pre>
         */
        public void sayHello(com.lyyang.grpc.model.GreeterProto.HelloRequest request,
                             io.grpc.stub.StreamObserver<com.lyyang.grpc.model.GreeterProto.HelloReply> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(
                    getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void sayHelloAdmin(com.lyyang.grpc.model.GreeterProto.HelloRequest request,
                                  io.grpc.stub.StreamObserver<com.lyyang.grpc.model.GreeterProto.HelloReply> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(
                    getChannel().newCall(getSayHelloAdminMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void authenticate(com.lyyang.grpc.model.GreeterProto.AuthRequest request,
                                 io.grpc.stub.StreamObserver<com.lyyang.grpc.model.GreeterProto.AuthReply> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(
                    getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void serverSideStreamingGetListStockQuotes(com.lyyang.grpc.model.GreeterProto.Stock request,
                                                          io.grpc.stub.StreamObserver<com.lyyang.grpc.model.GreeterProto.StockQuote> responseObserver) {
            io.grpc.stub.ClientCalls.asyncServerStreamingCall(
                    getChannel().newCall(getServerSideStreamingGetListStockQuotesMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * <pre>
     * The greeter service definition.
     * </pre>
     */
    public static final class GreeterBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreeterBlockingStub> {
        private GreeterBlockingStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected GreeterBlockingStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new GreeterBlockingStub(channel, callOptions);
        }

        /**
         * <pre>
         * Sends a greeting
         * </pre>
         */
        public com.lyyang.grpc.model.GreeterProto.HelloReply sayHello(com.lyyang.grpc.model.GreeterProto.HelloRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(
                    getChannel(), getSayHelloMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.lyyang.grpc.model.GreeterProto.HelloReply sayHelloAdmin(com.lyyang.grpc.model.GreeterProto.HelloRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(
                    getChannel(), getSayHelloAdminMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.lyyang.grpc.model.GreeterProto.AuthReply authenticate(com.lyyang.grpc.model.GreeterProto.AuthRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(
                    getChannel(), getAuthenticateMethod(), getCallOptions(), request);
        }

        /**
         */
        public java.util.Iterator<com.lyyang.grpc.model.GreeterProto.StockQuote> serverSideStreamingGetListStockQuotes(
                com.lyyang.grpc.model.GreeterProto.Stock request) {
            return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
                    getChannel(), getServerSideStreamingGetListStockQuotesMethod(), getCallOptions(), request);
        }
    }

    /**
     * <pre>
     * The greeter service definition.
     * </pre>
     */
    public static final class GreeterFutureStub extends io.grpc.stub.AbstractFutureStub<GreeterFutureStub> {
        private GreeterFutureStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected GreeterFutureStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new GreeterFutureStub(channel, callOptions);
        }

        /**
         * <pre>
         * Sends a greeting
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<com.lyyang.grpc.model.GreeterProto.HelloReply> sayHello(
                com.lyyang.grpc.model.GreeterProto.HelloRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(
                    getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.lyyang.grpc.model.GreeterProto.HelloReply> sayHelloAdmin(
                com.lyyang.grpc.model.GreeterProto.HelloRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(
                    getChannel().newCall(getSayHelloAdminMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.lyyang.grpc.model.GreeterProto.AuthReply> authenticate(
                com.lyyang.grpc.model.GreeterProto.AuthRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(
                    getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_SAY_HELLO = 0;
    private static final int METHODID_SAY_HELLO_ADMIN = 1;
    private static final int METHODID_AUTHENTICATE = 2;
    private static final int METHODID_SERVER_SIDE_STREAMING_GET_LIST_STOCK_QUOTES = 3;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final GreeterImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_SAY_HELLO:
                    serviceImpl.sayHello((com.lyyang.grpc.model.GreeterProto.HelloRequest) request,
                            (io.grpc.stub.StreamObserver<com.lyyang.grpc.model.GreeterProto.HelloReply>) responseObserver);
                    break;
                case METHODID_SAY_HELLO_ADMIN:
                    serviceImpl.sayHelloAdmin((com.lyyang.grpc.model.GreeterProto.HelloRequest) request,
                            (io.grpc.stub.StreamObserver<com.lyyang.grpc.model.GreeterProto.HelloReply>) responseObserver);
                    break;
                case METHODID_AUTHENTICATE:
                    serviceImpl.authenticate((com.lyyang.grpc.model.GreeterProto.AuthRequest) request,
                            (io.grpc.stub.StreamObserver<com.lyyang.grpc.model.GreeterProto.AuthReply>) responseObserver);
                    break;
                case METHODID_SERVER_SIDE_STREAMING_GET_LIST_STOCK_QUOTES:
                    serviceImpl.serverSideStreamingGetListStockQuotes((com.lyyang.grpc.model.GreeterProto.Stock) request,
                            (io.grpc.stub.StreamObserver<com.lyyang.grpc.model.GreeterProto.StockQuote>) responseObserver);
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

    private static abstract class GreeterBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
        GreeterBaseDescriptorSupplier() {}

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return com.lyyang.grpc.model.GreeterProto.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("Greeter");
        }
    }

    private static final class GreeterFileDescriptorSupplier
            extends GreeterBaseDescriptorSupplier {
        GreeterFileDescriptorSupplier() {}
    }

    private static final class GreeterMethodDescriptorSupplier
            extends GreeterBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
        private final String methodName;

        GreeterMethodDescriptorSupplier(String methodName) {
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
            synchronized (GreeterGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                            .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
                            .addMethod(getSayHelloMethod())
                            .addMethod(getSayHelloAdminMethod())
                            .addMethod(getAuthenticateMethod())
                            .addMethod(getServerSideStreamingGetListStockQuotesMethod())
                            .build();
                }
            }
        }
        return result;
    }
}
