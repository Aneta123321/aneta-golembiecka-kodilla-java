package com.kodilla.good.patterns.airlines;

import java.util.Set;

public class AirLinesApp { // aplikacje pisze i zaczynam od utw listy lotow
    public static void main(String[] args) {
        ListOfFlight listOfFlight = new ListOfFlight();
        Set<Flight> flights = listOfFlight.getTheList();
        Search search = new Search(); // tw klase search alt enter
        System.out.println("\nFlights from Gdańsk:");
        search.searchFrom(flights, "Gdańsk");
        System.out.println("\nFlights to Wrocław:");
        search.searchTo(flights, "Wrocław");
        System.out.println("\nFlights from Gdańsk to Wrocław through Kraków:");
        search.searchThrough(flights, "Gdańsk", "Kraków", "Wrocław");
    }

}
