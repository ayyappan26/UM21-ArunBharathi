package com.ultramain.um21.CollectionExercise;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Arun Bharathi
 * Two ArrayList that stores even numbers in a ArrayList and the double of number in another ArrayList 
 */
public class EvenNumbers {

	ArrayList<Integer> A1 = new ArrayList<Integer>();
	ArrayList<Integer> A2 = new ArrayList<Integer>();
	
	/**
	 * @param N
	 * @return ArrayList A1 
	 * ArrayList A1 which contains the Even Numbers upto the value passed N
	 */
	public ArrayList<Integer> storeEvenNumbers(int N) {
		
		
		for(int i = 2; i < N; i=i+2)
		{
			
			A1.add(i);
		}
		if(N % 2 == 0)
			A1.add(N);
		return A1;
	}
	
	/**
	 * @return ArrayList A2
	 * ArrayList A2 which contains the doubled value of Even Numbers in the ArrayList A1
	 */
	public ArrayList<Integer> storeEvenNumbers()
	{
		for(int i = 0; i < A1.size(); i++)
		{
			A2.add(A1.get(i)*2);
		}
		return A2;
	}
	
	/**
	 * @param N
	 * @return integer 0 or passed value
	 * This will return the passed value if the value is in ArrayList A1 else return 0 
	 */
	public int retrieveEvenNumber(int N) {
		
		if(A1.contains(N))
			return N;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		
		
		
		EvenNumbers evenNumbers = new EvenNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value to store the elements");
		int element = scanner.nextInt();
		System.out.println("The values of the Stored Elements                 : " + evenNumbers.storeEvenNumbers(element));
		
		System.out.println("The values of the Stored Elements multiplied by 2 : " + evenNumbers.storeEvenNumbers());
		
		System.out.println("Enter the value to be searched : ");
		int searchValue = scanner.nextInt();
		System.out.println("The Existence o the value is : " + evenNumbers.retrieveEvenNumber(searchValue));
		scanner.close();
	}

}
