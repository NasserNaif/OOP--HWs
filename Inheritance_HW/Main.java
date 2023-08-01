package Inheritance_HW;

public class Main {
    public static void main(String[] args) {
        Shape sh = new Shape("pink", true);
        Circle ci = new Circle("white", true, 6);
        Rectangle rec = new Rectangle("black", false, 100, 200);
        Shape gg = new Shape();
        Square seq = new Square(300);
        seq.setSide(10);
        System.out.println(sh.toString());
        System.out.println(ci.toString());
        System.out.println(rec.toString());
        System.out.println(seq.toString());
        System.out.println(gg.toString());
        System.out.println("square perimeter is : " + seq.getPerimeter());
        System.out.println("square area is : " + seq.getArea());
        System.out.println("rectangle perimeter is : " + rec.getPerimeter());
        System.out.println("rectangle area is : " + rec.getArea());
        System.out.println("circle perimeter is : " + ci.getPerimeter());
        System.out.println("circle area is : " + ci.getArea());

    }
}
