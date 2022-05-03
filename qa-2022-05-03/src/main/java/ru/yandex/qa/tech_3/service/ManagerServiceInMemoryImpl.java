package ru.yandex.qa.tech_3.service;

import ru.yandex.qa.tech_3.task.Task;
import ru.yandex.qa.tech_3.task.sub.Epic;
import ru.yandex.qa.tech_3.task.sub.SubTask;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerServiceInMemoryImpl implements ManagerService {
    private Map<Integer, Task> tasks = new HashMap<>();
    private Map<Integer, Epic> epics = new HashMap<>();
    private Map<Integer, SubTask> subTasks = new HashMap<>();

    private int i = 0;

    @Override
    public void createTask(Task task) {
        task.setId(++i);
        tasks.put(task.getId(), task);
    }

    @Override
    public Collection<Task> getTasks() {
        return tasks.values();
    }

    @Override
    public void createEpic(Epic epic) {
        epic.setId(++i);
        epics.put(epic.getId(), epic);
    }

    @Override
    public Collection<Epic> getEpics() {
        return epics.values();
    }

    @Override
    public void addSubTask(SubTask subTask) {
        int subTaskId = ++this.i;
        subTask.setId(subTaskId);
        subTasks.put(subTaskId, subTask);
        int epicIdofSubTask = subTask.getEpicId();
        Epic epic = epics.get(epicIdofSubTask);
        if (epic != null) {
            epic.addSubTask(subTask);
        }
    }

    @Override
    public List<SubTask> getSubTask(int epicId) {
        Epic epic = epics.get(epicId);
        return epic.getSubTasks();
    }
}
