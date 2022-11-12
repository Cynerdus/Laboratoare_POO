package task3;

public class Point {
    private float x, y;

    public Point(float _x, float _y) {
        x = _x;
        y = _y;
    }

    public void changeCoords(float _x, float _y) {
        x = _x;
        y = _y;
    }

    public void showPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
