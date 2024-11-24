package com.scaler.dsa1.designpattern.singleton;

public class Singleton {

    public static void main(String[] args) {
        DBConfiguration db =DBConfiguration.getInstance();
        DBConfiguration db1 =DBConfiguration.getInstance();

        System.out.println(db.getUrl());
        System.out.println(db.hashCode());
        System.out.println(db1.hashCode());
    }
}
