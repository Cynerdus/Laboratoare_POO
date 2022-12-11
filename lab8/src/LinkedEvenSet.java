import java.util.LinkedHashSet;

public class LinkedEvenSet extends LinkedHashSet<Integer> {
    @Override
    public boolean add(Integer integer) {
        return integer % 2 == 0 && super.add(integer);
    }
}
