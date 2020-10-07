package com.goosemagnet.strategy.ducks.duck;

import com.goosemagnet.strategy.ducks.fly.FlyNoWay;
import com.goosemagnet.strategy.ducks.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
