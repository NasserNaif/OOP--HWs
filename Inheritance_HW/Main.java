package Inheritance_HW;

public class Main {
    public static void main(String[] args) {
        Shape sh = new Shape("Green", false);
        Circle ci = new Circle("white", true, 6);
        Rectangle rec = new Rectangle("black", false, 100, 200);
        Square seq = new Square(300);
        seq.setSide(700);
        System.out.println(sh.toString());
        System.out.println(ci.toString());
        System.out.println(rec.toString());
        System.out.println(seq.toString());

    }
}
