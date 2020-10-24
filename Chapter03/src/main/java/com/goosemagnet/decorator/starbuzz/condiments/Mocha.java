package com.goosemagnet.decorator.starbuzz.condiments;

import com.goosemagnet.decorator.starbuzz.beverages.Beverage;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
