package com.goosemagnet.factorymethod.pizza.store;

import com.goosemagnet.factorymethod.pizza.type.Pizza;
import com.goosemagnet.factorymethod.pizza.type.newyork.NYStyleCheesePizza;
import com.goosemagnet.factorymethod.pizza.type.newyork.NYStyleClamPizza;
import com.goosemagnet.factorymethod.pizza.type.newyork.NYStylePepperoniPizza;
import com.goosemagnet.factorymethod.pizza.type.newyork.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
