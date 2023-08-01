package Inheritance_HW;

public class Circle extends Shape {
    private double radius = 1.0;
    private final double PI = 3.14;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    Circle() {
        radius = 1.0;
    }

    // getter & setter


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double pow = radius * radius;
        return PI * pow;
    }

    public double getPerimeter() {
        double diameter = radius * 2;
        return PI * diameter;
    }

    public String toString() {
        String str = "A Circle with radius = " + radius + ", which is a supclass of " + super.toString();

        return str;
    }

}
