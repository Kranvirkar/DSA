package com.scaler.dsa1.designpattern.AbstractFactory.concretefactory;

import com.scaler.dsa1.designpattern.AbstractFactory.Abstfactory.FurnitureFactory;
import com.scaler.dsa1.designpattern.AbstractFactory.abstractinterface.Chair;
import com.scaler.dsa1.designpattern.AbstractFactory.abstractinterface.Sofa;
import com.scaler.dsa1.designpattern.AbstractFactory.concrete.ModernChair;
import com.scaler.dsa1.designpattern.AbstractFactory.concrete.ModernSofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}