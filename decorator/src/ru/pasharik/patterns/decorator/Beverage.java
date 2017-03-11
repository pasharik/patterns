package ru.pasharik.patterns.decorator;

/**
 * Created by pasharik on 05.10.15.
 */
public abstract class Beverage {
    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
