package task3;

import task2.CandyBox;

public class ChocAmor extends CandyBox {
    private float length;

    public ChocAmor() {
        length = 0;
    }

    public ChocAmor (float length) {
        this.length = length;
    }

    public ChocAmor(String flavor, String origin, float length) {
        super(flavor, origin);
        this.length = length;
    }

    @Override
    public float getVolume() {
        return length * length * length;
    }

    @Override
    public String toString() {
        return "ChocAmor: " + super.toString() + " has volume " + getVolume();
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
}
