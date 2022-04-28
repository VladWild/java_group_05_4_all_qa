package ru.yandex.qa.midify_;

import ru.yandex.qa.midify_.poiny.Point;
import ru.yandex.qa.midify_.poiny.PointZ;

public class Main {

    public static void main(String[] args) {
        /*Point point = new Point();
        //point.setX(3);
        point.setY(34);
        System.out.println(point);
        System.out.println(point.getX());

        point.getClass();*/

        PointZ pointZ = new PointZ(1, 2, 4);
        System.out.println(pointZ);
    }
}
