package week2__Project;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            Route r1 = new Route("Batha", "Olaya", 200);
            Route r2 = new Route("Tuwaiq", "Malaz", 150);

            Car car1 = new Car("112233", r1, 100);
            Car car2 = new Car("1122", r2, 80);

            Passenger sub = new SubscribersPass("10", "Nasser", car1);
            Passenger nonSub = new Non_SubscribersPass("10", "hamd", car2, false);

            // Exceptions
            checkCarCapacity(sub.getCar().getMaxCapacity());
            checkCarCapacity(nonSub.getCar().getMaxCapacity());


            ArrayList<Passenger> passengers = new ArrayList<Passenger>();

            passengers.add(sub);
            passengers.add(nonSub);

            passengers.forEach(n -> {
                n.tripCost();
                System.out.println(n.toString());
                System.out.println();
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void checkCarCapacity(int carCapacity) throws Exception {
        if (carCapacity <= 0) {
            throw new Exception("sorry! the car you have chosen is full, please take another car.");
        }
    }
}
