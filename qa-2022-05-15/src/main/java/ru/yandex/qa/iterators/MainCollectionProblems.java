package ru.yandex.qa.iterators;

import java.util.ArrayList;
import java.util.List;

public class MainCollectionProblems {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Ваня"));
        people.add(new Person("Андрей"));
        people.add(new Person("Вася"));
        people.add(new Person("Игорь"));

        System.out.println(people);
        System.out.println("--------------------------");

        /*for (Person person : people) {
            if ("Игорь".equals(person.getName())) {
                people.remove(person);
            }
        }*/

        for (Person person : people) {
            if ("Игорь".equals(person.getName())) {
                people.add(new Person("Катя"));
            }
        }

        System.out.println(people);
    }

    static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
