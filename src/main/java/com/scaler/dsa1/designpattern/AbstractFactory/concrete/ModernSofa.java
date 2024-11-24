package com.scaler.dsa1.designpattern.AbstractFactory.concrete;

import com.scaler.dsa1.designpattern.AbstractFactory.abstractinterface.Sofa;

// Concrete Product - Modern Sofa
public class ModernSofa implements Sofa {
    @Override
    public void relaxOn() {
        System.out.println("Relaxing on a modern sofa.");
    }
}