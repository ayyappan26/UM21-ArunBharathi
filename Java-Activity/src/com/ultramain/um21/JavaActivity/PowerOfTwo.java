package com.ultramain.um21.JavaActivity;

import java.util.Scanner;

/**
 * @author Arun Bharathi
 *
 */
public class PowerOfTwo {

	/**
	 * @param n
	 * @return boolean
	 * This method will check whether the given number is power of two or not
	 */
	public boolean checkNumber(int n)
	{
		while(n != 1 ) 
		{
			if(n % 2 != 0)
			{
				return false;
			}
			n = n/ 2;
		}
		
		return true;
	}
	
	public static void main(String args[])
	{
		PowerOfTwo powerOfTwo = new PowerOfTwo();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		
		if(powerOfTwo.checkNumber(number))
		{
			System.out.println("The number " + number + " is power of Two ");
		}
		else
		{
			System.out.println("The number " + number + " is not power of Two ");
		}
		
		scanner.close();
	}
}
