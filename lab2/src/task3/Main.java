package task3;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 3);
        point1.showPoint();
        point1.changeCoords(2, 2);
        point1.showPoint();

        float[] points = new float[6];

        for(int i = 0; i < 6; i++) {
            points[i] = i;
        }
        Polygon polygon = new Polygon(points);
        polygon.showPolygon();
    }
}
