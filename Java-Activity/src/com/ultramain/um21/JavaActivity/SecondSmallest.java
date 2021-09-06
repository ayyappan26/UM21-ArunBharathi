package com.ultramain.um21.JavaActivity;

import java.util.Scanner;
import java.util.Arrays;

/**
 * @author Arun Bharathi
 * The Second Smallest element in an array
 */
public class SecondSmallest {

	/**
	 * @param array
	 * @return int second smallest element in an array
	 * It return the second smallest element in the array
	 */
	public int getSecondSmallest(int[] array)
	{
		
		Arrays.sort(array);
		return array[array.length-2];
	}
	public static void main(String[] args) {
		
		SecondSmallest secondSmallest = new SecondSmallest();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of array : ");
		int length = scanner.nextInt();
		
		int array[] = new int[length];
		System.out.println("Enter the Array elements : ");
		for(int i = 0; i < length; i++)
		{
			array[i] = scanner.nextInt();
		}
		
		System.out.println("The Second Smallest Element in the array is : " + secondSmallest.getSecondSmallest(array));
		
		scanner.close();
	}

}
