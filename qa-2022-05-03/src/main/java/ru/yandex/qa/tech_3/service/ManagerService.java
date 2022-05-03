package ru.yandex.qa.tech_3.service;

import ru.yandex.qa.tech_3.tasks.Task;
import ru.yandex.qa.tech_3.tasks.sub.Epic;
import ru.yandex.qa.tech_3.tasks.sub.SubTask;

public interface ManagerService {

    void createTask(Task task);

    Task getTask(int id);

    void createEpic(Epic epic1);

    void addSubTask(SubTask subTask);
}
