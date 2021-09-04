package com.ultramain.um21.Strings;

/**
 * @author Arun Barathi
 * Basic String Operations
 */
public class String1 {

	public static void main(String[] args) {
		
		String string="Welcome to Java World";
		
		System.out.println("Character at 5th position : " + string.charAt(4));
		
		System.out.println("Comparing Welcome lexicographically ignoring case differences : " + string.compareTo("Welcome"));

		string = string + "-Let us learn";
		System.out.println(string);
		
		int occurrence = string.indexOf('a');
		System.out.println("First occurence of 'a' " + (occurrence+1));
		
		System.out.println("The string between 4th position and 10th position : " + string.substring(3, 10));
		
		System.out.println("The lowercase of the string : " + string.toLowerCase());
	}

}
