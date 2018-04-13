package com.kole;

public class Main {

    public static void main(String[] args) {
        Fiat koletov = new Fiat(5,"Black");

        koletov.changeGearDown();
        koletov.decreaseSpeed();

    }
}
