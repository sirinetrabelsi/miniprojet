package com.msg_gRPC.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */

/*@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: messaging.proto")*/
public final class ServiceMessagerieGrpc {

  private ServiceMessagerieGrpc() {}

  public static final String SERVICE_NAME = "gRPC.ServiceMessagerie";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.msg_gRPC.grpc.Message,
      com.msg_gRPC.grpc.Confirmation> getEnvoyerMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnvoyerMessage",
      requestType = com.msg_gRPC.grpc.Message.class,
      responseType = com.msg_gRPC.grpc.Confirmation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.msg_gRPC.grpc.Message,
      com.msg_gRPC.grpc.Confirmation> getEnvoyerMessageMethod() {
    io.grpc.MethodDescriptor<com.msg_gRPC.grpc.Message, com.msg_gRPC.grpc.Confirmation> getEnvoyerMessageMethod;
    if ((getEnvoyerMessageMethod = ServiceMessagerieGrpc.getEnvoyerMessageMethod) == null) {
      synchronized (ServiceMessagerieGrpc.class) {
        if ((getEnvoyerMessageMethod = ServiceMessagerieGrpc.getEnvoyerMessageMethod) == null) {
          ServiceMessagerieGrpc.getEnvoyerMessageMethod = getEnvoyerMessageMethod = 
              io.grpc.MethodDescriptor.<com.msg_gRPC.grpc.Message, com.msg_gRPC.grpc.Confirmation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.ServiceMessagerie", "EnvoyerMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.msg_gRPC.grpc.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.msg_gRPC.grpc.Confirmation.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceMessagerieMethodDescriptorSupplier("EnvoyerMessage"))
                  .build();
          }
        }
     }
     return getEnvoyerMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.msg_gRPC.grpc.Utilisateur,
      com.msg_gRPC.grpc.ListeMessages> getRecupererMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecupererMessages",
      requestType = com.msg_gRPC.grpc.Utilisateur.class,
      responseType = com.msg_gRPC.grpc.ListeMessages.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.msg_gRPC.grpc.Utilisateur,
      com.msg_gRPC.grpc.ListeMessages> getRecupererMessagesMethod() {
    io.grpc.MethodDescriptor<com.msg_gRPC.grpc.Utilisateur, com.msg_gRPC.grpc.ListeMessages> getRecupererMessagesMethod;
    if ((getRecupererMessagesMethod = ServiceMessagerieGrpc.getRecupererMessagesMethod) == null) {
      synchronized (ServiceMessagerieGrpc.class) {
        if ((getRecupererMessagesMethod = ServiceMessagerieGrpc.getRecupererMessagesMethod) == null) {
          ServiceMessagerieGrpc.getRecupererMessagesMethod = getRecupererMessagesMethod = 
              io.grpc.MethodDescriptor.<com.msg_gRPC.grpc.Utilisateur, com.msg_gRPC.grpc.ListeMessages>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.ServiceMessagerie", "RecupererMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.msg_gRPC.grpc.Utilisateur.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.msg_gRPC.grpc.ListeMessages.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceMessagerieMethodDescriptorSupplier("RecupererMessages"))
                  .build();
          }
        }
     }
     return getRecupererMessagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceMessagerieStub newStub(io.grpc.Channel channel) {
    return new ServiceMessagerieStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceMessagerieBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServiceMessagerieBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceMessagerieFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServiceMessagerieFutureStub(channel);
  }

  /**
   */
  public static abstract class ServiceMessagerieImplBase implements io.grpc.BindableService {

    /**
     */
    public void envoyerMessage(com.msg_gRPC.grpc.Message request,
        io.grpc.stub.StreamObserver<com.msg_gRPC.grpc.Confirmation> responseObserver) {
      asyncUnimplementedUnaryCall(getEnvoyerMessageMethod(), responseObserver);
    }

    /**
     */
    public void recupererMessages(com.msg_gRPC.grpc.Utilisateur request,
        io.grpc.stub.StreamObserver<com.msg_gRPC.grpc.ListeMessages> responseObserver) {
      asyncUnimplementedUnaryCall(getRecupererMessagesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnvoyerMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.msg_gRPC.grpc.Message,
                com.msg_gRPC.grpc.Confirmation>(
                  this, METHODID_ENVOYER_MESSAGE)))
          .addMethod(
            getRecupererMessagesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.msg_gRPC.grpc.Utilisateur,
                com.msg_gRPC.grpc.ListeMessages>(
                  this, METHODID_RECUPERER_MESSAGES)))
          .build();
    }
  }

  /**
   */
  public static final class ServiceMessagerieStub extends io.grpc.stub.AbstractStub<ServiceMessagerieStub> {
    private ServiceMessagerieStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceMessagerieStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceMessagerieStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceMessagerieStub(channel, callOptions);
    }

    /**
     */
    public void envoyerMessage(com.msg_gRPC.grpc.Message request,
        io.grpc.stub.StreamObserver<com.msg_gRPC.grpc.Confirmation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnvoyerMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void recupererMessages(com.msg_gRPC.grpc.Utilisateur request,
        io.grpc.stub.StreamObserver<com.msg_gRPC.grpc.ListeMessages> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRecupererMessagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServiceMessagerieBlockingStub extends io.grpc.stub.AbstractStub<ServiceMessagerieBlockingStub> {
    private ServiceMessagerieBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceMessagerieBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceMessagerieBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceMessagerieBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.msg_gRPC.grpc.Confirmation envoyerMessage(com.msg_gRPC.grpc.Message request) {
      return blockingUnaryCall(
          getChannel(), getEnvoyerMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.msg_gRPC.grpc.ListeMessages recupererMessages(com.msg_gRPC.grpc.Utilisateur request) {
      return blockingUnaryCall(
          getChannel(), getRecupererMessagesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServiceMessagerieFutureStub extends io.grpc.stub.AbstractStub<ServiceMessagerieFutureStub> {
    private ServiceMessagerieFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceMessagerieFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceMessagerieFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceMessagerieFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.msg_gRPC.grpc.Confirmation> envoyerMessage(
        com.msg_gRPC.grpc.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getEnvoyerMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.msg_gRPC.grpc.ListeMessages> recupererMessages(
        com.msg_gRPC.grpc.Utilisateur request) {
      return futureUnaryCall(
          getChannel().newCall(getRecupererMessagesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENVOYER_MESSAGE = 0;
  private static final int METHODID_RECUPERER_MESSAGES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceMessagerieImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceMessagerieImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENVOYER_MESSAGE:
          serviceImpl.envoyerMessage((com.msg_gRPC.grpc.Message) request,
              (io.grpc.stub.StreamObserver<com.msg_gRPC.grpc.Confirmation>) responseObserver);
          break;
        case METHODID_RECUPERER_MESSAGES:
          serviceImpl.recupererMessages((com.msg_gRPC.grpc.Utilisateur) request,
              (io.grpc.stub.StreamObserver<com.msg_gRPC.grpc.ListeMessages>) responseObserver);
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

  private static abstract class ServiceMessagerieBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceMessagerieBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.msg_gRPC.grpc.Messaging.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceMessagerie");
    }
  }

  private static final class ServiceMessagerieFileDescriptorSupplier
      extends ServiceMessagerieBaseDescriptorSupplier {
    ServiceMessagerieFileDescriptorSupplier() {}
  }

  private static final class ServiceMessagerieMethodDescriptorSupplier
      extends ServiceMessagerieBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceMessagerieMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceMessagerieGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceMessagerieFileDescriptorSupplier())
              .addMethod(getEnvoyerMessageMethod())
              .addMethod(getRecupererMessagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
