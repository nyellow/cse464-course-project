package main;

import java.util.Comparator;

public class Car {

    public enum Comfort {
        Poor, Medium, Good
    }

    public enum Category {
        Economy, Intermediate, Standard, Van
    }

    final int ECON_COST = 45, INTERN_COST = 50, STAND_COST = 55, VAN_COST = 70;
    final int ECON_PASSENG = 4, INTERN_PASSENG = 4, STAND_PASSENG = 5, VAN_PASSENG = 7;
    final Comfort ECON_COMF = Comfort.Poor, INTERN_COMF = Comfort.Medium,
            STAND_COMF = Comfort.Good, VAN_COMF = Comfort.Medium;
    final double gasCost = 2.25;

    int perDayCost, carPassengers;
    double totalCost, carMPG;
    String carMake, carModel;
    Comfort comfort;
    Category carType;

    public Car(Category carType, String carMake, String carModel, double carMPG) {
        this.carType = carType;
        this.carMake = carMake;
        this.carModel = carModel;
        this.carMPG = carMPG;
        switch(carType) {
            case Economy:
                perDayCost = ECON_COST;
                comfort = ECON_COMF;
                carPassengers = ECON_PASSENG;
                break;
            case Intermediate:
                perDayCost = INTERN_COST;
                comfort = INTERN_COMF;
                carPassengers = INTERN_PASSENG;
                break;
            case Standard:
                perDayCost = STAND_COST;
                comfort = STAND_COMF;
                carPassengers = STAND_PASSENG;
                break;
            case Van:
                perDayCost = VAN_COST;
                comfort = VAN_COMF;
                carPassengers = VAN_PASSENG;
                break;
        }
    }

    public void calculateTotalCost(int rentalDays, int mileage) {
        totalCost = rentalDays * perDayCost +  mileage / carMPG * gasCost;
    }
}