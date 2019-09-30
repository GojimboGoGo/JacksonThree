package com.askal.scraps.access;

import com.askal.scraps.Pizza;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class SauceDecorator extends BasePizzaDecorator {

    public SauceDecorator(Pizza pizza) {
        super(pizza);
    }

    @JsonIgnore
    @Override
    public String getSauce() {
        return super.getSauce();
    }
}
