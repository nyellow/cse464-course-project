package main;

import java.util.*;

public class Main {

    public void main(String[] args) {
        // The chosen cars information will be put here
        // We all choose 3 cars, and there are 5 of us so 15 cars to be made
        Car[] cars = new Car[15];

        // Nanqiao's cars
        cars[0] = new Car(Car.Category.Economy, "carMake", "carModel", 44);
        cars[1] = new Car(Car.Category.Economy, "carMake", "carModel", 44);
        cars[2] = new Car(Car.Category.Economy, "carMake", "carModel", 44);

        // Jingyi's cars
        cars[3] = new Car(Car.Category.Economy, "carMake", "carModel", 44);
        cars[4] = new Car(Car.Category.Economy, "carMake", "carModel", 44);
        cars[5] = new Car(Car.Category.Economy, "carMake", "carModel", 44);

        // Junhao's cars
        cars[6] = new Car(Car.Category.Economy, "carMake", "carModel", 44);
        cars[7] = new Car(Car.Category.Economy, "carMake", "carModel", 44);
        cars[8] = new Car(Car.Category.Economy, "carMake", "carModel", 44);

        // David's cars
        cars[9] = new Car(Car.Category.Economy, "carMake", "carModel", 44);
        cars[10] = new Car(Car.Category.Economy, "carMake", "carModel", 44);
        cars[11] = new Car(Car.Category.Economy, "carMake", "carModel", 44);

        // Nathan's cars
        cars[12] = new Car(Car.Category.Economy, "carMake", "carModel", 44);
        cars[13] = new Car(Car.Category.Economy, "carMake", "carModel", 44);
        cars[14] = new Car(Car.Category.Economy, "carMake", "carModel", 44);

        // Get user input
        Scanner input = new Scanner(System.in);

        System.out.println("Number of passengers: ");
        int passengers = input.nextInt();
        System.out.println("Number of rental days: ");
        int  rentalDays= input.nextInt();
        System.out.println("Approximate mileage for trip: ");
        int mileage = input.nextInt();

        // Quick error check, not sure if needed
        if (passengers > 7 || passengers < 0 || rentalDays < 0) {
            System.out.println("Invalid input");
            return;
        }

        // Calculate cost for each car
        for (Car obj : cars) {
            obj.calculateTotalCost(rentalDays, mileage);
        }

        // Now sort our cars by cost
        Arrays.sort(cars, new Comparator<Car>() {
            // Sort in ascending order by cost
            public int compare(Car a, Car b) {
                double diff = a.totalCost - b.totalCost;
                if (diff < 0) return -1;
                if (diff > 0) return 1;
                return 0;
            }
        });

        // We only care about the lowest cost car. However, there
        //  could be multiple cars with the lowest cost. We should
        //  make an array list with the lowest cost car(s)
        ArrayList<Car> carsList = new ArrayList<Car>();
        double prevCarCost = cars[0].totalCost;
        for (Car obj : cars) {
            if (prevCarCost == obj.totalCost) {
                carsList.add(obj);
            }
        }

        // Now sort the lowest cost cars by comfort
        Collections.sort(carsList, new Comparator<Car>() {
            // Sort in descending order by comfort
            public int compare(Car a, Car b) {
                return b.comfort.ordinal() - a.comfort.ordinal();
            }
        });

        // Like before, we only care about the most comfortable cars.
        //  There may be multiple so we must check.
        ArrayList<Car> finalCarsList = new ArrayList<Car>();
        Car.Comfort prevComfort = carsList.get(0).comfort;
        for (Car obj : carsList) {
            if (prevComfort == obj.comfort) {
                finalCarsList.add(obj);
            }
        }

        // Print the final list of cars
        for (Car obj : finalCarsList) {
            System.out.printf("\nCar make: %s\n" +
                            "Car model: %s\n" +
                            "Passengers: %d\n" +
                            "Total cost: %d\n\n",
                            obj.carMake, obj.carModel, obj.carPassengers, obj.totalCost);
        }
    }
}