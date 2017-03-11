package ru.pasharik.patterns.decorator;

/**
 * Created by pasharik on 05.10.15.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
