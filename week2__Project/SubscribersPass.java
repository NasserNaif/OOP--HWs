package week2__Project;

public class SubscribersPass extends Passenger {

    public SubscribersPass(String ID, String name, Car car) {
        super(ID, name, car);

    }


    @Override
    public void tripCost() {

        super.setTripCost(0.5 * super.getCar().getfixRoute().getTripPrice());
    }

    @Override
    public String toString() {
        String carCode = super.getCar().getCode();
        double tripCost = super.getTripCost();
        String str = "Subscribed passenger ID : " + super.getID() + "\n passenger name : " + super.getName() +
                "\n car code : " + carCode + "\n trip cost : " + tripCost;
        return str;
    }
}
