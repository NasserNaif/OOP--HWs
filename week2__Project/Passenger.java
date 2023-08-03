package week2__Project;

public abstract class Passenger {


    private String ID;
    private String name;
    private Car car;
    private double tripCost;

    public Passenger(String ID, String name, Car car) {
        this.car = car;
        this.ID = ID;
        this.name = name;

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public abstract void tripCost();

    public abstract String toString();


}
