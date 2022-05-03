package ru.yandex.qa.modify_access.pac1;

/**
 * 1) В текущем классе показать
 * 2) В этом же пакете в классе MainThisPac
 * 3) В другом пакете в классе наследнике -> ВАЖНО именно PointFieldModifyExtended!!!!!!
 * 4) В классе MainModifyAccess
 */
public class PointFieldModify {
    public int x;
    protected int y;
    int z;
    private String color;

    private void method() {
        PointFieldModify point = new PointFieldModify();
        point.x = 1;
        point.y = 1;
        point.z = 1;
        point.color = "RED";

        point.getX();
        point.getY();
        point.getZ();
        point.getColor();
    }

    public int getX() {
        return x;
    }

    protected int getY() {
        return y;
    }

    int getZ() {
        return z;
    }

    private String getColor() {
        return color;
    }
}
