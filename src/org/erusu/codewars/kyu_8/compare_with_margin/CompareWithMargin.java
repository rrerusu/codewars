package org.erusu.codewars.kyu_8.compare_with_margin;

public class CompareWithMargin {
	public static int closeCompare(double a, double b) {
		// return (a == b) ? 0 : ((a > b) ? 1 : -1);
		return Double.compare(a, b);
	}

	public static int closeCompare(double a, double b, double margin) {
		return (Math.abs(a - b) > margin) ? closeCompare(a, b) : 0;
	}
}
