package com.askal.scraps.access;

import com.askal.scraps.Pizza;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class ToppingsDecorator extends BasePizzaDecorator {

    public ToppingsDecorator(Pizza pizza) {
        super(pizza);
    }

    @JsonIgnore
    @Override
    public String getToppings() {
        return super.getToppings();
    }
}
