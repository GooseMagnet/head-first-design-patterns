package com.goosemagnet.factorymethod.pizza;

import com.goosemagnet.factorymethod.pizza.store.ChicagoStylePizzaStore;
import com.goosemagnet.factorymethod.pizza.store.NYStylePizzaStore;
import com.goosemagnet.factorymethod.pizza.store.PizzaStore;
import com.goosemagnet.factorymethod.pizza.type.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
