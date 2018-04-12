package com.kole;

public class Car extends Vehicle {

    private int wheels;
    private String type;

    public Car(int engine, int roof, int wheels, String type) {
        super(engine, roof);
        this.wheels = wheels;
        this.type = type;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    int gear;
    public void changeGearUp(int gear){
        if (gear > 5){
            System.out.println("We are in fifth gear you can only lower down");
        } else {
            gear++;
            System.out.println("Gear changed to " + gear);
        }
    }

    public void changeGearDown (int gear){

    }

    int speed = 0;

    public void increaseSpeed(){
        speed++;
        System.out.println("Car is moving ");
    }
}
