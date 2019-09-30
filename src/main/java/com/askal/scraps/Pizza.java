package com.askal.scraps;

public class Pizza {

    private String toppings;
    private boolean hasThinCrust;
    private String sauce;
    private String secretIngredient;

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

    public String getSecretIngredient() {
        return secretIngredient;
    }

    public void setSecretIngredient(String secretIngredient) {
        this.secretIngredient = secretIngredient;
    }
}
