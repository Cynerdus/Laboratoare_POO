package task1;

public class Complex {
    private int R, I;

    public Complex(int _R, int _I) {
        R = _R;
        I = _I;
    }

    public Complex() {
        this(0, 0);
    }

    public Complex(Complex _complex) {
        this.R = _complex.R;
        this.I = _complex.I;
    }

    public int getI() {
        return I;
    }

    public void setI(int i) {
        I = i;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    public void addWithComplex(Complex _complex) {
        this.R += _complex.R;
        this.I += _complex.I;
    }

    public void showNumber() {
        if (I > 0) System.out.println(R + " + i * " + I);
        if (I < 0) System.out.println(R + " - i * " + -I);
        if (I == 0) System.out.println(R);
    }
}
