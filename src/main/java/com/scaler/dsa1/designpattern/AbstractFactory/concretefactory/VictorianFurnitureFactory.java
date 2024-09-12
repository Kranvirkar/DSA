package com.scaler.dsa1.designpattern.AbstractFactory.concretefactory;

import com.scaler.dsa1.designpattern.AbstractFactory.Abstfactory.FurnitureFactory;
import com.scaler.dsa1.designpattern.AbstractFactory.abstractinterface.Chair;
import com.scaler.dsa1.designpattern.AbstractFactory.abstractinterface.Sofa;
import com.scaler.dsa1.designpattern.AbstractFactory.concrete.VictorianChair;
import com.scaler.dsa1.designpattern.AbstractFactory.concrete.VictorianSofa;

// Concrete Factory - Victorian Furniture Factory
public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}