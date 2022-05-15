package ru.yandex.qa.generics_java;

import java.util.ArrayList;

/*
 * В чем проблема?
 * Java не знает об типе, хранящемся в коллекции -> без дженериков надо делать постоянно Cast
 *
 * Без дженериков может быть java.lang.ClassCastException
 * Дженерики защищают нас от этого исключения -> программа даже не скомпилируется
 */
public class MainGenericsProblemsResolve {

    public static void main(String[] args) {
        ArrayList peoples = new ArrayList();

        peoples.add(new Person("Ваня"));
        peoples.add(new Person("Илья"));
        peoples.add(new Person("Саша"));

        System.out.println(peoples);

        Object person = peoples.get(0);
        System.out.println(person);

        Person person1 = (Person) person;
        System.out.println(person1.getName());

        System.out.println("-------------------------------");

        ArrayList arrayList = new ArrayList();
        arrayList.add(4554L);
        arrayList.add("Как дела?");
        arrayList.add(new Person("Катя"));
        arrayList.add(new Object());

        System.out.println(arrayList);

        Person person2 = (Person) arrayList.get(1);
        System.out.println(person2);
    }

    static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
