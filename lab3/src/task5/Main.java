package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flavor = scanner.next();
        String origin = scanner.next();
        float length = scanner.nextFloat();
        float width = scanner.nextFloat();
        float height = scanner.nextFloat();
        float radius = scanner.nextFloat();

        CandyBox lindtBox = new Lindt(flavor, origin, length, width, height);
        CandyBox baravelliBox = new Baravelli(flavor, origin, radius, height);
        CandyBox chocAmorBox = new ChocAmor(flavor, origin, length);

        ((Lindt) lindtBox).printLindtDim();
        ((Baravelli) baravelliBox).printBaravelliDim();
        ((ChocAmor) chocAmorBox).printChocAmorDim();
    }
}
