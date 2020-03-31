package com.pattern.design.adapter;

public class WallSocketImpl implements WallSocket {

	@Override
	public Volt getVolts() {
		return new Volt(240);
	}

}
