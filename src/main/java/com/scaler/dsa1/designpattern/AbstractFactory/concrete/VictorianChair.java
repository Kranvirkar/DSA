package com.scaler.dsa1.designpattern.AbstractFactory.concrete;

import com.scaler.dsa1.designpattern.AbstractFactory.abstractinterface.Chair;

// Concrete Product - Victorian Chair
public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair.");
    }
}