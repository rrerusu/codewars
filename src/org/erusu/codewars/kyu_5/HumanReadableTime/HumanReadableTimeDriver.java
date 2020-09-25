package org.erusu.codewars.kyu_5.HumanReadableTime;

public class HumanReadableTimeDriver {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		System.out.println(HumanReadableTime.makeReadable(359999));

		System.out.println("Elapsed Time: " + (System.currentTimeMillis() - start));
	}
}
