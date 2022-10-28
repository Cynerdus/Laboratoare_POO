package task6;

public class ChocAmor extends CandyBox {
    private float length;

    public ChocAmor() {
        length = 0;
    }

    public ChocAmor(float length) {
        this.length = length;
    }

    public ChocAmor(String flavor, String origin, float length) {
        super(flavor, origin);
        this.length = length;
    }

    @Override
    public void printDim() {
        System.out.println("ChocAmor: " + length);
    }

    public void printChocAmorDim() {
        System.out.println("ChocAmor: " + length);
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
