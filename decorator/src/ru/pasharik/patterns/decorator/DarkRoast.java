package ru.pasharik.patterns.decorator;

/**
 * Created by pasharik on 05.10.15.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
