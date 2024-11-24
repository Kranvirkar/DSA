package com.scaler.dsa1.designpattern.AbstractFactory;

import com.scaler.dsa1.designpattern.AbstractFactory.Abstfactory.FurnitureFactory;
import com.scaler.dsa1.designpattern.AbstractFactory.abstractinterface.Chair;
import com.scaler.dsa1.designpattern.AbstractFactory.abstractinterface.Sofa;
import com.scaler.dsa1.designpattern.AbstractFactory.concretefactory.ModernFurnitureFactory;
import com.scaler.dsa1.designpattern.AbstractFactory.concretefactory.VictorianFurnitureFactory;

// Client
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // Create Modern Furniture Factory
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();

        // Use Modern Furniture
        modernChair.sitOn();   // Output: Sitting on a modern chair.
        modernSofa.relaxOn();  // Output: Relaxing on a modern sofa.

        // Create Victorian Furniture Factory
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();

        // Use Victorian Furniture
        victorianChair.sitOn();   // Output: Sitting on a Victorian chair.
        victorianSofa.relaxOn();  // Output: Relaxing on a Victorian sofa.
    }
}
