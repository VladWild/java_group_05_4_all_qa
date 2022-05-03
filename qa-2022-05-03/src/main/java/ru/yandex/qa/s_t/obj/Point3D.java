package ru.yandex.qa.s_t.obj;

public class Point3D extends Point {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                super.toString() +
                ", z=" + z +
                '}';
    }
}
