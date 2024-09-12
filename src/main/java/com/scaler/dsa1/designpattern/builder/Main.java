package com.scaler.dsa1.designpattern.builder;

public class Main {
    public static void main(String[] args) {
    User user= new User.UserBuilder("kingrk","Kiran")
            .Age(19)
            .Address("24- shahaji nagar")
            .PhoneNo(9623240111L)
            .Builder();

        System.out.println(user.toString());
    }
}
