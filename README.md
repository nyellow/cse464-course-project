# CSE 464 Course Project

For this project, your team will be building a car rental application to find the cheapest car rental base on car rental price and gas mileage.   The application should also account for the number of passengers when making the right decision.

## Part I – Implementation 

Your team is responsible for building the application base on the specifications below: 

#### 1. Car Selection – each team member is to select 3 cars from the Kelley Blue Book site (https://www.kbb.com).   
- You can choose from the following category: SUV, Crossover, Sedan, Truck, Coupe, Hybrid, and Van/Minivan. 
- You must use all categories.
- No cars can be repeated (therefore, do not choose the same make and model as your teammate).  

#### 2. Cars are to be grouped into one of the 4 hierarchical structure – Economy, Intermediate, Standard, and Van.  
- Economy
  - Rental Cost: $45 per day
  - Max Passengers:  4
  - Comfort Level: Poor
  - Car Category: Coupe

- Intermediate
  - Rental Cost: $50 per day
  - Max Passengers: 4
  - Comfort Level: Medium
  - Car Category: Sedan, Hybrid

- Standard
  - $55 per day
  - Max Passengers: 5
  - Comfort Level: Good
  - Car Category: Truck, Crossover, SUV

- Van
  - $70 per day
  - Max Passengers: 7
  - Comfort Level: Medium
  - Car Category: Van/Minivan 

#### 3.	Assume gas is approximate $2.25 per gallon, use that information to calculate the mileage cost.  

#### 4.	Users will provide the following information: 
-	Number of passengers
-	Number of rental days. 
-	Approx. mileage for the trip   

The application will utilize this information to determine the type of car, which is most suitable for the user.   Car selection should be based on overall cost and then comfort level.  If one or more cars, meets that requirement, then those cars should be displayed to the user.   

#### 5.	Output:  User must be able to see the car make and model, the number of passengers it could fit, and the total cost associated with the trip.   

---

## Part II – Testing (Individual Assignment)

Using integration testing, perform testing on the application.   You will need to use all testing techniques learned in the course.    If a defect is found, you are responsible for creating a defect report.   

Project Timeline: 

#### Part 1 is due on Saturday, 11/11/2017 (300 Points)

-	Completed project 
-	Source code in a zip file

#### Part 2 is due on Wednesday, 11/29/2017 (200 Points)

-	List of testing techniques used
-	Documentations on how test cases were developed
-	EclEmma Coverage Report
-	List of Junit Test Cases

Extra Credit: For every valid defect report submitted, you may earn 5 extra credit points up to 20 points possible.   On the contrary, 10 points will be deducted from the source code team.  

---

## Course Project (Revision/Change Request)

Due to recent manufacturer recalls and limited car selections, your team is required to make the following changes to your application: 

#### 1. Due to recall, the following make will be removed from rental selections:
- Acura
- Buick
- Cadillac
- Scion
- Smart
- Sabaru
- Toyota
- Mazda

#### 2. Due to cost, the following make will also be removed from rental selections:
-	Alfa Romeo
-	Aston Martin
-	Audi
-	Bentley
-	BMW
-	Ferrari
-	Freightliner
-	Genesis
-	INFINITI
-	Jeep
-	Jaguar
-	Lamborghini
-	Land Rover
-	Lexus
-	Lincoln
-	Lotus
-	Maserati
-	McLaren
-	MINI
-	Mercedes-Benz
-	Porsche
-	Rolls-Royce
-	Tesla
-	Volvo

#### 3. Due to shortages, rental prices have gone up base on the following make and model: 
- Additional 10% charge will be added to the car rental fees for all Honda sedan, hybrid, and SUV. 
- Additional 5% charge will be added to the car rental fees for all American make cars (which includes: Chevrolet, Chrysler, Dodge, Ford, and GMC)

#### 4.	Rental companies are also offering a promotion discount for all intermediate and standard cars.    For every 5 rental days, customer will receive a free day on their 6th day.  
