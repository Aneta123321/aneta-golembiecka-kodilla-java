package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() { // geter pobiera wartosci: imie, nazwisko
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
