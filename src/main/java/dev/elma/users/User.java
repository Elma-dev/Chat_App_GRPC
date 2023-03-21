package dev.elma.users;

import dev.elma.stubs.Chat;
import dev.elma.stubs.chatGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        ManagedChannel localhost = ManagedChannelBuilder.forAddress("localhost", 2001).usePlaintext().build();
        chatGrpc.chatStub chatStub = chatGrpc.newStub(localhost);

        String username;
        String message;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Username : ");
        username=scanner.next();
        System.out.println(username+ " connected...");
        System.out.println("To disconnect write (quit) in message...");

       /* StreamObserver<Chat.request> send = chatStub.send(new StreamObserver<Chat.request>() {
            @Override
            public void onNext(Chat.request request) {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        });

        */



    }
}
