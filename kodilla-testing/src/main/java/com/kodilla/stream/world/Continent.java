package com.kodilla.stream.world;

import java.util.List;

public class Continent {
    private List<Country> countries;
    private String continentName;
// konstruktor ma liste panstw , przekazuje liste panstw i liste kontynentow w kostruktorze
    public Continent(List<Country> countries, String continentName) {
        this.countries = countries;
        this.continentName = continentName;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
