package dev.elma.users;

import dev.elma.stubs.Chat;
import dev.elma.stubs.chatGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.Scanner;

public class User {
    public static void main(String[] args) throws IOException {
        ManagedChannel localhost = ManagedChannelBuilder.forAddress("localhost", 2001).usePlaintext().build();
        chatGrpc.chatStub chatStub = chatGrpc.newStub(localhost);

        String username;
        String message;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Username : ");
        username=scanner.next();
        System.out.println(username+ " connected...");
        System.out.println("To disconnect write (disc) in message...");



       StreamObserver<Chat.request> send = chatStub.send(new StreamObserver<Chat.request>() {
            @Override
            public void onNext(Chat.request request) {
                String messageFrom = request.getMessageFrom();
                String content = request.getContent();
                System.out.println(messageFrom+" : "+content);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        });

       while (true){
           System.out.println("---------------------------------------------");
           System.out.print("Message To : ");
           String messageTo=scanner.next();
           scanner.nextLine();
           System.out.print("Message : ");
           message=scanner.nextLine();
           System.out.println(message);
           if(message.equals("disc")) {
               Chat.connect disconnect = Chat.connect.newBuilder().setUsername(username).build();
               chatStub.disconnectReq(disconnect, new StreamObserver<Chat.request>() {
                   @Override
                   public void onNext(Chat.request request) {
                       System.out.println(request.getContent());
                   }

                   @Override
                   public void onError(Throwable throwable) {

                   }

                   @Override
                   public void onCompleted() {

                   }
               });
               //System.in.read();
               break;
           }
           Chat.request request = Chat.request.newBuilder().setMessageFrom(username).setMessageTo(messageTo).setContent(message).build();
           send.onNext(request);
       }
    }
}
