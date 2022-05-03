package ru.yandex.qa.modify_access.pac2;

import ru.yandex.qa.modify_access.pac1.PointModify;

public class PointModifyExtend extends PointModify {
    public int x;

    public PointModifyExtend(int x) {
        this.x = x;
    }

    public void method() {
        PointModifyExtend pointExtend = new PointModifyExtend(2);
        pointExtend.x = 1;
        pointExtend.y = 4;
        //pointExtend.z = 8;
        //pointExtend.color = "RED";

        pointExtend.getX();
        pointExtend.getY();
        //pointExtend.getZ();
        //pointExtend.getColor();
    }

    @Override
    public String toString() {
        return "PointModifyExtend{" +
                "x=" + x +
                '}';
    }
}
