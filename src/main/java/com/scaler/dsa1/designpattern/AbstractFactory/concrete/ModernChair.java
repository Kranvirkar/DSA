package com.scaler.dsa1.designpattern.AbstractFactory.concrete;

import com.scaler.dsa1.designpattern.AbstractFactory.abstractinterface.Chair;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair.");
    }
}