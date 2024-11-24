package com.scaler.dsa1.designpattern.AbstractFactory.concrete;

import com.scaler.dsa1.designpattern.AbstractFactory.abstractinterface.Sofa;

// Concrete Product - Victorian Sofa
public class VictorianSofa implements Sofa {
    @Override
    public void relaxOn() {
        System.out.println("Relaxing on a Victorian sofa.");
    }
}