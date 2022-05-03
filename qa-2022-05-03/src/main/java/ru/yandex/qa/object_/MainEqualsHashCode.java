package ru.yandex.qa.object_;

import java.util.Objects;

public class MainEqualsHashCode {

    public static void main(String[] args) {
        Point point1 = new Point(2, 2, Color.BLUE);
        Point point2 = new Point(2, 2, Color.BLUE);
        boolean equals = point1.equals(point2);
        System.out.println(equals);

        Point point3 = new Point(2, 5, Color.RED);
        Point point4 = new Point(4, 10, Color.RED);
        int hashCode3 = point3.hashCode();
        int hashCode4 = point4.hashCode();
        System.out.println(hashCode3);
        System.out.println(hashCode4);
        Point point5 = new Point(10, 4, Color.RED);
        int hashCode5 = point5.hashCode();
        System.out.println(hashCode5);
        Point point6 = new Point(10, 4, Color.RED);
    }

    static class Point {
        private int x;
        private int y;
        private Color color;

        public Point(int x, int y, Color color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y && color == point.color;
        }

        @Override
        public int hashCode() {
            return x + y;
        }
    }

    static enum Color {
        RED, BLUE, WHITE;
    }
}
