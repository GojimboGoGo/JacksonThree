package com.askal.scraps;

import com.askal.scraps.access.PizzaAccess;

public class Pizza implements PizzaAccess {

    private String toppings;
    private boolean hasThinCrust;
    private String sauce;

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public boolean isHasThinCrust() {
        return hasThinCrust;
    }

    public void setHasThinCrust(boolean hasThinCrust) {
        this.hasThinCrust = hasThinCrust;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
}
