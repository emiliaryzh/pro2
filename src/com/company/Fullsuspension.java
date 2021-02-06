package com.company;

public class Fullsuspension {
    int speed;
    String brand;
    private String color = "Gradient";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    Fullsuspension(int speed, String brand) {
        this.speed = speed;
        this.brand = brand;

    }

    protected void print(String color) {
        System.out.println(color);
    }

    void printToo(String brand) {
        System.out.println(brand);
    }

    void printTooToo(int speed) {
        System.out.println(speed);
    }

}

