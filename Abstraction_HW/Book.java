package Abstraction_HW;

public class Book extends Product {
    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public Book() {

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount(int percent) {
        double per = (double) percent / 100;
        double discount = (-per * super.getPrice());
        return discount + super.getPrice();
    }

    public String toString() {
        String str = "book name : " + super.getName() + "\n" + "author : " + author + "\n" + "before discount : " + super.getPrice() + "\n" + "and after the discount : " + getDiscount(20);
        return str;
    }
}
