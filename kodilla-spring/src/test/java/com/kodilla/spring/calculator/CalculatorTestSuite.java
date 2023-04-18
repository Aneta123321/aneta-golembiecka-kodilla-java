package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){ //metoda testowa, zeby byla to nad nia musi byc dopisana adnotacja @Test, wiec dopisuje

//Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        // When
        double addResult = calculator.add(5,10);
        double subResult = calculator.sub(10,5);
        double mulResult = calculator.mul(5,10);
        double divResult = calculator.div(50,10);

        //Then
        Assertions.assertEquals(15, addResult);
        Assertions.assertEquals(5, subResult);
        Assertions.assertEquals(50, mulResult);
        Assertions.assertEquals(5, divResult);


    }
}
