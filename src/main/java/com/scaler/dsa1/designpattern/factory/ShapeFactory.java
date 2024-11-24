package com.scaler.dsa1.designpattern.factory;

public class ShapeFactory {

    public Shape getType(String type){
        if (type==null){
            return null;
        }
        if (type.equalsIgnoreCase("circle")){
            return new Circle();
        }else if (type.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }
}
