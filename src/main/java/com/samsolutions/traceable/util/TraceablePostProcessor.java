package com.samsolutions.traceable.util;

import com.samsolutions.traceable.Traceable;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TraceablePostProcessor implements BeanPostProcessor {

//    private static final Logger LOG = LoggerFactory.getLogger(TraceablePostProcessor.class);

    @Autowired
    Statistic statistic;

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        if (o instanceof Traceable) {
            System.out.println("Inside post process before initialization: " + s);
        }
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        if (o instanceof Traceable) {
            System.out.println("Inside post process after initialization: " + s);
        }
        System.out.println("Bean '" + s + "' created : " + o.toString());
        return o;
    }
}
