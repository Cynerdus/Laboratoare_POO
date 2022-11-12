package task3;

import java.util.ArrayList;
import java.util.List;

public class Polygon {
    private int edgeNumber;
    private List<Point> points = new ArrayList<>();

    public Polygon(int _edgeNumber) {
        edgeNumber = _edgeNumber;

        for (int i = 0; i < edgeNumber; i++) {
            points.add(new Point(0, 0));
        }
    }

    public Polygon(float[] _points) {
        this(_points.length / 2);

        for (int i = 0; i < edgeNumber * 2; i += 2) {
            points.get(i / 2).changeCoords(_points[i], _points[i + 1]);
        }
    }

    public void showPolygon() {
        for (Point point : points) {
            point.showPoint();
        }
    }
}
