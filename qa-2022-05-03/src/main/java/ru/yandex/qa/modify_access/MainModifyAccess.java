package ru.yandex.qa.modify_access;

import ru.yandex.qa.modify_access.pac1.PointModify;
import ru.yandex.qa.modify_access.pac2.PointModifyExtend;

/**
 * 1) Модификаторы доступа, гетеры и сеттеры, наследование (super, this)
 */
public class MainModifyAccess {

    public static void main(String[] args) {
        PointModify point = new PointModify();
        point.x = 1;
        //point.y = 4;
        //point.z = 8;
        //point.color = "RED";

        point.getX();
        //point.getY();
        //point.getZ();
        //point.getColor();

        PointModifyExtend pointModifyExtend = new PointModifyExtend(3);
        System.out.println(pointModifyExtend.x);
    }
}
