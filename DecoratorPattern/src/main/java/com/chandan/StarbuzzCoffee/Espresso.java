package com.chandan.StarbuzzCoffee;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 2.0;
    }
}
