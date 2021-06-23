package org.erusu.codewars.kyu_4.hamming_numbers;

import java.util.*;
import java.util.stream.*;

public class HammingNumbersDriver {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		/*
		for(int counter = 1; counter <= 5000; counter++) {
			System.out.println(HammingNumbers.hamming2(counter));
		}
		*/
		// System.out.println(HammingNumbers.hamming2(7));

		System.out.println(HammingNumbers.hamming3(5000));

		System.out.println(HammingNumbers.hamming(7));
		System.out.println("Elapsed Time: " + (System.currentTimeMillis() - start));
	}
}
