package Abstraction_HW;

public class Movie extends Product {
    private String director;


    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public Movie() {

    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String toString() {
        String str = "movie name : " + super.getName() + "\n" + "directed by : " + director + "\n" + "before discount : " + super.getPrice() + "\n" + "and after the discount : " + getDiscount(20);
        return str;
    }

    @Override
    public double getDiscount(int percent) {
        double per = (double) percent / 100;
        double discount = (-per * super.getPrice());
        return discount + super.getPrice();
    }
}
