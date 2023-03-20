package dev.elma.services;

import dev.elma.stubs.Chat;
import dev.elma.stubs.chatGrpc;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.HashMap;

public class SevicesDefine extends chatGrpc.chatImplBase {
    HashMap<String,StreamObserver<Chat.request>> clientsBuff=new HashMap<>();
    @Override
    public void connectReq(Chat.connect request, StreamObserver<Chat.request> responseObserver) {
        String username = request.getUsername();
        clientsBuff.put(username,responseObserver);
        Chat.request serverResp= Chat.request.newBuilder().setMessageFrom("Server").setContent("200").build();
        responseObserver.onNext(serverResp);
        responseObserver.onCompleted();
    }

    @Override
    public void disconnectReq(Chat.connect request, StreamObserver<Chat.request> responseObserver) {
        String username = request.getUsername();
        clientsBuff.remove(username);
        Chat.request serverRep = Chat.request.newBuilder().setMessageFrom("server").setContent("200").build();
        responseObserver.onNext(serverRep);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<Chat.request> send(StreamObserver<Chat.request> responseObserver) {
        return new StreamObserver<Chat.request>() {
            @Override
            public void onNext(Chat.request request) {
                request.getMessageTo()
                if(){

                }
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        }
    }
}
