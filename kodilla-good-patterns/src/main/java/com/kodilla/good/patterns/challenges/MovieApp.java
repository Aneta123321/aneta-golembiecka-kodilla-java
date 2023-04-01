package com.kodilla.good.patterns.challenges;

public class MovieApp {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet()
                .forEach(value -> value.getValue().stream()
                .forEach(title -> System.out.print(title + "!")));
    }
}
