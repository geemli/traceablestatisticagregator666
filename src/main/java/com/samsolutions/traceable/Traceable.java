package com.samsolutions.traceable;

public interface Traceable<T> {

    public void doBusinessLogic(T t);

    public T calculateBusinessValue();

}
