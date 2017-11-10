

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
        
        // if the car is a Honda add a 10% rental fee to it
        if (this.carMake.equals("Honda")) 
        {
        	totalCost = totalCost + (totalCost * .10);
        }
        
        // if the car is an American brand add a 5% fee
        else if(this.carMake.equals("Ford") || this.carMake.equals("Chevrolet") || this.carMake.equals("Chrysler")
        		|| this.carMake.equals("Dodge") || this.carMake.equals("GMC"))
        {
        	totalCost = totalCost + (totalCost * .05);
        			
        }
        
        // give a free day for every 5 days rented out 
        if(this.carType == Category.Intermediate || this.carType == Category.Standard) {
        	
        	int costOfaDay = 0; 
        	
        	// determine the cost of renting for renting for one day by determining car category.
        	if(this.carType == Category.Intermediate) {
        		costOfaDay = 50; 
        	}
        	else {
        		costOfaDay = 55;
        	}
        	
        	// divide total rental days by 5 giving the amount of 5 day intervals during the rental period
        	// multiply this by the cost of each day to get the discount quantity.
        	int discount = (int)(rentalDays/5) * costOfaDay;
        	
        	totalCost = totalCost - discount; 
        	
        }
    }
}