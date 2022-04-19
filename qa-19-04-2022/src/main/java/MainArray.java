import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class MainArray {

    public static void main(String[] args) {
        /*Point[] points = new Point[10];
        points[1] = new Point(2, 4);
        points[6] = new Point(56, 4);
        points[9] = new Point(2, 89);
        System.out.println(Arrays.toString(points));
        System.out.println(points.length);*/

        List<MainArray.Point> points = new ArrayList<>();
        points.add(new Point(2, 4));
        points.add(new Point(2, 6));
        points.add(new Point(3, 6));
        points.add(new Point(7, 6));
        System.out.println(points);

        points.add(1, new Point(345345, 4564));

        System.out.println(points);

        //points.add(6, new Point(345345, 4564));

        int size = points.size();
        System.out.println(size);

        Point point = points.get(0);
        System.out.println(point);

        for (Point p : points) {
            System.out.println(p);
            //points.remove(point); не работает!!!
        }

        Iterator<Point> iterator = points.iterator();

        while (iterator.hasNext()) {
            Point next = iterator.next();
            if (next.getX() == 2) {
                iterator.remove();
            }
        }

        System.out.println(points);

        points.addAll(Arrays.asList(new Point(43545, 54656), new Point(0, 0)));

        System.out.println(points);

        points.clear();

        System.out.println(points);

        List<Object> objects = new ArrayList<>(1000);
        LinkedList<Object> objects1 = new LinkedList<>();

        ArrayList<Long> objects2 = new ArrayList<>();

        long[] longs = new long[10];
    }

    static final class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
