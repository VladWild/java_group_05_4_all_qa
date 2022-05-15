package ru.yandex.qa.generics_java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 *                Object
 *                  |
 *                Animal
 *         Cat               Dog
 *          |
 *        Kitten
 */
public class MainGenericWildCard {

    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(new Animal("животное 1"), new Animal("животное 2"));
        List<Dog> dogs = Arrays.asList(new Dog("Rex"), new Dog("Тузик"));
        List<Cat> cats = Arrays.asList(new Cat("кот 1"), new Cat("Гарфилд"));
        List<Kitten> kittens = Arrays.asList(new Kitten("Мурзик"), new Kitten("Марсик"));

        printAnimal(animals);
        printAnimal(dogs);
        printAnimal(cats);
        printAnimal(kittens);

        //printCat(animals);
        //printCat(dogs);
        printCat(cats);
        printCat(kittens);

        printUpCat(animals);
        //printUpCat(dogs);
        printUpCat(cats);
        //printUpCat(kittens);

        Collections.copy(animals, kittens);
        System.out.println(animals);

        //Collections.copy(kittens, animals);
    }

    public static void printAnimal(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        System.out.println("-----------------------");
    }

    public static void printCat(List<? extends Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println("-----------------------");
    }

    public static void printUpCat(List<? super Cat> animals) {
        for (Object animal : animals) {
            System.out.println(animal);
        }
        System.out.println("-----------------------");
    }

    static class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + super.name + '\'' +
                    '}';
        }
    }

    static class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }

        protected String getName() {
            return super.name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + super.name + '\'' +
                    '}';
        }
    }

    static class Kitten extends Cat {

        public Kitten(String name) {
            super(name);
        }

        @Override
        public String toString() {
            return "Kitten{" +
                    "name='" + super.getName() + '\'' +
                    '}';
        }
    }
}
