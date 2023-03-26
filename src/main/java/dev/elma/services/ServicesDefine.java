package dev.elma.services;

import dev.elma.stubs.Chat;
import dev.elma.stubs.chatGrpc;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;

public class ServicesDefine extends chatGrpc.chatImplBase {
    HashMap<String,StreamObserver<Chat.request>> clientsBuff=new HashMap<>();

    @Override
    public void disconnectReq(Chat.connect request, StreamObserver<Chat.request> responseObserver) {
        String username = request.getUsername();
        clientsBuff.get(username).onCompleted();
        clientsBuff.remove(username);
        Chat.request serverRep = Chat.request.newBuilder().setMessageFrom("Server").setContent("You are disconnected").build();
        responseObserver.onNext(serverRep);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<Chat.request> send(StreamObserver<Chat.request> responseObserver) {
        return new StreamObserver<Chat.request>() {
            @Override
            public void onNext(Chat.request request) {
                String messageFrom = request.getMessageFrom();
                String messageTo = request.getMessageTo();
                if(!clientsBuff.containsKey(messageFrom)){
                    clientsBuff.put(messageFrom,responseObserver);
                }
                if(messageTo.isEmpty()){
                    for(String s : clientsBuff.keySet()){
                        if(!s.equals(messageFrom))
                            clientsBuff.get(s).onNext(request);
                    }
                }
                else if(clientsBuff.containsKey(messageTo)){
                    StreamObserver<Chat.request> requestStreamObserver = clientsBuff.get(messageTo);
                    requestStreamObserver.onNext(request);
                }
            }
            @Override
            public void onError(Throwable throwable) {}
            @Override
            public void onCompleted() {}
        };
    }
}
