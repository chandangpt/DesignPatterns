package com.chandan.StarbuzzCoffee;

public class Chocolate extends AddOnDecorator {

    private Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
