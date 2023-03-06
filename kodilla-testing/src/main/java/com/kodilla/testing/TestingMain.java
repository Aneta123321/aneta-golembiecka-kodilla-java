package com.kodilla.testing;


import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");
        Calculator calculator = new Calculator();
        if (calculator.add(5, 5) == 10) {
            System.out.println("Test for add 5 + 5: OK");
        } else {
            System.out.println("Test for add 5 + 5: ERROR");
        }
        if (calculator.subtract(10, 10) == 0) {
            System.out.println("Test for add 10 - 10: OK");
        } else {
            System.out.println("Test for add 10 - 10: ERROR");
        }
    }
}
