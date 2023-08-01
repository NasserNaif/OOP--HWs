package Inheritance_HW;

public class Shape {
    private String color = "Green";
    private boolean filled = false;

    // constructors


    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
        
    }


    // getter & setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    public String toString() {
        String str = "A shape color is " + color + ", and it is " + (filled ? "filled" : "not filled");
        return str;
    }
}
