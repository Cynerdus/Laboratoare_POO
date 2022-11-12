package task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String street = scanner.next();
        String message = scanner.next();

        Area area = new Area(number, street, message);

        System.out.println("With instanceof:");
        area.getBirthdayCard();
        System.out.println();
        System.out.println("Without instanceof:");
        area.getBirthdayCardv2();
    }
}
