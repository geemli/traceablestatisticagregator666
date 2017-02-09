package com.samsolutions.traceable.util;


import com.samsolutions.traceablestub.stub.Traceable;

import java.time.LocalDateTime;

/**
 * Created by dznor on 06.02.2017.
 */
public class TraceableProxyBean implements Traceable {

    private Traceable original;
    private Statistic statistic;

    public TraceableProxyBean(Traceable o, Statistic statistic) {
        this.original = o;
        this.statistic = statistic;
    }

    @Override
    public void doBusinessLogic(Object o) {
        long startTime = System.nanoTime();
        original.doBusinessLogic(o);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        Statistic.Info info = new Statistic.Info(duration, original.getClass().toString(), "doBusinessLogic", o.toString(), LocalDateTime.now());
        statistic.addValue(info);
    }

    @Override
    public Object calculateBusinessValue() {
        long startTime = System.nanoTime();
        original.calculateBusinessValue();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        Statistic.Info info = new Statistic.Info(duration, original.getClass().toString(), "calculateBusinessValue", "null", LocalDateTime.now());
        statistic.addValue(info);
        return null;
    }
}
