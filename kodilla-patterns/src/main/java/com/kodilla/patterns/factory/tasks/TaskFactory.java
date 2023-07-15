package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task createTask(final String taskType) {
        return switch (taskType) {
            case DRIVING -> new DrivingTask(DRIVING + "task", "Warszawa", "Car");
            case PAINTING -> new PaintingTask(PAINTING + "task", "Red", "House");
            case SHOPPING -> new ShoppingTask(SHOPPING + "task", "shoes", 2.00);
            default -> null;

        };
    }
}
