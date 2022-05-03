package ru.yandex.qa.tech_3.tasks.sub;

import ru.yandex.qa.tech_3.tasks.Task;
import ru.yandex.qa.tech_3.tasks.TaskStatus;

import java.util.ArrayList;
import java.util.List;

public class Epic extends Task {
    private List<SubTask> subTasks = new ArrayList<>();

    public Epic(String name, TaskStatus status, String description) {
        super(name, status, description);
    }

    public Epic(String name, TaskStatus status, String description, List<SubTask> subTasks) {
        super(name, status, description);
        this.subTasks = subTasks;
    }

    public List<SubTask> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(List<SubTask> subTasks) {
        this.subTasks = subTasks;
    }

    public void addSubTask(SubTask subTask) {
        this.subTasks.add(subTask);
    }
}
