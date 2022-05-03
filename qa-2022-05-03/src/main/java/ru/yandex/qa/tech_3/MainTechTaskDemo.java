package ru.yandex.qa.tech_3;

import ru.yandex.qa.tech_3.service.ManagerService;
import ru.yandex.qa.tech_3.service.ManagerServiceImpl;
import ru.yandex.qa.tech_3.tasks.Task;
import ru.yandex.qa.tech_3.tasks.TaskStatus;
import ru.yandex.qa.tech_3.tasks.sub.Epic;
import ru.yandex.qa.tech_3.tasks.sub.SubTask;

/**
 * Техническое задание спринта №3
 */
public class MainTechTaskDemo {

    public static void main(String[] args) {
        ManagerService managerService = new ManagerServiceImpl();

        Task task = new Task("таск 1", TaskStatus.NEW, "новая таска");

        managerService.createTask(task);
        Task task1 = managerService.getTask(1);

        System.out.println(task1);

        Epic epic1 = new Epic("эпик 1", TaskStatus.NEW, "новый эпик");

        managerService.createEpic(epic1);

        SubTask subTask = new SubTask("подтаска 1", TaskStatus.NEW, "новая подтаска", epic1.getId());
        managerService.addSubTask(subTask);
    }
}
