package com.ultramain.um21.Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Arun Bharathi
 * Sorting of elements using Set which is passed as array 
 */
public class ListManager1 {
	
	/**
	 * @param array
	 * @return The list contains the sorted elements
	 */
	public List<String> getArrayList(String[] array) {
		
		List<String> list = Arrays.asList(array);
		TreeSet<String> treeSet = new TreeSet<String>(list);
		List<String> list1 = new ArrayList<String>(treeSet);
		return list1;
	}
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ListManager1 listManager = new ListManager1();
		System.out.println("Enter the number of elements : ");
		int length = scanner.nextInt();
		String[] array = new String[length];
		System.out.println("Enter the elements ");
		for(int i = 0; i < length; i++) {
			array[i] = scanner.next();
		}
		System.out.println(listManager.getArrayList(array));
		
		scanner.close();
	}

}
