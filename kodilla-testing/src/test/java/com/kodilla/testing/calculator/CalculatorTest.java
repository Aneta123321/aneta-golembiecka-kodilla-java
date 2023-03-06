package com.kodilla.testing.calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        //given
        Calculator calculator = new Calculator();
        //when & then
        Assert.assertEquals(0, calculator.add(0, 0), 0);
        Assert.assertEquals(10.0, calculator.add(5.0, 5.0), 0);
        Assert.assertEquals(10.0, calculator.add(0, 10.0), 0);
        Assert.assertEquals(10.0, calculator.add(10.0, 0), 0);
        Assert.assertEquals(-10.0, calculator.add(-15, 5), 0);
        Assert.assertEquals(0, calculator.add(-5, 5), 0);
        Assert.assertFalse(10 == calculator.add(1, 2));
    }

    @Test
    void subtract() {
        //given
        Calculator calculator = new Calculator();
        //when & then
        Assert.assertEquals(0, calculator.subtract(0, 0), 0);
        Assert.assertEquals(0, calculator.subtract(5.0, 5.0), 0);
        Assert.assertEquals(-10, calculator.subtract(0, 10.0), 0);
        Assert.assertEquals(10.0, calculator.subtract(10.0, 0), 0);
        Assert.assertEquals(-20.0, calculator.subtract(-15, 5), 0);
        Assert.assertEquals(-10.0, calculator.subtract(-5, 5), 0);

    }
}