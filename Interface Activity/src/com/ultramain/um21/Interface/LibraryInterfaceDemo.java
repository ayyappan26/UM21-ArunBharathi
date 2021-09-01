package com.ultramain.um21.Interface;

interface LibraryUser{
	
	void registerAccount(int age);
	void requestBook(String bookType);
}

class AdultUsers implements LibraryUser{
	
	int age;
	String bookType;
	
	AdultUsers(){
		
	}
	
	AdultUsers(int age, String bookType){
		this.age = age;
		this.bookType = bookType;
	}
	
	public void registerAccount(int age)
	{
		if(age > 12) {
			System.out.println("You have successfully registered under an Adult Account. \n");
		}
		else {
			System.out.println("Sorry, Age must be greater than 12 to register as an Adult. \n");
		}
	}
	
	public void requestBook(String bookType) {
		if(bookType.equals("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days. \n");
		}
		else {
			System.out.println("Oops, you are allowed to take only adult fiction books. \n");
		}
	}
}

class KidUsers implements LibraryUser{
	
	int age;
	String bookType;
	
	KidUsers(){
		
	};
	
	KidUsers(int age, String bookType){
		this.age = age;
		this.bookType = bookType;
	}
	
	public void registerAccount(int age)
	{
		if(age<12) {
			System.out.println("You have successfully registered under a Kids Account. \n");
		}
		else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid. \n");
		}
		
	}
	
	public void requestBook(String bookType) {
		if(bookType.equals("Kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days. \n");
		}
		else {
			System.out.println("Oops, you are allowed to take only kids books. \n");
		}
	}
}

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
		KidUsers kidUser=new KidUsers();
		kidUser.registerAccount(10);
		kidUser.registerAccount(18);
		
		kidUser.requestBook("Kids");
		kidUser.requestBook("Fiction");

		AdultUsers adultUser=new AdultUsers();
		adultUser.registerAccount(5);
		adultUser.registerAccount(23);
		
		adultUser.requestBook("Kids");
		adultUser.requestBook("Fiction");
	}
}
