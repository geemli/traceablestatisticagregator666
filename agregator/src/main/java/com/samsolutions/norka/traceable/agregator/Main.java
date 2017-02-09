package com.samsolutions.norka.traceable.agregator;

import com.samsolutions.traceable.util.Statistic;
import com.samsolutions.traceable.util.config.UtilConfig;
import com.samsolutions.traceablestub.stub.Traceable;
import com.samsolutions.traceablestub.stub.config.TraceableConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by dznor on 08.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        ConfigurableApplicationContext
        context.register(TraceableConfig.class);
        context.register(UtilConfig.class);
        context.refresh();

        Traceable obj = (Traceable) context.getBean("traceableImplStub");
        Traceable obj2 = (Traceable) context.getBean("traceableImplStub2");
        Traceable obj3 = (Traceable) context.getBean("traceableImplStub3");
        Statistic statistic = (Statistic) context.getBean("statistic");

        obj.calculateBusinessValue();
        obj2.calculateBusinessValue();
        obj3.calculateBusinessValue();
        obj.doBusinessLogic(1);
        obj2.doBusinessLogic(1.);
        obj3.doBusinessLogic("abc");

//        statistic.showLongestOperations();
        context.close();
    }
}
