public class Dealership {
    class BrandOffer implements Offer {

        @Override
        public int getDiscount(Car car) {
            int discount = 0;
            switch(car.carType) {
                case MERCEDES: {
                    discount = car.price / 20;
                    break;
                }
                case FIAT: {
                    discount = car.price / 10;
                    break;
                }
                case SKODA: {
                    discount = 3 * car.price / 20;
                    break;
                }
            }
            
            return discount;
        }
    }

    class DealerOffer implements Offer {

        @Override
        public int getDiscount(Car car) {
            int discount = 0;
            int discountFactor = 2022 - car.year;
            switch (car.carType) {
                case MERCEDES: {
                    discount = 300 * discountFactor;
                    break;
                }
                case FIAT: {
                    discount = 100 * discountFactor;
                    break;
                }
                case SKODA: {
                    discount = 150 * discountFactor;
                    break;
                }
            }

            return discount;
        }
    }

    class SpecialOffer implements Offer {

        @Override
        public int getDiscount(Car car) {
            return Main.rand.nextInt(1000);
        }
    }

    public int getFinalPrice(Car car) {
        int finalPrice = car.price;
        int brandPrice, dealerPrice, specialPrice;

        BrandOffer brandOffer = new BrandOffer();
        DealerOffer dealerOffer = new DealerOffer();
        SpecialOffer specialOffer = new SpecialOffer();
        brandPrice = brandOffer.getDiscount(car);
        dealerPrice =dealerOffer.getDiscount(car);
        specialPrice = specialOffer.getDiscount(car);

        System.out.println("Applying Brand discount: " + brandPrice + " euros");
        System.out.println("Applying Dealer discount: " + dealerPrice + " euros");
        System.out.println("Applying Special discount: " + specialPrice + " euros");

        finalPrice -= brandPrice + dealerPrice + specialPrice;
        return finalPrice;
    }

    public void negotiate(Car car, Offer offer) {
        System.out.println("Applying Client discount: " + offer.getDiscount(car) + " euros");
    }
}
