# Chat_App_GRPC
chat application   server/client with grpc
# Proto File
Protocol buffers (protobuf) are used as the Interface Definition Language (IDL) by default. The .proto file contains:

* The definition of the gRPC service.
* The messages sent between clients and servers.

# Define services
After compiling the proto file we should define the services as a java class or python class.

# Create Server GRPC
In this section, we try to deploy our services in localhost server with port 2001.
# Test With BloomRPC
* Configure Bloom

![ChatDef](https://user-images.githubusercontent.com/67378945/228085829-ebd6a059-8ad2-4ce0-9765-e0662813c5df.png)

* One To One Messages

![oneToOneMsg](https://user-images.githubusercontent.com/67378945/228085932-d5d16569-2212-4d7d-86c7-ce20d9395339.png)

* One To Many Messages

![oneToMany](https://user-images.githubusercontent.com/67378945/228086055-7ef92b03-e150-4e14-9ba0-ff3fcaefe9a2.jpg)

# Client GRPC
In this respo we also create client with java & python as bloomRpc client. 


