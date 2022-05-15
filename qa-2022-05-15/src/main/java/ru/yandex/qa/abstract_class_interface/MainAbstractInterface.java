package ru.yandex.qa.abstract_class_interface;

import java.util.LinkedList;
import java.util.List;

public class MainAbstractInterface {

    public static void main(String[] args) {
        //Animal animal = new Animal(5d, 20);
        Animal cat = new Cat(5d, 15, "Мурзик");
        Animal tiger = new Tiger(110d, 100, TigerType.GOLD);

        System.out.println(cat);
        System.out.println(tiger);
        System.out.println("-------------------------------------------");

        HomeNeeds cat2 = new Cat(5d, 15, "Tom");
        cat2.getEat();
        cat2.getPat();

        WildNeeds tiger2 = new Tiger(110d, 100, TigerType.WHITE);
        tiger2.getHunting();

        List<Object> objects = new LinkedList<>();
    }

    static abstract class Animal {
        private double weight; // вес
        private int growth;    // рост

        public Animal(double weight, int growth) {
            this.weight = weight;
            this.growth = growth;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public int getGrowth() {
            return growth;
        }

        public void setGrowth(int growth) {
            this.growth = growth;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "weight=" + weight +
                    ", growth=" + growth +
                    '}';
        }
    }

    static class Cat extends Animal implements HomeNeeds {
        private final String name;

        public Cat(double weight, int growth, String name) {
            super(weight, growth);
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "weight=" + super.weight +
                    ", growth=" + super.growth +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public void getEat() {
            System.out.println("Кот " + name + " хочет есть!!!!");
        }

        @Override
        public void getPat() {
            System.out.println("Кот " + name + " хочет ласки!!!!");
        }
    }

    static class Dog extends Animal implements HomeNeeds, WildNeeds {

        public Dog(double weight, int growth) {
            super(weight, growth);
        }

        @Override
        public void getEat() {

        }

        @Override
        public void getPat() {

        }

        @Override
        public void getHunting() {

        }

        @Override
        public String toString() {
            return "Dog{" +
                    "weight=" + super.weight +
                    ", growth=" + super.growth +
                    '}';
        }
    }

    static class Tiger extends Animal implements WildNeeds {
        private TigerType type;

        public Tiger(double weight, int growth, TigerType type) {
            super(weight, growth);
            this.type = type;
        }

        @Override
        public String toString() {
            return "Tiger{" +
                    "weight=" + super.weight +
                    ", growth=" + super.weight +
                    ", type=" + type +
                    '}';
        }

        @Override
        public void getHunting() {
            System.out.println("Тигр " + type + " начинает охоту");
        }
    }

    static enum TigerType {
        WHITE, GOLD;
    }

    //-----------------------------------------------------

    static interface HomeNeeds {

        void getEat();

        void getPat(); //получить ласку
    }

    static interface WildNeeds {

        void getHunting();
    }
}
