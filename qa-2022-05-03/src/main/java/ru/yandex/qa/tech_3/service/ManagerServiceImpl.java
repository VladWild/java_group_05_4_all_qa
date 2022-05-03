package ru.yandex.qa.tech_3.service;

import ru.yandex.qa.tech_3.tasks.Task;
import ru.yandex.qa.tech_3.tasks.sub.Epic;
import ru.yandex.qa.tech_3.tasks.sub.SubTask;

import java.util.HashMap;
import java.util.Map;

public class ManagerServiceImpl implements ManagerService {

    private Map<Integer, Task> tasks = new HashMap<>();
    private Map<Integer, SubTask> subTasks = new HashMap<>();
    private Map<Integer, Epic> epics = new HashMap<>();

    private int i = 0;

    @Override
    public void createTask(Task task) {
        task.setId(++i);
        tasks.put(task.getId(), task);
    }

    @Override
    public Task getTask(int id) {
        return tasks.get(id);
    }

    @Override
    public void createEpic(Epic epic1) {
        epic1.setId(++i);
        epics.put(epic1.getId(), epic1);
    }

    @Override
    public void addSubTask(SubTask subTask) {
        Epic epic = epics.get(subTask.getId());
        if (epic != null) {
            epic.addSubTask(subTask);
        }
        subTask.setId(++i);
        subTasks.put(subTask.getId(), subTask);
        updateEpicStatus(epic.getId());
    }

    private void updateEpicStatus(Integer epicId) {

    }
}
