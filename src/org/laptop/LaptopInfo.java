package org.laptop;

import org.Phone.PhoneInformation;

//different package

public class LaptopInfo {
	private void laptopName() {
		System.out.println("laptop name is:sony");
	}
	private void processorName() {
		System.out.println("processor name is :intel core i5");
	}
	private void harddiskCapacity() {
		System.out.println("harddisk capacity is:1TB");
	}
	public static void main(String[] args) {
		LaptopInfo a = new LaptopInfo();
		a.laptopName();
		a.processorName();
		a.harddiskCapacity();
		
		PhoneInformation p = new PhoneInformation();
		p.phoneName();
		p.phoneIme();
		p.phoneCamera();
		p.phoneStorage();
		p.osName();
	}
	}
		
		


