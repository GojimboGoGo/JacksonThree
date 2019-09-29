package com.askal.scraps.access;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ToppingsDecorator extends BasePizzaDecorator {

    public ToppingsDecorator(PizzaAccess pizza) {
        this.pizza = pizza;
    }

    @JsonIgnore
    @Override
    public String getToppings() {
        return super.getToppings();
    }
}
