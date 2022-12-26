package Task1;

import java.util.Random;

public class RandomOutTask implements Task{
    private int number;
    private static Random random = new Random(12345);

    public RandomOutTask() {
        number = random.nextInt();
    }

    @Override
    public void execute() {
        System.out.println(number);
    }
}
