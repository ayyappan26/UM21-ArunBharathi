package com.ultramain.um21.Dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author Arun Bharathi
 * In this class DateExercise Various forms of date are printed
 */
public class DateExercise {
	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
		format.setTimeZone(TimeZone.getTimeZone("EST"));
		System.out.println(format.format(date));

		format = new SimpleDateFormat("yy/m/dd h:mm a");
		System.out.println(format.format(date));

		format = new SimpleDateFormat("h:mm:ss a");
		System.out.println(format.format(date));

		format = new SimpleDateFormat("MMM dd,yyyy h:mm:ss a");
		System.out.println(format.format(date));

		format = new SimpleDateFormat("h:mm a");
		System.out.println(format.format(date));

		format = new SimpleDateFormat("h:mm:ss a");
		System.out.println(format.format(date));

		format = new SimpleDateFormat("h:mm:ss a z");
		format.setTimeZone(TimeZone.getTimeZone("EST"));
		System.out.println(format.format(date));

		format = new SimpleDateFormat("MMM dd,yyyy h:mm a");
		System.out.println(format.format(date));

		format = new SimpleDateFormat("MMMM d,yyyy h:mm:ss a z");
		format.setTimeZone(TimeZone.getTimeZone("EST"));
		System.out.println(format.format(date));

	}
}