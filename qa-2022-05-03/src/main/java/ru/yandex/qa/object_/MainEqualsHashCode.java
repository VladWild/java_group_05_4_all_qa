package ru.yandex.qa.object_;

import java.util.Objects;

public class MainEqualsHashCode {

    public static void main(String[] args) {
        //equals
        Point point1 = new Point(Color.RED, 2, 2);
        Point point2 = new Point(Color.RED, 2, 2);
        boolean equals = point1.equals(point2);
        System.out.println(equals);

        //hashCode
        Point point3 = new Point(Color.BLUE, 2, 10);
        Point point4 = new Point(Color.BLUE, 10, 2);
        System.out.println(point3.hashCode());
        System.out.println(point4.hashCode());
    }

    static class Point {
        private Color color;
        private int x;
        private int y;

        public Point(Color color, int x, int y) {
            this.color = color;
            this.x = x;
            this.y = y;
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
            return 31 * x + y;
        }
    }

    static enum Color {
        RED, BLUE, WHITE;
    }
}
