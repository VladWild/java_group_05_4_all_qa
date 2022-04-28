package ru.yandex.qa.midify_.poiny;

public class PointZ extends Point {
    private final int z;

    public PointZ(int x, int y, int z) {
        super(x, y);
        super.y = 4;
        this.z = z;
        //this.z = 68;
    }

    @Override
    public String toString() {
        return "PointZ{" +
                "x=" + this.getX() +
                "y=" + this.getY() +
                "z=" + z +
                '}';
    }
}
