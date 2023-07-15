package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void testShoppingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.createTask(TaskFactory.SHOPPING);
        boolean beforeExecution = shoppingTask.isTaskExecuted();
        shoppingTask.executeTask();
        boolean afterExecution = shoppingTask.isTaskExecuted();

        //Then
        Assertions.assertEquals("SHOPPINGtask", shoppingTask.getTaskName());
        Assertions.assertFalse(beforeExecution);
        Assertions.assertTrue(afterExecution);
        Assertions.assertTrue(shoppingTask instanceof ShoppingTask);
    }

    @Test
    void testPaintingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.createTask(TaskFactory.PAINTING);
        boolean beforeExecution = paintingTask.isTaskExecuted();
        paintingTask.executeTask();
        boolean afterExecution = paintingTask.isTaskExecuted();

        //Then
        Assertions.assertEquals("PAINTINGtask", paintingTask.getTaskName());
        Assertions.assertFalse(beforeExecution);
        Assertions.assertTrue(afterExecution);
        Assertions.assertTrue(paintingTask instanceof PaintingTask);
    }

    @Test
    void testDrivingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.createTask(TaskFactory.DRIVING);
        boolean beforeExecution = drivingTask.isTaskExecuted();
        drivingTask.executeTask();
        boolean afterExecution = drivingTask.isTaskExecuted();

        //Then
        Assertions.assertEquals("DRIVINGtask", drivingTask.getTaskName());
        Assertions.assertFalse(beforeExecution);
        Assertions.assertTrue(afterExecution);
        Assertions.assertTrue(drivingTask instanceof DrivingTask);
    }

    @Test
    void testNullTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task nullTask = taskFactory.createTask("");

        //Then
        Assertions.assertNull(nullTask);
        Assertions.assertThrows(NullPointerException.class, () -> nullTask.getTaskName());
    }


}

