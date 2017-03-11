package ru.pasharik.patterns.decorator;

/**
 * Created by pasharik on 05.10.15.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
