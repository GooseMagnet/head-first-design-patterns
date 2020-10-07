package com.goosemagnet.strategy.ducks.quack;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
