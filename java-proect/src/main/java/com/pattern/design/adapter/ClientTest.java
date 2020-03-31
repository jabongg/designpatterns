package com.pattern.design.adapter;

public class ClientTest {

	public static void main(String[] args) {
		WallSocket wallSocket = new WallSocketImpl();
		Volt v220 = wallSocket.getVolts();
		System.out.println(v220);
		
		MobileAdapter mobileAdapter = new MobileAdapterImpl(wallSocket);
		Volt v3 = mobileAdapter.get3Volt();
		System.out.println(v3);
		
		
	}
}
