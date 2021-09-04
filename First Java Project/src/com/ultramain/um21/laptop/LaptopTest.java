package com.ultramain.um21.laptop;


public class LaptopTest {

	public static void main(String[] args) {

		Laptop laptop = new Laptop();

		laptop.setModel("Pavilion");
		laptop.setCompanyName("HP");
		laptop.setProcessorType("i5");
		laptop.setRamSize(8);
		laptop.setYear(2020);

		// Display dis=new Dispaly();
		laptop.displayLaptopDetails(laptop);
	}

}
