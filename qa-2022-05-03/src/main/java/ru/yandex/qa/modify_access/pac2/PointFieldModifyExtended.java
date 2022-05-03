package ru.yandex.qa.modify_access.pac2;

import ru.yandex.qa.modify_access.pac1.PointFieldModify;

public class PointFieldModifyExtended extends PointFieldModify {

    private void method() {
        PointFieldModifyExtended point = new PointFieldModifyExtended();
        point.x = 1;
        point.y = 1;
        //point.z = 1;
        //point.color = "RED";

        point.getX();
        point.getY();
        //point.getZ();
        //point.getColor();
    }
}
