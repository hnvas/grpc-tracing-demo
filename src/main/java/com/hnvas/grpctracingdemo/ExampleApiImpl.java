package com.hnvas.grpctracingdemo;

import com.hnvas.grpctracingdemo.grpc.ExampleApiGrpc;
import com.hnvas.grpctracingdemo.grpc.HelloReply;
import com.hnvas.grpctracingdemo.grpc.HelloRequest;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@Slf4j
public class ExampleApiImpl extends ExampleApiGrpc.ExampleApiImplBase {

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        log.info("Received a request on sayHello");
        HelloReply reply = HelloReply.newBuilder()
                .setMessage("Hello ==> " + request.getName())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void sayHelloError(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        log.info("Received a request on sayHelloError");
        throw new IllegalStateException("This should not happen");
    }
}
