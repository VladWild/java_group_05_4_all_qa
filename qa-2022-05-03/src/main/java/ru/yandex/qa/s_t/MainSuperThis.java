package ru.yandex.qa.s_t;

import ru.yandex.qa.s_t.obj.Point;
import ru.yandex.qa.s_t.obj.Point3D;

/**
 * 3) Наследование super, this
 */
public class MainSuperThis {

    public static void main(String[] args) {
        /*Point point = new Point(4, 8);
        System.out.println(point);*/

        Point3D point3D = new Point3D(5, 89, -4);
        System.out.println(point3D);
    }
}
