package com.pattern.design.adapter;

public class Volt {

	public int volts;

	
	public Volt(int volts) {
		super();
		this.volts = volts;
	}

	public int getVolts() {
		return volts;
	}

	public void setVolts(int volts) {
		this.volts = volts;
	}

	@Override
	public String toString() {
		return "Volt [volts=" + volts + "]";
	}
	
	
}
