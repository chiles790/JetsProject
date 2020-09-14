package com.skilldistillery.jet;

public class Jet {
	private String model;
	private double speed;
	private double range;
	private long price;
	private double getSpeedInMach;

	public Jet(String model, double mph, double range, long price, double mach) {
		this.model = model;
		this.speed = mph;
		this.range = range;
		this.price = price;
		this.getSpeedInMach = mach;
	}
	
	@Override
	public String toString() {
		return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + " million"
				+ ", getSpeedInMach=" + getSpeedInMach + "]";
	}
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed; 
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public void fly() {
		
	}
	
	public double getGetSpeedInMach() {
		return getSpeedInMach;
	}

	public void setGetSpeedInMach(double getSpeedInMach) {
		this.getSpeedInMach = getSpeedInMach;
	}
	public void loadCargo() {
		
	}
	

	public void fight() {
		System.out.println("Dogfight!");
	}

}
