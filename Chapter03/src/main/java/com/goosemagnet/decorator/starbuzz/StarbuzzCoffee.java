package com.goosemagnet.decorator.starbuzz;

import com.goosemagnet.decorator.starbuzz.beverages.Beverage;
import com.goosemagnet.decorator.starbuzz.beverages.DarkRoast;
import com.goosemagnet.decorator.starbuzz.beverages.Espresso;
import com.goosemagnet.decorator.starbuzz.beverages.HouseBlend;
import com.goosemagnet.decorator.starbuzz.condiments.Mocha;
import com.goosemagnet.decorator.starbuzz.condiments.Soy;
import com.goosemagnet.decorator.starbuzz.condiments.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
