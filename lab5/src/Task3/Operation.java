package Task3;

public class Operation implements Minus, Plus, Mult, Div{

    private float value;

    public Operation(float value) {
        this.value = value;
    }

    public float getNumber() {
        return value;
    }

    @Override
    public void div(float value) {
        System.out.print((value != 0 && (this.value /= value) > 0) ? "" : "Division by zero is not possible\n");
    }

    @Override
    public void minus(float value) {
        this.value -= value;
    }

    @Override
    public void mult(float value) {
        this.value *= value;
    }

    @Override
    public void plus(float value) {
        this.value += value;
    }
}
