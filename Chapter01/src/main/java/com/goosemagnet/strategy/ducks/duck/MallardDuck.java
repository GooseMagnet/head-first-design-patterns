package com.goosemagnet.strategy.ducks.duck;

import com.goosemagnet.strategy.ducks.fly.FlyWithWings;
import com.goosemagnet.strategy.ducks.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
