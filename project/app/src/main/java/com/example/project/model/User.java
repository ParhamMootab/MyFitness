package com.example.project.model;

public class User {
    private int ID;
    private String fullName;
    private String userName;
    private String password;
    private double weight;
    private int height;

    public User(int ID, String fullName, String userName, String password, double weight, int height) {
        this.ID = ID;
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.weight = weight;
        this.height = height;
    }

    public User(String userName, String password){
        this.password = password;
        this.userName = userName;
    }

    public User() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
