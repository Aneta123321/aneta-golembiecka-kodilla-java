package com.kodilla.patterns.factory.tasks;

public interface Task {

    void executeTask(); // metoda wykonujaca zadanie, czyli nie zwwraca nic, czyli void
    String getTaskName(); // zwrqca Stringa, pobiera nazwe zadania i zwraca
    boolean isTaskExecuted();

}
