package com.leonardof108.taskmanager;

import com.leonardof108.task.Task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private static final String FILE_NAME = "tasks.txt";
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
        loadTasksFromFile();
    }

    public void addTask(String title, String description) {
        tasks.add(new Task(title, description));
        saveTasksToFile();
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 1 && index <= tasks.size()) {
            tasks.get(index - 1).markAsCompleted();
            saveTasksToFile();
            System.out.println("Task marked as completed!");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private void saveTasksToFile() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(tasks);
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    private void loadTasksFromFile() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                tasks = (List<Task>) in.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error loading tasks: " + e.getMessage());
            }
        }
    }
}
