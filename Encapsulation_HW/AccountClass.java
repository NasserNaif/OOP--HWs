package Encapsulation_HW;

import java.util.Scanner;

public class AccountClass {
    Scanner in = new Scanner(System.in);
    private String ID;
    private String name;
    private int balance;


    //Constructors


    public AccountClass(String ID, String name, int balance) {
        this.ID = ID;
        this.name = name;
        this.balance = balance;
    }

    public AccountClass(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    AccountClass() {
        this.balance = 0;
    }


    // getter
    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // setter
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    // methods

    public String toString() {
        String str = "( ID : " + ID + " | name : " + name + " | balance : " + balance + ". )";

        return str;
    }

    public void credit(int amount) {
        if (balance == 0) {
            System.out.println("sorry! your balance is 0 .");
        } else {
            while (amount > balance) {

                System.out.println("Soory! your balance : " + balance + " is less than amount you want to withdraw. ");
                System.out.print("please enter new amount : ");
                amount = in.nextInt();
            }
            balance -= amount;
            System.out.println("you withdraw : " + amount + " from your account.");
            System.out.println("your new balance is : " + balance);
        }


    }

    public void debit(int amount) {
        while (amount <= 0) {

            System.out.println("Soory! please enter a positive number");
            System.out.print("please enter new amount : ");
            amount = in.nextInt();
        }
        balance += amount;
        System.out.println("you deposit : " + amount + " from your account.");
        System.out.println("your new balance is : " + balance);
    }

    public void transferTo(AccountClass another, int amount) {
        if (balance == 0) {
            System.out.println("sorry! your balance is ZERO, you can't transfer money");
        } else {
            while (amount <= 0) {
                if (amount > balance) {
                    System.out.println("Soory! your balance : " + balance + " is less than amount you want to transfer. ");
                } else {
                    System.out.println("Soory! please enter a positive number");
                }
                System.out.print("please enter new amount : ");
                amount = in.nextInt();
            }
            another.balance += amount;
            balance -= amount;


        }
    }
}
