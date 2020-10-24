package com.goosemagnet.decorator.starbuzz.condiments;

import com.goosemagnet.decorator.starbuzz.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
