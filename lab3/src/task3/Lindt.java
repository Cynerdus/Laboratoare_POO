package task3;
import java.util.Objects;

public class Lindt extends CandyBox {
    private float length, width, height;
    public Lindt() {
        length = width = height = 0;
    }

    public Lindt (float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Lindt(String flavor, String origin, float length, float width, float height) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        Lindt lindt = (Lindt) obj;
        return Float.compare(lindt.length, length) == 0 && Float.compare(lindt.width, width) == 0 && Float.compare(lindt.height, height) == 0;
    }

    @Override
    public float getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "Lindt: " + super.toString() + " has volume " + getVolume();
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
