package Inheritance_HW;

public class Square extends Rectangle {


    public Square(String color, boolean filled, double width) {
        super(color, filled, width);
    }

    public Square(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public Square() {
    }


    // get & set


    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }


    // methods
    public String toString() {
        String str = "A Square with side = " + super.getWidth() + ", which is a subclass of " + super.toString();
        return str;
    }

    public double getPerimeter() {

        return super.getWidth() * 4;
    }

    public double getArea() {

        return super.getWidth() * super.getLength();
    }
}
