package com.kodilla.exception.test;

public class FlightApp {
    public static void main(String[] args) {

        Airport airport = new Airport();
        try {
            airport.findFilght(new Flight("Warszawa", "Londyn"));
        } catch (RouteNotFoundException e) {
            System.out.println("Wrong airport name or airport is not available at this moment !!!");

        }
    }
}
