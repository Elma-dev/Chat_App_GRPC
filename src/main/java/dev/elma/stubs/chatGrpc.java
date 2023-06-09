package dev.elma.stubs;

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
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: chat.proto")
public final class chatGrpc {

  private chatGrpc() {}

  public static final String SERVICE_NAME = "chat";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dev.elma.stubs.Chat.request,
      dev.elma.stubs.Chat.request> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "send",
      requestType = dev.elma.stubs.Chat.request.class,
      responseType = dev.elma.stubs.Chat.request.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<dev.elma.stubs.Chat.request,
      dev.elma.stubs.Chat.request> getSendMethod() {
    io.grpc.MethodDescriptor<dev.elma.stubs.Chat.request, dev.elma.stubs.Chat.request> getSendMethod;
    if ((getSendMethod = chatGrpc.getSendMethod) == null) {
      synchronized (chatGrpc.class) {
        if ((getSendMethod = chatGrpc.getSendMethod) == null) {
          chatGrpc.getSendMethod = getSendMethod = 
              io.grpc.MethodDescriptor.<dev.elma.stubs.Chat.request, dev.elma.stubs.Chat.request>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "chat", "send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.elma.stubs.Chat.request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.elma.stubs.Chat.request.getDefaultInstance()))
                  .setSchemaDescriptor(new chatMethodDescriptorSupplier("send"))
                  .build();
          }
        }
     }
     return getSendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.elma.stubs.Chat.connect,
      dev.elma.stubs.Chat.request> getConnectReqMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "connectReq",
      requestType = dev.elma.stubs.Chat.connect.class,
      responseType = dev.elma.stubs.Chat.request.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.elma.stubs.Chat.connect,
      dev.elma.stubs.Chat.request> getConnectReqMethod() {
    io.grpc.MethodDescriptor<dev.elma.stubs.Chat.connect, dev.elma.stubs.Chat.request> getConnectReqMethod;
    if ((getConnectReqMethod = chatGrpc.getConnectReqMethod) == null) {
      synchronized (chatGrpc.class) {
        if ((getConnectReqMethod = chatGrpc.getConnectReqMethod) == null) {
          chatGrpc.getConnectReqMethod = getConnectReqMethod = 
              io.grpc.MethodDescriptor.<dev.elma.stubs.Chat.connect, dev.elma.stubs.Chat.request>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chat", "connectReq"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.elma.stubs.Chat.connect.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.elma.stubs.Chat.request.getDefaultInstance()))
                  .setSchemaDescriptor(new chatMethodDescriptorSupplier("connectReq"))
                  .build();
          }
        }
     }
     return getConnectReqMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.elma.stubs.Chat.connect,
      dev.elma.stubs.Chat.request> getDisconnectReqMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "disconnectReq",
      requestType = dev.elma.stubs.Chat.connect.class,
      responseType = dev.elma.stubs.Chat.request.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.elma.stubs.Chat.connect,
      dev.elma.stubs.Chat.request> getDisconnectReqMethod() {
    io.grpc.MethodDescriptor<dev.elma.stubs.Chat.connect, dev.elma.stubs.Chat.request> getDisconnectReqMethod;
    if ((getDisconnectReqMethod = chatGrpc.getDisconnectReqMethod) == null) {
      synchronized (chatGrpc.class) {
        if ((getDisconnectReqMethod = chatGrpc.getDisconnectReqMethod) == null) {
          chatGrpc.getDisconnectReqMethod = getDisconnectReqMethod = 
              io.grpc.MethodDescriptor.<dev.elma.stubs.Chat.connect, dev.elma.stubs.Chat.request>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chat", "disconnectReq"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.elma.stubs.Chat.connect.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.elma.stubs.Chat.request.getDefaultInstance()))
                  .setSchemaDescriptor(new chatMethodDescriptorSupplier("disconnectReq"))
                  .build();
          }
        }
     }
     return getDisconnectReqMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static chatStub newStub(io.grpc.Channel channel) {
    return new chatStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static chatBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new chatBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static chatFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new chatFutureStub(channel);
  }

  /**
   */
  public static abstract class chatImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *bi-directional stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<dev.elma.stubs.Chat.request> send(
        io.grpc.stub.StreamObserver<dev.elma.stubs.Chat.request> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendMethod(), responseObserver);
    }

    /**
     * <pre>
     *request of connection
     * </pre>
     */
    public void connectReq(dev.elma.stubs.Chat.connect request,
        io.grpc.stub.StreamObserver<dev.elma.stubs.Chat.request> responseObserver) {
      asyncUnimplementedUnaryCall(getConnectReqMethod(), responseObserver);
    }

    /**
     * <pre>
     *request of disconnect
     * </pre>
     */
    public void disconnectReq(dev.elma.stubs.Chat.connect request,
        io.grpc.stub.StreamObserver<dev.elma.stubs.Chat.request> responseObserver) {
      asyncUnimplementedUnaryCall(getDisconnectReqMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                dev.elma.stubs.Chat.request,
                dev.elma.stubs.Chat.request>(
                  this, METHODID_SEND)))
          .addMethod(
            getConnectReqMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dev.elma.stubs.Chat.connect,
                dev.elma.stubs.Chat.request>(
                  this, METHODID_CONNECT_REQ)))
          .addMethod(
            getDisconnectReqMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dev.elma.stubs.Chat.connect,
                dev.elma.stubs.Chat.request>(
                  this, METHODID_DISCONNECT_REQ)))
          .build();
    }
  }

  /**
   */
  public static final class chatStub extends io.grpc.stub.AbstractStub<chatStub> {
    private chatStub(io.grpc.Channel channel) {
      super(channel);
    }

    private chatStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected chatStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new chatStub(channel, callOptions);
    }

    /**
     * <pre>
     *bi-directional stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<dev.elma.stubs.Chat.request> send(
        io.grpc.stub.StreamObserver<dev.elma.stubs.Chat.request> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *request of connection
     * </pre>
     */
    public void connectReq(dev.elma.stubs.Chat.connect request,
        io.grpc.stub.StreamObserver<dev.elma.stubs.Chat.request> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConnectReqMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *request of disconnect
     * </pre>
     */
    public void disconnectReq(dev.elma.stubs.Chat.connect request,
        io.grpc.stub.StreamObserver<dev.elma.stubs.Chat.request> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisconnectReqMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class chatBlockingStub extends io.grpc.stub.AbstractStub<chatBlockingStub> {
    private chatBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private chatBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected chatBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new chatBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *request of connection
     * </pre>
     */
    public dev.elma.stubs.Chat.request connectReq(dev.elma.stubs.Chat.connect request) {
      return blockingUnaryCall(
          getChannel(), getConnectReqMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *request of disconnect
     * </pre>
     */
    public dev.elma.stubs.Chat.request disconnectReq(dev.elma.stubs.Chat.connect request) {
      return blockingUnaryCall(
          getChannel(), getDisconnectReqMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class chatFutureStub extends io.grpc.stub.AbstractStub<chatFutureStub> {
    private chatFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private chatFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected chatFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new chatFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *request of connection
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.elma.stubs.Chat.request> connectReq(
        dev.elma.stubs.Chat.connect request) {
      return futureUnaryCall(
          getChannel().newCall(getConnectReqMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *request of disconnect
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.elma.stubs.Chat.request> disconnectReq(
        dev.elma.stubs.Chat.connect request) {
      return futureUnaryCall(
          getChannel().newCall(getDisconnectReqMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONNECT_REQ = 0;
  private static final int METHODID_DISCONNECT_REQ = 1;
  private static final int METHODID_SEND = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final chatImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(chatImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONNECT_REQ:
          serviceImpl.connectReq((dev.elma.stubs.Chat.connect) request,
              (io.grpc.stub.StreamObserver<dev.elma.stubs.Chat.request>) responseObserver);
          break;
        case METHODID_DISCONNECT_REQ:
          serviceImpl.disconnectReq((dev.elma.stubs.Chat.connect) request,
              (io.grpc.stub.StreamObserver<dev.elma.stubs.Chat.request>) responseObserver);
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
        case METHODID_SEND:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.send(
              (io.grpc.stub.StreamObserver<dev.elma.stubs.Chat.request>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class chatBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    chatBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dev.elma.stubs.Chat.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("chat");
    }
  }

  private static final class chatFileDescriptorSupplier
      extends chatBaseDescriptorSupplier {
    chatFileDescriptorSupplier() {}
  }

  private static final class chatMethodDescriptorSupplier
      extends chatBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    chatMethodDescriptorSupplier(String methodName) {
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
      synchronized (chatGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new chatFileDescriptorSupplier())
              .addMethod(getSendMethod())
              .addMethod(getConnectReqMethod())
              .addMethod(getDisconnectReqMethod())
              .build();
        }
      }
    }
    return result;
  }
}
