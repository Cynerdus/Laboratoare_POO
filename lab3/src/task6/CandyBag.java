package task6;

import java.util.ArrayList;
import java.util.List;
public class CandyBag {
    private List<CandyBox> candies;

    public List<CandyBox> getCandies() {
        return candies;
    }

    public void setCandies(List<CandyBox> candies) {
        this.candies = candies;
    }

    public CandyBag() {
        candies = new ArrayList<>();

        candies.add(new Lindt("cherry", "Austria", 20, 5.4F, 19.2F));
        candies.add(new Lindt("apricot", "Austria", 20, 5.4F, 19.2F));
        candies.add(new Lindt("strawberry", "Austria", 20, 5.4F, 19.2F));
        candies.add(new Baravelli("grape", "Italy", 6.7F, 8.7F));
        candies.add(new ChocAmor("coffee", "France", 5.5F));
        candies.add(new ChocAmor("vanilla", "France", 5.5F));
    }
}
