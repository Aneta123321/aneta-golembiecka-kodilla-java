package com.kodilla.spring.intro.shape;

public class Triangle extends Figure { //trojkat rozszerza(dziedziczy po klasie Figure. Klasa nadrzedna jest klasa Figure
    // w klasie trojkat jest nadpisana metoda draw

    @Override
    public void draw() {
        System.out.println("This is a triangle");
    }
}


