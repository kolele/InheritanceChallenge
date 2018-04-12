package com.kole;

public class Vehicle {
    private int engine;
    private int roof;

    public Vehicle(int engine, int roof) {
        this.engine = engine;
        this.roof = roof;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getRoof() {
        return roof;
    }

    public void setRoof(int roof) {
        this.roof = roof;
    }
}
