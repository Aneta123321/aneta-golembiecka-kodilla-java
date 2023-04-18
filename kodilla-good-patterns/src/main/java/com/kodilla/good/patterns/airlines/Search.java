package com.kodilla.good.patterns.airlines;

import java.util.Set;
import java.util.stream.Collectors;

public class Search {
    /* public void searchTo(Set<Flight> flights, String airPort) { //wyszukiwarka do i z "puszczo" przez streama
         flights.stream().
                 filter(l -> l.getAirPortTo().equals(airPort))
                 .forEach(System.out::println); //stworz streama samem
     }

     public void searchFrom(Set<Flight> flights, String airPort) {
         flights.stream()
                 .filter(l -> l.getAirPortFrom().equals(airPort))
                 .forEach(System.out::println);
     }

     public void searchThrough(Set<Flight> flights, String airPortFrom, String airPortThrough, String airPortTo) {
         Set<Flight> list1 = flights.stream().filter(l -> l.getAirPortFrom().equals(airPortFrom)).filter(l -> l.getAirPortTo().equals(airPortThrough)).collect(Collectors.toSet());
         Set<Flight> list2 = flights.stream().filter(l -> l.getAirPortFrom().equals(airPortThrough)).filter(l -> l.getAirPortTo().equals(airPortTo)).collect(Collectors.toSet());
         for (Flight flight1 : list1) {
             for (Flight flight2 : list2) {
                 if (flight1.getAirPortTo().equals(flight2.getAirPortFrom())) { // w petli wyswietla przyloty z gdan do krk
                     System.out.println(flight1);
                     System.out.println(flight2);
                 }
             }
         }
     }

 */
    public void searchTo(Set<Flight> flights, String airPort) {
        flights.stream()
                .filter(flight -> flight.getAirPortTo().equals(airPort))
                .forEach(System.out::println);
    }

    public void searchFrom(Set<Flight> flights, String airPort) {
        flights.stream()
                .filter(flight -> flight.getAirPortFrom().equals(airPort))
                .forEach(System.out::println);
    }

    public void searchThrough(Set<Flight> flights, String airPortFrom, String airPortThrough, String airPortTo) {
        Set<Flight> listFromToThrough = flights.stream()
                .filter(flight -> flight.getAirPortFrom().equals(airPortFrom) && flight.getAirPortTo().equals(airPortThrough))
                .collect(Collectors.toSet()); //sam stream nie zwraca nic i to jest wrzucenie do kolekcji tego co zostalo ze streama po odfiltrowaniu streama
        Set<Flight> listThroughToTo = flights.stream()
                .filter(flight -> flight.getAirPortFrom().equals(airPortThrough) && flight.getAirPortTo().equals(airPortTo))
                .collect(Collectors.toSet());

        if (listFromToThrough.size() != 0 && listThroughToTo.size() != 0) {
            for (Flight flight1 : listFromToThrough) {
                for (Flight flight2 : listThroughToTo) {
                    if (flight1.getAirPortTo().equals(flight2.getAirPortFrom())) {
                        System.out.println(flight1);
                        System.out.println(flight2);
                    }
                }
            }
        } else {
            System.out.println("Brak wskazanego połączenia");
        }
    }
}
