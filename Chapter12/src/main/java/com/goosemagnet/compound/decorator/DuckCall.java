package com.goosemagnet.compound.decorator;

public class DuckCall implements Quackable {

    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
