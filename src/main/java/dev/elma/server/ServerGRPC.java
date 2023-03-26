package dev.elma.server;

import dev.elma.services.ServicesDefine;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class ServerGRPC {
    public static void main(String[] args) throws InterruptedException, IOException {
        ServerBuilder.forPort(2001).addService(new ServicesDefine()).build().start().awaitTermination();
    }
}
