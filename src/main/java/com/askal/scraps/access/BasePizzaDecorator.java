package com.askal.scraps.access;

import com.askal.scraps.Pizza;

public abstract class BasePizzaDecorator implements PizzaAccess {

    protected PizzaAccess pizza;

    protected BasePizzaDecorator() {
        this(new Pizza());
    }

    protected BasePizzaDecorator(PizzaAccess pizza) {
        this.pizza = pizza;
    }

    public String getToppings() {
        return pizza.getToppings();
    }

    public boolean isHasThinCrust() {
        return pizza.isHasThinCrust();
    }

    public String getSauce() {
        return pizza.getSauce();
    }
}
