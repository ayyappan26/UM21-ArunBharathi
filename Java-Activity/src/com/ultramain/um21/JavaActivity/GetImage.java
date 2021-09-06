package com.ultramain.um21.JavaActivity;

import java.util.Scanner;

/**
 * @author Arun Bharathi
 * The GetImage class will give the mirror image of a string addes with '|' and the original String
 */
public class GetImage {

	/**
	 * @param input
	 * @return String stringBuffer
	 * Here the StringBuffer class is used to concatenate and reverse the string
	 */
	public String getImage(String input) {
		
		StringBuffer stringBuffer = new StringBuffer(input);
		StringBuffer stringBuffer1 = new StringBuffer(stringBuffer.reverse());
		StringBuffer stringBuffer2 = new StringBuffer();
		stringBuffer2.append(input);
		stringBuffer2.append('|');
		stringBuffer2.append(stringBuffer1);
		return stringBuffer2.toString();
	}
	public static void main(String[] args) {
		
		GetImage getimage = new GetImage();
		Scanner scanner = new Scanner(System.in);
		
		String input;
		System.out.println("Enter the String to be Mirrored : ");
		input = scanner.next();
		
		System.out.println("The Imaged String : ");
		System.out.println(getimage.getImage(input));

		scanner.close();
	}

}
