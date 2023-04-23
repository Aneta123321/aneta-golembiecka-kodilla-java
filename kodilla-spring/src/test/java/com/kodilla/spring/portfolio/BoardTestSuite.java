package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class BoardTestSuite {

    @Test
    public void testBeanExist() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //When
        boolean beanBoardExists = context.containsBean("board");
        boolean beanToDoListExists = context.containsBean("toDoList");
        boolean beanInProgressListExists = context.containsBean("inProgressList");
        boolean beanDoneListExists = context.containsBean("doneList");

        //Then
        Assertions.assertTrue(beanBoardExists);
        Assertions.assertTrue(beanToDoListExists);
        Assertions.assertTrue(beanInProgressListExists);
        Assertions.assertTrue(beanDoneListExists);

    }

    @Test
    @DisplayName("Czy dodane zadanie można odczytać")
    public void testIfAddedTasksCouldRead() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio"); // wpisuje sciezke com.kodilla.spring.portfolio z lewej, w ktorej sa beany(klasy)

        //When
        Board board = (Board) context.getBean("board");

        List<String> tasksToDoList = board.getToDoList().getTasks();
        tasksToDoList.add("Zadanie 1 dla ToDoList");
        tasksToDoList.add("Zadanie 2 dla ToDoList");

        List<String> tasksInProgressList = board.getInProgressList().getTasks();
        tasksInProgressList.add("Zadanie 1 dla InProgressList");

        List<String> tasksDoneList = board.getDoneList().getTasks();
        tasksDoneList.add("Zadanie 1 dla DoneList");
        tasksDoneList.add("Zadanie 2 dla DoneList");
        tasksDoneList.add("Zadanie 3 dla DoneList");

        //Then
        Assertions.assertEquals(2, tasksToDoList.size());
        Assertions.assertEquals("Zadanie 2 dla ToDoList", tasksToDoList.get(1));
        Assertions.assertEquals(1, tasksInProgressList.size());
        Assertions.assertEquals("Zadanie 1 dla InProgressList", tasksInProgressList.get(0));
        Assertions.assertEquals(3, tasksDoneList.size());
        Assertions.assertEquals("Zadanie 3 dla DoneList", tasksDoneList.get(2));
    }


}

