package org.erusu.codewars.kyu_5.HumanReadableTime;

import java.lang.Math;

public class HumanReadableTime {
	public static String makeReadable(int seconds) {
		String time = "";
		int timeDigitCounter = 2;

		while(timeDigitCounter >= 0) {
			time += String.format("%02d:", seconds / (int) Math.pow(60, timeDigitCounter));
			seconds %= (int) Math.pow(60, timeDigitCounter--);
		}

		return time.substring(0, time.length() - 1);
	}
}
