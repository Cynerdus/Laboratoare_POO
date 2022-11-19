package Task1;

public class CounterOutTask implements Task{
    public static int index = 0;
    @Override
    public void execute() {
        System.out.println(++index);
    }
}
