package Interface_HW;

public class MovablePoint implements Movable {
    private int X;
    private int Y;
    private int Xspeed;
    private int Yspeed;

    MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.X = x;
        this.Y = y;
        this.Xspeed = xspeed;
        this.Yspeed = yspeed;
    }

    public String toString() {
        String str = "the point vector is ( x = " + X + ", y = " + Y + " )";
        return str;
    }


    @Override
    public void moveUp() {
        System.out.println(Y += Yspeed);
    }

    @Override
    public void moveDown() {
        System.out.println(Y -= Yspeed);
    }

    @Override
    public void moveRight() {
        System.out.println(X += Xspeed);
    }

    @Override
    public void moveLeft() {
        System.out.println(X -= Xspeed);
    }
}
