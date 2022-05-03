package ru.yandex.qa.object_;

import java.util.StringJoiner;

public class MainToString {

    public static void main(String[] args) {
        Point point = new Point(28, 78, Color.WHITE);
        System.out.println(point);
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

        /*@Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    ", color=" + color +
                    '}';
        }*/

        @Override
        public String toString() {
            return new StringJoiner(", ", Point.class.getSimpleName() + "[", "]")
                    .add("x=" + x)
                    .add("y=" + y)
                    .add("color=" + color)
                    .toString();
        }
    }

    static enum Color {
        RED, BLUE, WHITE;
    }
}
