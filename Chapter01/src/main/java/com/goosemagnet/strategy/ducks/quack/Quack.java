package com.goosemagnet.strategy.ducks.quack;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
