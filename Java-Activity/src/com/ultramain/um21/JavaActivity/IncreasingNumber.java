package com.ultramain.um21.JavaActivity;

import java.util.Scanner;

/**
 * @author Arun Bharathi
 * The class IncreasingNumbers will check the increasing number 
 */
public class IncreasingNumber {

	/**
	 * @param number
	 * @return boolean
	 * This method check and returns whether the given number is in increasing order on not
	 */
	public boolean checkNumber(int number)
	{
		int large = 9;
		while(number > 0) 
		{
			int remainder = number % 10;
			if(remainder > large)
			{
				return false;
			}
			else
			{
				large = remainder;
			}
			number /= 10;
		}
		return true;
	}
	public static void main(String[] args) {
		
		IncreasingNumber increasingNumber = new IncreasingNumber();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int number = scanner.nextInt();
		if(increasingNumber.checkNumber(number))
		{
			System.out.println("The entered number is Increasing Number ");
			
		}
		else
		{
			System.out.println("Not a Increasing Number ");
		}
		
		scanner.close();
	}

}
