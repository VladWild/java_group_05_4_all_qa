package ru.yandex.qa.object_;

import java.util.StringJoiner;

public class MainToString {

    public static void main(String[] args) {
        Point point1 = new Point(Color.RED, 2, 2);
        System.out.println(point1.toString());
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
        public String toString() {
            return "Point{" +
                    "color=" + color +
                    ", x=" + x +
                    ", y=" + y +
                    '}';
        }

        /*@Override
        public String toString() {
            return new StringJoiner(", ", Point.class.getSimpleName() + "[", "]")
                    .add("color='" + color + "'")
                    .add("x='" + x + "'")
                    .add("y='" + y + "'")
                    .toString();
        }*/

        /*@Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            return sb.append("Point{")
                    .append("color=").append(color)
                    .append(", x=").append(x)
                    .append(", y=").append(y)
                    .append("}")
                    .toString();
        }*/
    }

    static enum Color {
        RED, BLUE, WHITE;
    }
}
