package com.scaler.dsa1.designpattern.factory;

public class Client {

    public static void main(String[] args) {
        ShapeFactory shapeFactory =new ShapeFactory();

        Shape square = shapeFactory.getType("square");
        Shape circle = shapeFactory.getType("circle");

        square.draw();
        circle.draw();


    }
}
