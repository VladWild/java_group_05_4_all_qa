package ru.yandex.qa.tech_3.service;

import ru.yandex.qa.tech_3.task.Task;
import ru.yandex.qa.tech_3.task.sub.Epic;
import ru.yandex.qa.tech_3.task.sub.SubTask;

import java.util.Collection;
import java.util.List;

public interface ManagerService {

    void createTask(Task task);

    Collection<Task> getTasks();

    void createEpic(Epic epic);

    Collection<Epic> getEpics();

    void addSubTask(SubTask subTask);

    List<SubTask> getSubTask(int epicId);
}
