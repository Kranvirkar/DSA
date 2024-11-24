package com.scaler.dsa1.designpattern.singleton;

public class DBConfiguration {

    private static DBConfiguration instance;
    private final String url;
    private final String userName;
    private final String password;

    private DBConfiguration(){
        this.url ="jdbc:mysql://localhost:3306/mydatabase";
        this.userName="root";
        this.password="root";
    }

    public synchronized static DBConfiguration getInstance(){
        if (instance==null){
            instance= new DBConfiguration();
        }
        return instance;
    }

    public String getUrl() {
        return url;
    }

    public String getUserName() {
        return userName;
    }
}
