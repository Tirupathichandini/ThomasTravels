package com.model;

public class Driver {

		private int driverId;
	    private String category;
	    private String driverName;
	    private double totalDistance;

	    public Driver() {

	    }

	    public Driver(int driverId, String driverName, String category, double totalDistance) {
	    	
	        this.driverId = driverId;
	        this.driverName = driverName;
	        this.category = category;
	        this.totalDistance = totalDistance;
	    }

	    public int getDriverId() {
	    	
	        return driverId;
	    }
	    
	    public String getCategory() {
	    	
	        return category;
	    }

	    public String getDriverName() {
	    	
	        return driverName;
	    }

	    public double getTotalDistance() {
	    	
	        return totalDistance;
	    }

	    public void setDriverId(int driverId) {
	    	
	        this.driverId = driverId;
	    }
	    
	    public void setCategory(String category) {
	    	
	        this.category = category;
	    }

	    public void setDriverName(String driverName) {
	    	
	        this.driverName = driverName;
	    }

	    public void setTotalDistance(double totalDistance) {
	    	
	        this.totalDistance = totalDistance;
	    }
	}


