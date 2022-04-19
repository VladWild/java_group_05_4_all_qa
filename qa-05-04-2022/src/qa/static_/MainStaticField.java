package ru.yandex.qa.static_;

/**
 * 1) Статическое поле
 */
public class MainStaticField {

    public static void main(String[] args) {
        Point point = new Point();

        point.setX(2);
        point.setY(4);
        point.setColor("красный");

        System.out.println(point);

        Point point2 = new Point();

        point2.setX(44);
        point2.setY(88);

        point2.setColor("зеленый");

        System.out.println(point2);

        System.out.println(point);

        Point point3 = new Point();
        System.out.println(point3);
    }

    static class Point {
        private static final String COLOR_2 = "RED";
        private static String color;

        private int x;
        private int y;

        public void setColor(String color) {
            Point.color = color;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
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
    }
}
