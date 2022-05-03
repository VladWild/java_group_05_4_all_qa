package ru.yandex.qa.tech_3.tasks.sub;

import ru.yandex.qa.tech_3.tasks.Task;
import ru.yandex.qa.tech_3.tasks.TaskStatus;

public class SubTask extends Task {
    private int epicId;

    public SubTask(String name, TaskStatus status, String description) {
        super(name, status, description);
    }

    public SubTask(String name, TaskStatus status, String description, int epicId) {
        super(name, status, description);
        this.epicId = epicId;
    }

    public int getEpicId() {
        return epicId;
    }

    public void setEpicId(int epicId) {
        this.epicId = epicId;
    }
}
