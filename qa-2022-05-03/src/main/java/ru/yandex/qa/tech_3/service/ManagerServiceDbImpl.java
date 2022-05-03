package ru.yandex.qa.tech_3.service;

import ru.yandex.qa.tech_3.task.Task;
import ru.yandex.qa.tech_3.task.sub.Epic;
import ru.yandex.qa.tech_3.task.sub.SubTask;

import java.util.Collection;
import java.util.List;

public class ManagerServiceDbImpl implements ManagerService {

    @Override
    public void createTask(Task task) {
        //some code
    }

    @Override
    public Collection<Task> getTasks() {
        return null;
    }

    @Override
    public void createEpic(Epic epic) {

    }

    @Override
    public Collection<Epic> getEpics() {
        return null;
    }

    @Override
    public void addSubTask(SubTask subTask) {

    }

    @Override
    public List<SubTask> getSubTask(int epicId) {
        return null;
    }
}
