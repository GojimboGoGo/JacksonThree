package com.askal.scraps.access;

import com.askal.scraps.Pizza;

public abstract class BasePizzaDecorator extends Pizza {

    protected BasePizzaDecorator() {
        this(new Pizza());
    }

    public BasePizzaDecorator(Pizza pizza) {
        this.setHasThinCrust(pizza.isHasThinCrust());
        this.setSauce(pizza.getSauce());
        this.setToppings(pizza.getToppings());
        this.setSecretIngredient(pizza.getSecretIngredient());
    }

    public String getToppings() {
        return super.getToppings();
    }

    public boolean isHasThinCrust() {
        return super.isHasThinCrust();
    }

    public String getSauce() {
        return super.getSauce();
    }
}
