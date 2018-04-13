package com.kole;

public class Vehicle {
    private boolean isMoveable;
    private boolean isPassangerType;

    public Vehicle(boolean isMoveable, boolean isPassangerType) {
        this.isMoveable = isMoveable;
        this.isPassangerType = isPassangerType;
    }

    public boolean isMoveable() {
        return isMoveable;
    }

    public void setMoveable(boolean moveable) {
        isMoveable = moveable;
    }

    public boolean isPassangerType() {
        return isPassangerType;
    }

    public void setPassangerType(boolean passangerType) {
        isPassangerType = passangerType;
    }

}
