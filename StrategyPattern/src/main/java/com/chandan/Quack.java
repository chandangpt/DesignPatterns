package com.chandan;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack Quack.");
    }
}
