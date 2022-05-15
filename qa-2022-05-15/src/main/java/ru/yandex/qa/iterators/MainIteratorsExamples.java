package ru.yandex.qa.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MainIteratorsExamples {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Ваня"));
        people.add(new Person("Андрей"));
        people.add(new Person("Вася"));
        people.add(new Person("Игорь"));

        System.out.println(people);
        System.out.println("-------------------------");

        Iterator<Person> iterator = people.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if ("Игорь".equals(person.getName())) {
                iterator.remove();
            }
        }

        System.out.println(people);
        System.out.println("-------------------------");

        ArrayList<Person> people2 = new ArrayList<>();

        people2.add(new Person("Ваня"));
        people2.add(new Person("Андрей"));
        people2.add(new Person("Вася"));
        people2.add(new Person("Игорь"));

        System.out.println(people2);
        System.out.println("-------------------------");

        ListIterator<Person> personListIterator = people2.listIterator();
        while (personListIterator.hasNext()) {
            Person person = personListIterator.next();
            if ("Игорь".equals(person.getName())) {
                personListIterator.add(new Person("Катя"));
            }
        }

        System.out.println(people2);
        System.out.println("--------------------------------------------------");

        ListIterator<Person> personListIterator2 = people2.listIterator();

        while (personListIterator2.hasNext()) {
            Person person = personListIterator2.next();
            System.out.println(person);
            if ("Катя".equals(person.getName())) {
                System.out.println("-------------------------");
                while (personListIterator2.hasPrevious()) {
                    Person previous = personListIterator2.previous();
                    System.out.println(previous);
                }
                break;
            }
        }
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
