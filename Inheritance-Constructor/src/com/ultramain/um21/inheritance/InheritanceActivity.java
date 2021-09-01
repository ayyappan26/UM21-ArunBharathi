package com.ultramain.um21.inheritance;



class Employee {

	public long employeeId;
	public String employeeName;
	public String employeeAddress;
	public long employeePhone;
	public double basicSalary;
	public double specialAllowance = 250.80;
	public double Hra = 1000.50;
	Employee(){}
	
	Employee(long Id, String Name, String address, long phone){
		
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}
	
		public double calculateSalary(double basicSalary) {
		
		
		double salary;
		salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * Hra/100);
		this.basicSalary= salary;
		return basicSalary;
	
	}
		public void calculateTransportAllowance(double basicSalary) {
			
			double transportAllowance = 10 * basicSalary / 100;
			System.out.println("Transport Allowance       :" + transportAllowance);
			System.out.println("\n");
		}
	
	public void displayDetails()
	{
		System.out.println("Employee ID    		  :" + employeeId);
		System.out.println("Employee Name   	  :" + employeeName);
		System.out.println("Employee Address	  :" + employeeAddress);
		System.out.println("Employee Phone        :" + employeePhone);
		System.out.println("Employee Basic Salary :" + basicSalary);
	}
	
	
}

class Manager extends Employee{
	
	public Manager(long Id, String Name, String address, long phone, double salary) {
		
		super(Id, Name, address, phone);
	}
	public void calculateTransportAllowance(double basicSalary) {
		
		double transportAllowance = 15 * basicSalary / 100;
		System.out.println("Transport Allowance       :" + transportAllowance);
		System.out.println("\n");
	}
}

class Trainee extends Employee{
	
	public Trainee(long Id, String Name, String address, long phone, double salary) {
		
		super(Id, Name, address, phone);
		
	}
}
class InheritanceActivity{
	public static void main(String args[]) {
		
		Manager manager=new Manager(126534, "Peter", "Chennai India", 237844, 65000.00);
		manager.calculateSalary(65000);
		manager.displayDetails();
		manager.calculateTransportAllowance(65000);
		
		Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		trainee.calculateSalary(45000);
		trainee.displayDetails();
		trainee.calculateTransportAllowance(45000);
		
	}
}
