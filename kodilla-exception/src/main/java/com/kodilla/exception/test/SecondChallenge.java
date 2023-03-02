package com.kodilla.exception.test;
/*Zadanie: obsługa wyjątku
Wewnątrz modułu kodilla-exception w pakiecie com.kodilla.exception.test utwórz klasę SecondChallenge:

 */

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) throws Exception {
        if (x >= 2 || x < 1 || y == 1.5) {
            throw new Exception();
        }
        return "Done!";
    }
}
