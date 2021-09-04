package com.ultramain.um21.Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Arun Bharathi
 * It removes the repeated elements in both list and return the List that doesn't have duplicates
 */
public class ListManager {

	/**
	 * @param list1
	 * @param list2
	 * @return the list of non duplicates
	 */
	public List<String> removeElements(List<String> list1, List<String> list2) {
		

		list1.retainAll(list2);
		
		
		return list1;
	}
	public static void main(String[] args) {
		
		ListManager listManager = new ListManager();
		Scanner scanner = new Scanner(System.in);
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		
		int length1, length2;
		System.out.println("Enter the number of elements in list 1 : ");
		length1 = scanner.nextInt();
		System.out.println("Enter the elements of List1 ");
		for(int i = 0; i < length1; i++ )
		{
			list1.add(scanner.next());
		}
		
		System.out.println("Enter the number of elements in list 2 : ");
		length2 = scanner.nextInt();
		System.out.println("Enter the elements of List2 ");
		for(int i = 0; i < length2; i++ )
		{
			list2.add(scanner.next());
		}
		System.out.println("The elements removed list");
		System.out.println(listManager.removeElements(list1, list2));
		
		scanner.close();
		
	}

}
