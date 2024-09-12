package com.scaler.dsa1.designpattern.prototyperegistry;

public interface Prototype<T> {
    T clone();
}