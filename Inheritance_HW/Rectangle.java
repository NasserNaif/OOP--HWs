package Inheritance_HW;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
    }

    public Rectangle() {

    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public double getPerimeter() {

        return (width + length) * 2;
    }

    public double getArea() {

        return width * length;
    }

    public String toString() {

        String str = "A Rectangle with width = " + width + " and length = " + length + " which is supclass of " + super.toString();
        return str;
    }
}
