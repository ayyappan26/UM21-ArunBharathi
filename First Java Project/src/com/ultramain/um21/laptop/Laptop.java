package com.ultramain.um21.laptop;

public class Laptop {
	
	
	private String model;
	private String companyName;
	private String processorType;
	private int ramSize;
	private int year;
	
	public Laptop() {}
	
	public void setModel(String model)
	{
		this.model = model; 
	}
	public String getModel() {
		return model;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}
	public String getProcessorType() {
		return processorType;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setYear(int year){
		this.year=year;
	}
	public int getYear() {
		return year;
	}
	public void displayLaptopDetails(Laptop laptop)
	{
		
		System.out.println("Model          :"+ laptop.getModel());
		System.out.println("Company Name   :"+ laptop.getCompanyName());
		System.out.println("Processor Type :"+ laptop.getProcessorType());
		System.out.println("Ram Size       :"+ laptop.getRamSize());
		System.out.println("Year           :"+ laptop.getYear());
	}
}
