package ru.yandex.qa.inter;

public class MainInterf {

    public static void main(String[] args) {

    }

    static class Point implements Coordinate, Coordinate2 {

        @Override
        public int getCoordinate() {
            return 0;
        }
    }

    static interface Coordinate {

        int getCoordinate();
    }

    static interface Coordinate2 {

        int getCoordinate();
    }
}
