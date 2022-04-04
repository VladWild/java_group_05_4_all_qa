package ru.yandex.qa.static_;

public class MainStaticMethod {

    public static void main(String[] args) {
        Point.setColor("зеленый");
        System.out.println(Point.color);

        Point point1 = new Point();
        Point.setColor("синий");
        //point1.setColor("синий");

        /*Point point2 = new Point();
        point2.setColor("красный");*/

        System.out.println(point1);
        //System.out.println(point2);
    }

    static class Point {
        private static String color;

        private int x;
        private int y;

        public static void setColor(String color) {
            Point.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setX(int x) {
            this.x = x;
            color = "зеленый"; //при этом так сделать можно, так как в обычных методах можно использовать и статические переменные
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

   /* static class PointZ extends Point {
        private int z;

        //@Override  //так нельзя сделать
        public static void setColor(String color) {
            Point.color = color;
        }

        public int getZ() {
            return z;
        }

        public void setZ(int z) {
            this.z = z;
        }
    }*/
}
