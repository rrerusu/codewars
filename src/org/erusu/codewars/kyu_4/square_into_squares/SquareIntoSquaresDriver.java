package org.erusu.codewars.kyu_4.square_into_squares;

import java.util.*;
import java.util.Arrays;

public class SquareIntoSquaresDriver {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		System.out.println(SquareIntoSquares.decompose2(10));

		// System.out.println(SquareIntoSquares.detNewStartingNums(Arrays.asList(18833L, 194L, 5L, 2L, 1L, 1L)));

		// 18834 = 1 2 4 6 19 193 18833

		System.out.println("Elapsed Time: " + (System.currentTimeMillis() - start));
	}
}
