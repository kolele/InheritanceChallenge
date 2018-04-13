package com.kole;

public class Car extends Vehicle {
    private int numberOfWheels;
    private boolean hasRoof;

    public Car(boolean isMoveable, boolean isPassangerType, int numberOfWheels, boolean hasRoof) {
        super(isMoveable, isPassangerType);
        this.numberOfWheels = numberOfWheels;
        this.hasRoof = hasRoof;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isHasRoof() {
        return hasRoof;
    }

    public void setHasRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
    }

    public void steerLeft(){

    }

    public void steerRight(){

    }

    public void increaseSpeed(){

    }

    public void decreaseSpeed(){

    }
}
