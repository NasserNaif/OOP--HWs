package Encapsulation_HW;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.WeakHashMap;

public class MainEmploee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmploeeClass emp1 = new EmploeeClass("nnn", "nasser", 5000);
        EmploeeClass emp2 = new EmploeeClass("152743", "mohammed", 53000);
        EmploeeClass emp3 = new EmploeeClass("2389", "hamd", 12000);
        boolean isWorking = true;
        EmploeeClass userEmp = new EmploeeClass();

        ArrayList<EmploeeClass> arr = new ArrayList<>();
        arr.add(emp1);
        arr.add(emp2);
        arr.add(emp3);
        arr.add(userEmp);
        do {

            try {
                System.out.println("1 - to enter employee ID ");
                System.out.println("2 - to enter employee Name ");
                System.out.println("3 - to enter employee Salary ");
                System.out.println("4 - to get annul salary ");
                System.out.println("5 - to enter raised percent  ");
                System.out.println("6 - to get employees data  ");

                int option = input.nextInt();

                switch (option) {
                    case 1: {
                        System.out.print("enter employee ID : ");
                        String rr = input.nextLine();
                        String ID = input.nextLine();
                        userEmp.setID(ID);
                        break;
                    }
                    case 2: {
                        System.out.print("enter employee name : ");
                        String rr = input.nextLine();
                        String name = input.nextLine();
                        userEmp.setName(name);
                        break;

                    }
                    case 3: {
                        System.out.print("enter employee salary : ");
                        int salary = input.nextInt();
                        userEmp.setSalary(salary);
                        break;
                    }
                    case 4: {
                        System.out.println("your annul salary is : " + userEmp.getAnnulaSalary());
                        break;
                    }
                    case 5: {
                        System.out.print("please enter percent of raised : ");
                        int percent = input.nextInt();
                        System.out.println("your salary after raised " + percent + "% is : " + userEmp.raisedSalary(percent));
                        break;
                    }
                    case 6: {
                        System.out.println(userEmp.toString());
                        isWorking = false;
                        break;
                    }
                    default:
                        break;

                }

            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (isWorking);

        arr.forEach((elm) -> System.out.println(elm));

    }
}
