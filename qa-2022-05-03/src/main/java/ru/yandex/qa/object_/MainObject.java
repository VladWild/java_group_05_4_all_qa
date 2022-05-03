package ru.yandex.qa.object_;

import java.lang.reflect.Method;

/**
 * 2) Класс Object и его методы - equals, hashCode, toString. Сравнение объектов в Java
 */
public class MainObject {

    public static void main(String[] args) {
        Object object = new Object();

        boolean equals = object.equals(new Object());
        System.out.println(equals);

        boolean equals1 = object.equals(object);
        System.out.println(equals1);

        int hashCode = object.hashCode();
        System.out.println(hashCode);

        String string = object.toString();
        System.out.println(string);

        Class<?> aClass = object.getClass();
        String simpleName = aClass.getSimpleName();
        System.out.println(simpleName);

        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
