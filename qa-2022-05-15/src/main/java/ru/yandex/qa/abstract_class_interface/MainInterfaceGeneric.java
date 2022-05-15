package ru.yandex.qa.abstract_class_interface;

public class MainInterfaceGeneric {

    public static void main(String[] args) {
        Inter1<Event1> interEvent1 = new Clazz();
        Inter1<Event2> interEvent2 = new Clazz2();
        interEvent1.method(new Event1());
        interEvent2.method(new Event2());
    }

    static interface Inter1<T> {

        T method(T event);
    }

    static class Clazz implements Inter1<Event1> {

        @Override
        public Event1 method(Event1 event) {
            System.out.println(event.toString());
            return event;
        }
    }

    static class Clazz2 implements Inter1<Event2> {

        @Override
        public Event2 method(Event2 event) {
            System.out.println(event.toString());
            return event;
        }
    }

    static class Event1 {

        @Override
        public String toString() {
            return "Event1{}";
        }
    }

    static class Event2 {

        @Override
        public String toString() {
            return "Event2{}";
        }
    }
}
