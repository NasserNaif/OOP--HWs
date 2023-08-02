package Interface_HW;

import java.awt.event.KeyEvent;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        MovablePoint movable = new MovablePoint(100, 100, 50, 50);
        boolean isPlaying = true;


        try {
            do {
                System.out.println("1 - move up \n2- move down \n3 - move right\n4 - move left");
                System.out.println(movable.toString());
                System.out.print("enter a number : ");
                int option = sc.nextInt();

                switch (option) {
                    case 1 -> movable.moveUp();

                    case 2 -> movable.moveDown();

                    case 3 -> movable.moveRight();

                    case 4 -> movable.moveLeft();

                    default -> System.out.println("try again !");
                }
            } while (isPlaying);
        } catch (InputMismatchException e) {
            System.out.println("please enter a number");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
