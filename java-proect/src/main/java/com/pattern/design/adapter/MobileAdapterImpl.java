package com.pattern.design.adapter;

public class MobileAdapterImpl implements MobileAdapter {

	
	private WallSocket wallSocket;
	
	
	public MobileAdapterImpl(WallSocket wallSocket) {
		super();
		this.wallSocket = wallSocket;
	}


	@Override
	public Volt get3Volt() {
		
		int v240 = wallSocket.getVolts().getVolts();
		int v3 =  v240 / 80;
		
		return new Volt(v3);
	}

}
