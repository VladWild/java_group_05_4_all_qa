package ru.yandex.qa.modify_access.pac1;

public class MainThisPac {

    public static void main(String[] args) {
        PointModify point = new PointModify();
        point.x = 1;
        point.y = 4;
        point.z = 8;
        //point.color = "RED";

        point.getX();
        point.getY();
        point.getZ();
        //point.getColor();
    }
}
