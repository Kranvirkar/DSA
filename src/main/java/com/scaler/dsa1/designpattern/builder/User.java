package com.scaler.dsa1.designpattern.builder;

public class User {
    //Required field
    private final String userName;
    private final String firstName;
    //optional field
    private final int age;
    private final String address;
    private final long phoneNo;

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    private User(UserBuilder builder) {
        this.userName = builder.userName;
        this.firstName = builder.firstName;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNo = builder.phoneNo;
    }

    public static class UserBuilder{
        private final String userName;
        private final String firstName;

        private  int age;

        private  String address;
        private  long phoneNo;
        //Required field
        public UserBuilder(String userName, String firstName) {
            this.userName = userName;
            this.firstName = firstName;
        }

        public UserBuilder Age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder Address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder PhoneNo(long phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public User Builder(){
            if(age<18){
                throw new RuntimeException("Age should above 18");
            }
            return new User(this);
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
