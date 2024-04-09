package com.hnvas.grpctracingdemo;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import net.devh.boot.grpc.server.advice.GrpcExceptionHandler;

@GrpcAdvice
@Slf4j
public class GrpcExceptionAdvice {

    @GrpcExceptionHandler(IllegalStateException.class)
    public StatusRuntimeException handleIllegalStateException(IllegalStateException ex) {
        log.error("{}: {}", ex.getMessage(), ex.getCause(), ex);
        return Status.INTERNAL.withDescription(ex.getMessage()).withCause(ex).asRuntimeException();
    }
}
