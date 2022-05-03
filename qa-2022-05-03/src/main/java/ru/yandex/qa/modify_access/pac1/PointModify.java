package ru.yandex.qa.modify_access.pac1;

public class PointModify {
    public int x = 0;
    protected int y;
    int z;
    private String color;

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

    public void method() {
        PointModify point = new PointModify();
        point.x = 1;
        point.y = 4;
        point.z = 8;
        point.color = "RED";

        point.getX();
        point.getY();
        point.getZ();
        point.getColor();
    }
}
