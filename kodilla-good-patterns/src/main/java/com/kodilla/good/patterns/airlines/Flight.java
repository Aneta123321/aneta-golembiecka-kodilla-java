package com.kodilla.good.patterns.airlines;

import java.util.Objects;

public class Flight {
    private String airPortFrom;
    private String airPortTo;

    public Flight(String airPortFrom, String airPortTo) {
        this.airPortFrom = airPortFrom;
        this.airPortTo = airPortTo;
    }

    public String getAirPortFrom() {
        return airPortFrom;
    }

    public String getAirPortTo() {
        return airPortTo;
    }

    @Override
    public String toString() {
        return "AirPortFrom=" + airPortFrom + ", AirPortTo=" + airPortTo;
    }

    @Override  // wygenerowanie equals and hashcode alt insert: czy obiekty sa sobie rowne.
    // Jesli klasa obiektu jest rozna od innej klasy obiektu to zwracane jest false.
    // hashcode wylicza sume kontrolna dla tych 2 pol
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(airPortFrom, flight.airPortFrom) && Objects.equals(airPortTo, flight.airPortTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airPortFrom, airPortTo);
    }


}
