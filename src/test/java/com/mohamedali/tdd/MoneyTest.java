package com.mohamedali.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void testMultiplication(){
        // create a dollar
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.getAmount());
        // mutating object
//        five.times(3);
//        assertEquals(15, five.getAmount());

        // solution - create a new object
        // times() returns a new Dollar object
        product = five.times(3);
        assertEquals(15, product.getAmount());
    }


}
