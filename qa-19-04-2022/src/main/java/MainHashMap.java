import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MainHashMap {

    public static void main(String[] args) {
        Map<String, Point> map = new HashMap<>();

        map.put("точка_2_2", new Point(2, 2));
        map.put("точка_2_4", new Point(2, 4));
        map.put("точка_4_4", new Point(4, 4));
        map.put("точка_9_18", new Point(9, 18));

        System.out.println(map);

        //System.out.println(map.get("точка_2_2"));

        map.put("точка_9_18", new Point(9, 20));

        System.out.println(map);

        //System.out.println(map.get("точка_10000_10000"));

        Set<Map.Entry<String, Point>> entries = map.entrySet();
        System.out.println(entries);

        for (Map.Entry<String, Point> keyValue : entries) {
            System.out.println("Ключ = " + keyValue.getKey() + " значение = " + keyValue.getValue());
        }

        System.out.println("---------------------------------------------------------");

        Set<String> strings = map.keySet();
        System.out.println(strings);

        Collection<Point> values = map.values();
        System.out.println(values);

        /*ArrayList<Object> objects = new ArrayList<>();
        objects.add(1L);
        objects.add(2);
        objects.add("Строка");
        System.out.println(objects);

        String o = (String) objects.get(0);
        System.out.println(o);

        ArrayList<Long> objects1 = new ArrayList<>();
        ArrayList<String> objects2 = new ArrayList<>();*/

        System.out.println("-------------------------------------------------------------------------");

        HashMap<Point, String> map2 = new HashMap<>();
        Point point = new Point(2, 2);
        map2.put(point, "точка_2_2");
        map2.put(new Point(2, 4), "точка_2_2");
        System.out.println(map2);

        System.out.println(map2.get(new Point(2, 2)));
    }

    static final class Point {
        private final int x;
        private final int y;

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
