package task6;

public class Area {
    private int number;
    private String street;
    private String message;

    public Area() {
        number = 0;
        street = message = "nowhere";
    }

    public Area(int number, String street, String message) {
        this.number = number;
        this.street = street;
        this.message = message;
    }

    public void getBirthdayCard() {
        System.out.println("Street " + street + ", number " + number + "\n");
        System.out.println(message + "\n");

        CandyBag candyBag = new CandyBag();
        candyBag.getCandies().forEach((candyBox -> { if (candyBox instanceof Lindt) { ((Lindt) candyBox).printLindtDim();} else if (candyBox instanceof Baravelli) { ((Baravelli) candyBox).printBaravelliDim(); } else ((ChocAmor) candyBox).printChocAmorDim();}));
    }

    public void getBirthdayCardv2() {
        System.out.println("Street " + street + ", number " + number + "\n");
        System.out.println(message + "\n");

        CandyBag candyBag = new CandyBag();
        candyBag.getCandies().forEach((CandyBox::printDim));
        /* added printDim() method in superclass CandyBox
         *  and overrode it in the children classes with
         *  the specific dimensions */
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
