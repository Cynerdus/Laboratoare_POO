package task1;

public class Main {
    public static void main(String[] args) {
        Complex complex1 = new Complex(4, 5);
        Complex complex2 = new Complex();
        complex2.setR(1);
        complex2.setI(0);

        Complex complex3 = new Complex(complex1);
        complex3.setI(-complex1.getI());

        complex1.showNumber();
        complex2.showNumber();
        complex3.showNumber();

        complex1.addWithComplex(complex2);
        complex1.showNumber();

        complex1.addWithComplex(complex3);
        complex1.showNumber();

        complex2.addWithComplex(complex3);
        complex2.showNumber();
    }
}
