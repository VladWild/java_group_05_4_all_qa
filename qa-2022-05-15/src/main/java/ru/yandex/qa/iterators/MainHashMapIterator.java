package ru.yandex.qa.iterators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MainHashMapIterator {

    public static void main(String[] args) {
        Map<String, Person> personMap = new HashMap<>();
        personMap.put("Ваня", new Person("Ваня")); //удалится
        personMap.put("Игорь", new Person("Игорь"));
        personMap.put("Илья", new Person("Илья"));
        personMap.put("Ваня", new Person("Иван"));
        System.out.println(personMap);
        System.out.println("----------------------------------");

        Set<Map.Entry<String, Person>> entries = personMap.entrySet();
        for (Map.Entry<String, Person> entry : entries) {
            System.out.println(entry + ": ключ = " + entry.getKey() + "; значения = " + entry.getValue());
        }
        System.out.println("----------------------------------");

        Set<String> names = personMap.keySet();
        System.out.println(names);

        new LinkedHashSet<>(); //гарантирует последовательность

        System.out.println("----------------------------------");

        Collection<Person> values = personMap.values();
        System.out.println(values);

        personMap.remove("Ваня");
        System.out.println(personMap);

        personMap.remove("Игорь", new Person("Игорь"));
        System.out.println(personMap);
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
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
