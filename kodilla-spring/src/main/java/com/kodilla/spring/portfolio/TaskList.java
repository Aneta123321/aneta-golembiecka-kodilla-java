package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList() { //linijka 8 i 9  to konstruktor bezparametrowy, bo nie ma w nawiasie przekazane niczego, jest nic.
        // Punkt 1 zadania
        this.tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }
}

