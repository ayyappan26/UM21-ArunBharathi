package com.ultramain.um21.Strings;

/**
 * @author Arun Bharathi
 * The class String2 will display the various operations performed using String Buffer
 */
public class String2 {

	public static void main(String args[]) {
		
		StringBuffer stringBuffer = new StringBuffer("This is StringBuffer");
		
		stringBuffer.append("- This is a sample program");
		System.out.println("The Concatenated String : " + stringBuffer);
		
		
		System.out.println("Inserts the string “Object” into the existing string at 21st postion : " + stringBuffer.insert(21, "Object "));
		
		System.out.println("Buffer replaces with Builder : " +stringBuffer.replace(14, 20, "Builder" ));
		
		System.out.println("Reversed String : " + stringBuffer.reverse());
		
		
	}
}
