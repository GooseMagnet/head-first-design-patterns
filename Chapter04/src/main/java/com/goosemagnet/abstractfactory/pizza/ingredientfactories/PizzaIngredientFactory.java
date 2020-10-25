package com.goosemagnet.abstractfactory.pizza.ingredientfactories;

import com.goosemagnet.abstractfactory.pizza.ingredients.*;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
