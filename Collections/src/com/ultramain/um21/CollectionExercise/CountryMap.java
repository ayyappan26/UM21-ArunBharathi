package com.ultramain.um21.CollectionExercise;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author Arun Bharathi
 * CountryMap will store country name and capital name as key/value pair in HashMap and stores and retrieves the data
 */
public class CountryMap {
	
	HashMap<String, String> M1 = new HashMap<String, String>();
	

	/**
	 * @param CountryName
	 * @param Captial
	 * @return The key/value pair (CountrY Name/Captial) will passed and stored in the HashMap M1 and returns M1
	 */
	public HashMap<String, String> storeCountryCaptial(String CountryName, String Captial) {
		
		M1.put(CountryName, Captial);
		return M1;
		
	}
	
	/**
	 * @param CountryName
	 * The Key(Country Name) will be passed to retrieve the suitable Value(Capital Name) 
	 */
	public void retrieveCaptial(String CountryName) 
	{
		
		if(M1.containsKey(CountryName)) 
		{
			System.out.println("The Captial of " + CountryName + "is : " + M1.get(CountryName));
		}

	}
	
	/**
	 * @param captialName
	 * The Value(Captial Name) will be passed to retrieve the suitable Key(Country Name)
	 */
	public void retrieveCountry(String captialName)
	{
		for(Entry<String, String> entry: M1.entrySet())
		{
			if(entry.getValue() == captialName) 
			{
				System.out.println("The Country which has " + captialName + " as capital is : " + entry.getKey());
			}
		}
		
	}
	public static void main(String[] args) {
		
		CountryMap countryMap = new CountryMap();
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		String countryName,captialName;
		System.out.println("Enter the number of captial and country to be added : ");
		count = scanner.nextInt();
		for(int i = 0; i < count; i++)
		{
			System.out.println("Enter Country Name " + (i+1) + " : ");
			countryName = scanner.next();
			
			System.out.println("Enter Captial Name " + (i+1) + " : ");
			captialName = scanner.next();
			
			countryMap.storeCountryCaptial(countryName, captialName);
		}
		
		System.out.println("Enter the Country Name to retrieve captial : ");
		countryName = scanner.next();
		countryMap.retrieveCaptial(countryName);
		
		System.out.println("Enter the Captial Name to retrieve Country : ");
		captialName = scanner.next();
		countryMap.retrieveCountry(captialName);
		
		scanner.close();
	}

}
