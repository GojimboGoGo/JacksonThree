package com.askal.scraps;

import com.askal.scraps.access.BasePizzaDecorator;
import com.askal.scraps.access.PizzaAccess;
import com.askal.scraps.access.SauceDecorator;
import com.askal.scraps.access.ToppingsDecorator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    ObjectMapper objectMapper;

    PizzaTest() {
        this.objectMapper = new ObjectMapper();
    }

    @Test
    void getToppings() throws IOException {
        Pizza test = new Pizza();
        test.setToppings("Pepperoni and Olives");
        test.setHasThinCrust(false);
        test.setSauce("Tomato");

        System.out.println(objectMapper.writeValueAsString(test));
    }

    @Test
    void getToppingsRestrictedAccess() throws IOException {
        Pizza test = new Pizza();
        test.setToppings("Pepperoni and Olives");
        test.setHasThinCrust(false);
        test.setSauce("Tomato");
        test.setSecretIngredient("Onion powder");

        BasePizzaDecorator decorator = new ToppingsDecorator(test);

        System.out.println(objectMapper.writeValueAsString(decorator));

        assertEquals(test.getToppings(), decorator.getToppings());
        assertEquals(test.getSecretIngredient(), decorator.getSecretIngredient());
    }

    @Test
    void getToppingsAndSauceRestrictedAccess() throws IOException {
        Pizza test = new Pizza();
        test.setToppings("Pepperoni and Olives");
        test.setHasThinCrust(false);
        test.setSauce("Tomato");
        test.setSecretIngredient("Onion powder");

        BasePizzaDecorator decorator = new BasePizzaDecorator(test) {
            @JsonIgnore
            @Override
            public String getSauce() {
                return super.getSauce();
            }
            @JsonIgnore
            @Override
            public String getToppings() {
                return super.getToppings();
            }
        };

        System.out.println(objectMapper.writeValueAsString(decorator));

        assertEquals(test.getToppings(), decorator.getToppings());
        assertEquals(test.getSauce(), decorator.getSauce());
        assertEquals(test.getSecretIngredient(), decorator.getSecretIngredient());
    }
}