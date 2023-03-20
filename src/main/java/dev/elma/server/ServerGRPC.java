package dev.elma.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class ServerGRPC {
    public static void main(String[] args) {
        ServerBuilder.forPort(2001).addService()
    }
}
