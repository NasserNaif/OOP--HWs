package week2__Project;

public class Non_SubscribersPass extends Passenger {

    private boolean haveCoupon;

    public Non_SubscribersPass(String ID, String name, Car car, boolean haveCoupon) {
        super(ID, name, car);
        this.haveCoupon = haveCoupon;
    }

    public boolean isHaveCoupon() {
        return haveCoupon;
    }

    public void setHaveCoupon(boolean haveCoupon) {
        this.haveCoupon = haveCoupon;
    }

    @Override
    public void tripCost() {
        if (haveCoupon) {
            double afterDiscount = super.getCar().getfixRoute().getTripPrice() - (0.1 * super.getCar().getfixRoute().getTripPrice());

            super.setTripCost(afterDiscount);
        } else {
            super.setTripCost(super.getCar().getfixRoute().getTripPrice());
        }

    }

    @Override
    public String toString() {
        String carCode = super.getCar().getCode();
        double tripCost = super.getTripCost();
        String str = "Unsubscribed passenger ID : " + super.getID() + "\n passenger name : " + super.getName() +
                "\n car code : " + carCode + "\n trip cost : " + tripCost + (haveCoupon ? "\n he has a 10% discount." : "\n he hasn't any discounts");
        return str;
    }
}
