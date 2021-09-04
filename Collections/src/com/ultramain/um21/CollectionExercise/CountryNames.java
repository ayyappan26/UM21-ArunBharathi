package com.ultramain.um21.CollectionExercise;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Arun Bharathi
 * The class CountryNames name will store and retrieves the country names
 */
public class CountryNames {

	HashSet<String> H1 = new HashSet<String>();
	
	/**
	 * @param CountryName
	 * @return HashSet H1
	 * This method will store the passed country name in HashSet H1 and returns H1
	 */
	public HashSet<String> storeCountryNames(String CountryName) {
		
		H1.add(CountryName);
		return H1;
	}
	
	/**
	 * @param CountryName
	 * This method will return the country name if it has else returns null
	 */
	public void retrieveCountry(String CountryName) {
		
		 if(H1.contains(CountryName)) {
			 
			 System.out.println("The country name exist :" + CountryName);
		 }
		 else {
			 System.out.println("null");
		 }
		
	}
	public static void main(String[] args) {
		
		CountryNames countryNames = new CountryNames();
		int count = 0;
		String countryName, checkCountryName;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of countries to be added : ");
		count = scanner.nextInt();
		
		System.out.println("Eneter the countries Name : ");
		for(int i = 0; i < count; i++) {
			countryName = scanner.next();
			countryNames.storeCountryNames(countryName);
		}
		
		System.out.println("Enter the country to be check : ");
		
		checkCountryName = scanner.next();
		countryNames.retrieveCountry(checkCountryName);
		scanner.close();
	}

}
