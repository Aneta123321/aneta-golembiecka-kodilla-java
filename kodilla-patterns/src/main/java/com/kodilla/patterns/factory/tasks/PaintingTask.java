package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean isExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.isExecuted = false;
    }

    @Override
    public void executeTask() {
        isExecuted = true;

    }

    @Override
    public String getTaskName() {
        return taskName; // po zostawieniu nulla
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}

