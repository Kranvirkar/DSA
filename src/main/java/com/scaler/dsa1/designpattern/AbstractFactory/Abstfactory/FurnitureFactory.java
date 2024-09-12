package com.scaler.dsa1.designpattern.AbstractFactory.Abstfactory;

import com.scaler.dsa1.designpattern.AbstractFactory.abstractinterface.Chair;
import com.scaler.dsa1.designpattern.AbstractFactory.abstractinterface.Sofa;

// Abstract Factory
public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}