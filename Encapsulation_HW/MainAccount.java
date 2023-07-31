package Encapsulation_HW;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountClass userAccount = new AccountClass();
        AccountClass account2 = new AccountClass("1234567", "Nasser");
        AccountClass account3 = new AccountClass("112233", "Naif", 500);
        boolean isWorking = true;

        try {
            do {
                System.out.println("1 - to change your account ID");
                System.out.println("2 - to change your account name");
                System.out.println("3 - to change your account balance");
                System.out.println("4 - to withdraw money");
                System.out.println("5 - to deposit money");
                System.out.println("6 - to transfer money");
                System.out.println("7 - to show your account data");

                int option = input.nextInt();

                switch (option) {
                    case 1: {
                        System.out.print("enter the ID : ");
                        String rr = input.nextLine();

                        String ID = input.nextLine();
                        userAccount.setID(ID);
                        break;
                    }
                    case 2: {

                        System.out.print("enter the name : ");
                        String rr = input.nextLine();
                        String name = input.nextLine();
                        userAccount.setName(name);
                        break;
                    }
                    case 3: {
                        System.out.print("enter the balance : ");

                        int balance = input.nextInt();
                        userAccount.setBalance(balance);
                        break;
                    }
                    case 4: {
                        System.out.print("enter the amount to withdraw : ");
                        int amount = input.nextInt();
                        userAccount.credit(amount);
                        break;
                    }
                    case 5: {
                        System.out.print("enter the amount to deposit : ");
                        int amount = input.nextInt();
                        userAccount.debit(amount);
                        break;
                    }
                    case 6: {
                        System.out.print("enter the amount to transfer : ");
                        int amount = input.nextInt();
                        System.out.print("enter the account to transfer ( 1 for account2  -- 2 for account3 ) : ");
                        int acc = input.nextInt();
                        if (acc == 1) {
                            userAccount.transferTo(account2, amount);
                            System.out.println("transfer done");
                            break;
                        } else if (acc == 2) {
                            userAccount.transferTo(account3, amount);
                            System.out.println("transfer done");
                            break;
                        } else {
                            System.out.println("sorry! there's no account whit this number ");
                            break;
                        }
                    }
                    case 7: {
                        System.out.println("your account data is : ");
                        System.out.println(userAccount.toString());

                        isWorking = false;
                        break;
                    }
                    default:
                        break;
                }
            } while (isWorking);
            System.out.println();
            System.out.println();
            System.out.println(account2.toString());
            System.out.println(userAccount.toString());
            System.out.println(account3.toString());
        } catch (InputMismatchException e) {
            System.out.println("you have to input number rather than chars. ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
