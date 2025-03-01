package com.leonardof108.task;

import java.io.Serializable;

public class Task implements Serializable {
    private static final long serialVersionUID = 1L; // Add a version ID
    private String title;
    private String description;
    private boolean completed;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return (completed ? "[✔] " : "[ ] ") + title + ": " + description;
    }
}
