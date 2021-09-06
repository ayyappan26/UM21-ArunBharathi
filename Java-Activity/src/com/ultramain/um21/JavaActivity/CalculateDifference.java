package com.ultramain.um21.JavaActivity;

import java.util.Scanner;

/**
 * @author Arun Bharathi
 * The class CalculateDifference will give difference between sum of the squares and squares of the sum
 */
public class CalculateDifference {

	/**
	 * @param n
	 * @return integer difference
	 * The variable difference will store the sum of the squares and squares of the sum and return it to main method 
	 */
	public int calculateDifference(int n) {
		
		int square = 0, values = 0, difference;
		for(int i = 1; i <= n; i++) {
			values += i;
			square += i*i;
			
		}
		difference = square - (values * values);
		
		return difference;
	}
	
	public static void main(String argd[]) {
		
		CalculateDifference calculatedifference = new CalculateDifference();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		
		System.out.println("The Result of the entered number : ");
		System.out.println(calculatedifference.calculateDifference(number));
		
		scanner.close();
	}
}
