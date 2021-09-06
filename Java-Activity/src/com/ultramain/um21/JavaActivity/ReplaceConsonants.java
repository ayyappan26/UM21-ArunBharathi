package com.ultramain.um21.JavaActivity;

import java.util.Scanner;

/**
 * @author Arun Bharathi
 *
 */
public class ReplaceConsonants {

	/**
	 * @param alpha
	 * @return String string
	 * This method will return the next character of each and consonants in the string
	 */
	public String alterString(String alpha)
	{
		String string = "";
		char[] ch=  alpha.toCharArray();
		int val = 0;
		for(int i = 0;i < ch.length; i++)
		{
			if(ch[i] != 'a' || ch[i] != 'e' || ch[i] != 'i' || ch[i] != 'o' || ch[i] != 'u' || ch[i] != 'A' || ch[i] != 'E' || ch[i] != 'I' || ch[i] != 'O' || ch[i] != 'U') 
			{
				val=ch[i]+1;
			    char c=(char)val;
			    string = string + c;
			}
			else
			{
				string += ch[i];
			}
		}
		return string;
	}
	public static void main(String[] args) {
		
		ReplaceConsonants replaceConsonants = new ReplaceConsonants();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String input = scanner.next();
		
		System.out.println("Replaced String :  " + replaceConsonants.alterString(input));
		
		scanner.close();
	}

}
