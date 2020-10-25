package com.goosemagnet.abstractfactory.pizza.store;

import com.goosemagnet.abstractfactory.pizza.ingredientfactories.NYPizzaIngredientFactory;
import com.goosemagnet.abstractfactory.pizza.ingredientfactories.PizzaIngredientFactory;
import com.goosemagnet.abstractfactory.pizza.type.*;

public class NYPizzaStore  extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
