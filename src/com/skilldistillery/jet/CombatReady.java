package com.skilldistillery.jet;

public class CombatReady extends FighterJet {

	public CombatReady(String model, double mph, int range, long price, double mach) {
		super(model, mph, range, price, mach);
	}
	
	public void fight() {
	System.out.println("Jet is combat Ready");

	}
}
