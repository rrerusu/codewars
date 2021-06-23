package org.erusu.codewars.kyu_8.compare_with_margin;

public class CompareWithMarginTest {
	public static void main(String[] args) {
		System.out.printf("5, 3: %d\n", CompareWithMargin.closeCompare(5, 3));
		System.out.printf("3, 5, 0: %d\n", CompareWithMargin.closeCompare(3, 5, 0));
		System.out.printf("5, 3, 0: %d\n", CompareWithMargin.closeCompare(5, 3, 0));
	}
}
