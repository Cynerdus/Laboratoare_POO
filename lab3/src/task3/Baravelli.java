package task3;

public class Baravelli extends CandyBox {
    private float radius;
    private float height;

    public Baravelli() {
        radius = height = 0;
    }

    public Baravelli(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public Baravelli(String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return (float) (Math.PI * radius * radius * height);
    }

    @Override
    public String toString() {
        return "Baravelli: " + super.toString() + " has volume " + getVolume();
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
