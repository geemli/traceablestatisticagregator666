package com.samsolutions.traceablestub.stub.config;

import com.samsolutions.traceablestub.stub.Traceable;
import com.samsolutions.traceablestub.stub.TraceableImplStub;
import com.samsolutions.traceablestub.stub.TraceableImplStub2;
import com.samsolutions.traceablestub.stub.TraceableImplStub3;
import org.springframework.context.annotation.Bean;

public class TraceableConfig {

    @Bean(name = "traceableImplStub")
    public Traceable getTraceableImplStub() {
        return new TraceableImplStub();
    }

    @Bean(name = "traceableImplStub2")
    public Traceable getTraceableImplStub2() {
        return new TraceableImplStub2();
    }

    @Bean(name = "traceableImplStub3")
    public Traceable getTraceableImplStub3() {
        return new TraceableImplStub3();
    }

}
