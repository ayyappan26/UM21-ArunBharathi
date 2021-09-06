package com.ultramain.um21.JavaActivity;

import java.util.Scanner;

/**
 * @author Arun Bharathi
 * The CalculateSum class will give the sum of first n natural number which are divisible by 3 or 5
 */
public class CalculateSum {

	/**
	 * @param n
	 * @return interger sum
	 * Here the values which are divisible by 5 and 3 are added between 1 to n and returned it to main method5
	 */
	public int calculateSum(int n){

		int sum = 0;
		for(int i = 1; i <= n; i++){
			if(i % 5 == 0 || i % 3 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		CalculateSum calculatesum = new CalculateSum();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		
		System.out.println("The Result of the entered number : ");
		System.out.println(calculatesum.calculateSum(number));
		
		scanner.close();
	}

}
