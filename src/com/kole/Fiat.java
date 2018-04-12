package com.kole;

public class Fiat extends Car {

    private String model;
    private int numberOfGears;
    private String color;

    public Fiat(int engine, int roof, int wheels, String type, String model, int numberOfGears, String color) {
        super(engine, roof, wheels, type);
        this.model = model;
        this.numberOfGears = numberOfGears;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
