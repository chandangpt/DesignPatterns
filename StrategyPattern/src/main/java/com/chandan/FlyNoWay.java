package com.chandan;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot fly.");
    }
}
