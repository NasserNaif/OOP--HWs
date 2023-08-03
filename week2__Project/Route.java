package week2__Project;

public class Route {
    private String startPickUp;
    private String destination;
    private int tripPrice;

    public Route(String startPickUp, String destination, int tripPrice) {
        this.startPickUp = startPickUp;
        this.destination = destination;
        this.tripPrice = tripPrice;
    }

    public String getStartPickUp() {
        return startPickUp;
    }

    public void setStartPickUp(String startPickUp) {
        this.startPickUp = startPickUp;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = tripPrice;
    }
}
