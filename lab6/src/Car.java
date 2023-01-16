public class Car {
    final int price;
    final int year;

    final CarType carType;

    public Car(int price, CarType carType, int year) {
        this.price = price;
        this.year = year;
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{price=" + price + ", carType=" + carType + ", year=" + year + "}";
    }

    public static enum CarType {
        MERCEDES,
        FIAT,
        SKODA
    }
}
