package com.kole;

public class Fiat extends Car {
    private int numberOfGears;
    private String colour;

    public Fiat(int numberOfGears, String colour) {
        super(true, true, 4, true);
        this.numberOfGears = numberOfGears;
        this.colour = colour;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void steerLeft() {
        super.steerLeft();
        System.out.println("Stilo is steering left ma dawg");
    }

    @Override
    public void steerRight() {
        super.steerRight();
        System.out.println("Stilo is steering right ma dawg");
    }

    @Override
    public void increaseSpeed() {
        super.increaseSpeed();
        System.out.println("Increasing speed");
    }

    @Override
    public void decreaseSpeed() {
        super.decreaseSpeed();
        System.out.println("Decreasing speed");
    }

    public void changeGearUp(){
        System.out.println("Gear up!");
    }

    public void changeGearDown(){
        System.out.println("Gear down");
    }
}
