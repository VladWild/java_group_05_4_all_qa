package ru.yandex.qa.object_;

import java.lang.reflect.Method;

/**
 * 2) Класс Object и его методы - equals, hashCode, toString. Сравнение объектов в Java
 */
public class MainObject {

    public static void main(String[] args) {
        //equals
        Object object1 = new Object();
        Object object2 = new Object();
        boolean equals = object1.equals(object2);
        System.out.println(equals);
        boolean equals2 = object1.equals(object1);
        System.out.println(equals2);

        //hashCode
        Object object3 = new Object();
        int hashCode = object3.hashCode();
        System.out.println(hashCode);

        //toString
        Object object4 = new Object();
        String str = object4.toString();
        System.out.println(str);

        //getClass()
        Object object5 = new Object();
        Class<?> aClass = object5.getClass();
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());

        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
