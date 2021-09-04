package com.ultramain.um21.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author Arun Bharathi
 * In the class UniqueCollection the String array will be converted to unique and sorted form
 */
public class UniqueCollection {

	/**
	 * @param array
	 * @return TreeSet treeSet
	 * In this method a String array is passed as argument 
	 * It will return TreeSet treeSet which has unique and stored format of the array
	 */
	public TreeSet<String> getCollection(String[] array)
	{
		HashSet<String> hashSet = new HashSet<String>(Arrays.asList(array));
		TreeSet<String> treeSet = new TreeSet<String>(hashSet);
		
		return treeSet;
	}
	public static void main(String[] args) {
		
		UniqueCollection uniqueCollection = new UniqueCollection();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of elements : ");
		int arrayCount = scanner.nextInt();
		String[] array = new String[arrayCount];
		
		System.out.println("Enter the String values : ");
		for(int i = 0;i < arrayCount; i ++)
		{
			String str = scanner.next();
			array[i] = str;
		}
		System.out.println("The Unique and Sorted Values : ");
		System.out.println(uniqueCollection.getCollection(array));
		scanner.close();
	}

}
