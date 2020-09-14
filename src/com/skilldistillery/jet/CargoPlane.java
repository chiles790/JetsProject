package com.skilldistillery.jet;

public class CargoPlane extends Jet{


	public CargoPlane(String model, double mph, int range, long price, double mach) {
		super(model, mph, range, price, mach);
	
	
	}

	@Override
	public String toString() {
		return "CargoPlane [toString()=" + super.toString() + ", getModel()=" + getModel() + ", getSpeed()="
				+ getSpeed() + ", getRange()=" + getRange() + ", getPrice()=" + getPrice() + ", getGetSpeedInMach()="
				+ getGetSpeedInMach() + "]";
	}
	}
