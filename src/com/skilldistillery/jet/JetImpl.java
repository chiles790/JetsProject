package com.skilldistillery.jet;

public abstract class JetImpl extends Jet {

	public JetImpl(String model, double mph, int range, long price, double mach) {
		super(model, mph, range, price, mach);
	}

	@Override
	public String toString() {
		return "JetImpl [getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice() + ", getGetSpeedInMach()=" + getGetSpeedInMach() + "]";
	} 

	

}
