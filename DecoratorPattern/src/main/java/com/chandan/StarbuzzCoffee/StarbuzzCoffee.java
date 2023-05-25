package com.chandan.StarbuzzCoffee;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        beverage = new Chocolate(beverage);
        beverage = new Chocolate(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());
    }
}
