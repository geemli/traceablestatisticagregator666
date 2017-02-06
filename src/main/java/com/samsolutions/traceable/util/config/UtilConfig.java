package com.samsolutions.traceable.util.config;

import com.samsolutions.traceable.util.Statistic;
import com.samsolutions.traceable.util.TraceablePostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;

/**
 * Created by dima on 06.02.2017.
 */
public class UtilConfig {

    @Bean(name = "traceableBeanPostProcessor")
    public BeanPostProcessor getTraceablBeanPostProcessor() {
        return new TraceablePostProcessor();
    }

    @Bean(name = "statistic")
    public Statistic getStatistic() {
        return new Statistic();
    }
}
