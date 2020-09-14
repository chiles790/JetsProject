package com.skilldistillery.jet;

public class CargoCarrier extends Jet{

	public CargoCarrier(String model, double mph, int range, long price, double mach) {
		super(model, mph, range, price, mach);
	}

	public void loadCargo() {
	System.out.println("Cargo is being loaded");
	}


}
