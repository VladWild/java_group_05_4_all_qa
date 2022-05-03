package ru.yandex.qa.tech_3;

import ru.yandex.qa.tech_3.service.ManagerService;
import ru.yandex.qa.tech_3.service.ManagerServiceDbImpl;
import ru.yandex.qa.tech_3.service.ManagerServiceInMemoryImpl;
import ru.yandex.qa.tech_3.task.Task;
import ru.yandex.qa.tech_3.task.TaskStatus;
import ru.yandex.qa.tech_3.task.sub.Epic;
import ru.yandex.qa.tech_3.task.sub.SubTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Техническое задание спринта №3
 */
public class MainTechTaskDemo {

    public static void main(String[] args) {

        ManagerService managerService = new ManagerServiceInMemoryImpl();

        Task task = new Task("новый таск", TaskStatus.NEW, "самый новый таск");
        Task task2 = new Task("новый таск 2", TaskStatus.IN_PROGRESS, "новый таск #2");

        managerService.createTask(task);
        managerService.createTask(task2);

        Collection<Task> tasks = managerService.getTasks();
        System.out.println(tasks);

        Epic epic = new Epic("новый эпик", TaskStatus.NEW, "самый новый");
        managerService.createEpic(epic);

        Collection<Epic> epics = managerService.getEpics();
        System.out.println(epics);

        SubTask subTask = new SubTask("новая подзадача", TaskStatus.NEW, "самая новая подзадача", epic.getId());
    }
}
