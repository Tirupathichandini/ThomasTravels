package com.service;

import com.model.Driver;

public class Travel {

	    public boolean isCarDriver(Driver driver) {

	        if (driver.getCategory().equalsIgnoreCase("Car")) {
	        	
	            return true;
	        }

	        return false;
	    }

	    public String retrivebyDriverId(Driver[] drivers, int driverId) {

	        for (Driver driver : drivers) {

	            if (driver.getDriverId() == driverId) {

	                return "Driver name is " + driver.getDriverName()
	                        + " Belonging to the category " + driver.getCategory()
	                        + " traveled " + driver.getTotalDistance()
	                        + " KM so far.";
	            }
	        }

	        return null;
	    }

	    public int retriveCountOfDriver(Driver[] drivers, String category) {

	        int count = 0;

	        for (Driver driver : drivers) {

	            if (driver.getCategory().equalsIgnoreCase(category)) {
	                count++;
	            }
	        }

	        return count;
	    }

	    public Driver[] retriveDriver(Driver[] drivers, String category) {

	        int count = retriveCountOfDriver(drivers, category);

	        Driver[] result = new Driver[count];

	        int index = 0;

	        for (Driver driver : drivers) {

	            if (driver.getCategory().equalsIgnoreCase(category)) {
	                result[index] = driver;
	                index++;
	            }
	        }

	        return result;
	    }

	    public Driver retriveMaximumDistanceTravelledDriver(Driver[] drivers) {

	        Driver maxDriver = drivers[0];

	        for (Driver driver : drivers) {

	            if (driver.getTotalDistance() > maxDriver.getTotalDistance()) {
	                maxDriver = driver;
	            }
	        }

	        return maxDriver;
	    }
	}


