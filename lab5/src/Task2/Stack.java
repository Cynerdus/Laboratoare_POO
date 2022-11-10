package Task2;

import Task1.Task;

import java.util.ArrayList;

public class Stack implements Container{

    private ArrayList<Task> taskList = new ArrayList<>();

    @Override
    public Task pop() {
        return (taskList.isEmpty() ? null : taskList.remove(taskList.size() - 1));
    }

    @Override
    public void push(Task task) {
        taskList.add(task);
    }

    @Override
    public int size() {
        return taskList.size();
    }

    @Override
    public boolean isEmpty() {
        return taskList.isEmpty();
    }

    @Override
    public void transferFrom(Container container) {
        Task task;
        while ((task = container.pop()) != null) {
            this.push(task);
        }
    }

    @Override
    public ArrayList<Task> getTasks() {
        return taskList;
    }
}
