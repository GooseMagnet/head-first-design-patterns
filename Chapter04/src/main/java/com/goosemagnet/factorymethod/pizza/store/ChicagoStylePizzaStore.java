package com.goosemagnet.factorymethod.pizza.store;

import com.goosemagnet.factorymethod.pizza.type.Pizza;
import com.goosemagnet.factorymethod.pizza.type.chicago.ChicagoStyleCheesePizza;
import com.goosemagnet.factorymethod.pizza.type.chicago.ChicagoStyleClamPizza;
import com.goosemagnet.factorymethod.pizza.type.chicago.ChicagoStylePepperoniPizza;
import com.goosemagnet.factorymethod.pizza.type.chicago.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
