package com.tester;

import com.model.Driver;
import com.service.Travel;

public class Test {

	public static void main(String[] args) {

		        Driver[] drivers = {
		        		
		                new Driver(101, "Sudhagar", "Car", 4200),
		                new Driver(102, "Ramesh", "Auto", 2500),
		                new Driver(103, "Suresh", "Car", 5000),
		                new Driver(104, "Mahesh", "Lorry", 7000),
		                new Driver(105, "Kiran", "Auto", 3000)
		        };

		        Travel travel = new Travel();

		        // 1. Check Car Driver
		        System.out.println( "Is Sudhagar a car Driver? " + travel.isCarDriver(drivers[0]));

		        // 2. Retrieve Driver by ID
		        System.out.println(travel.retrivebyDriverId(drivers, 102));

		        // 3. Count Drivers by Category
		        System.out.println("Number of Car Drivers: " + travel.retriveCountOfDriver(drivers, "Car"));

		        // 4. Retrieve Drivers by Category
		        Driver[] carDrivers = travel.retriveDriver(drivers, "Car");

		        System.out.println("Car Drivers:");

		        for (Driver driver : carDrivers) {

		            System.out.println(
		                    driver.getDriverName()
		                    + " - "
		                    + driver.getCategory()
		            );
		        }

		        // 5. Find Maximum Distance Driver
		        Driver maxDriver = travel.retriveMaximumDistanceTravelledDriver(drivers);

		        System.out.println("Maximum Distance Driver: " + maxDriver.getDriverName() + " traveled "
		                + maxDriver.getTotalDistance() + " KM"
		        );
		    }
}
