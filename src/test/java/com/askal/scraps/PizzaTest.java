package com.askal.scraps;

import com.askal.scraps.access.PizzaAccess;
import com.askal.scraps.access.ToppingsDecorator;
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

        PizzaAccess decorator = new ToppingsDecorator(test);

        System.out.println(objectMapper.writeValueAsString(decorator));
    }
}