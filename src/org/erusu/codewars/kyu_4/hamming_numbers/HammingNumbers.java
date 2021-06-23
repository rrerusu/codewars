package org.erusu.codewars.kyu_4.hamming_numbers;

import java.util.*;
import java.util.stream.*;
import java.lang.Math;

public class HammingNumbers {
	public static long hamming(int n) {
		long hammingNum = 0;
		for(int counter = 0; counter < n; counter++) {
			long prevHammingNum = hammingNum;
			hammingNum++;
			while(!isHammingNum(hammingNum)) {
				hammingNum++;
			}

			// System.out.println(counter + 1 + ": " + hammingNum);
		}
		return hammingNum;
	}

	public static boolean isHammingNum(long num) {
		if(num % 2 == 0)
			num = continuousDivide(num, 2);
		if(num % 3 == 0)
			num = continuousDivide(num, 3);
		if(num % 5 == 0)
			num = continuousDivide(num, 5);

		return num == 1;
	}

	public static long continuousDivide(long num, int divisor) {
		while(num % divisor == 0) {
			num /= divisor;
		}

		return num;
	}


	// fastest way: storing whole set
	static TreeSet<Long> hammingSet = new TreeSet<>();

	public static TreeSet<Long> recursiveSet(TreeSet<Long> oldSet, int size) {
		TreeSet<Long> hammingSet = new TreeSet<>(oldSet);
		Iterator<Long> hammingIterator = oldSet.iterator();

		if(size < 1)
			return oldSet;

		while(hammingIterator.hasNext()) {
			long nextVal = hammingIterator.next();

			// System.out.println(nextVal);
			hammingSet.add(nextVal * 2);
			hammingSet.add(nextVal * 3);
			hammingSet.add(nextVal * 5);
		}

		System.out.println(hammingSet.toString());
		hammingSet.addAll(recursiveSet(hammingSet, size - 1));
		return hammingSet;
	}

	public static long hamming2(int n) {
		if(hammingSet.isEmpty()) {
			int totalHammingLength = 5000;
			TreeSet<Long> one = Arrays.stream(new Long[]{1L})
				.collect(Collectors.toCollection(TreeSet::new));
			hammingSet = recursiveSet(one, (int)Math.sqrt(totalHammingLength) + 1);
		}

		Iterator<Long> hammingIterator = hammingSet.iterator();

		int returnCounter = 1;
		long nextVal;
		while(hammingIterator.hasNext()) {
			nextVal = hammingIterator.next();

			if(Long.signum(nextVal) == 1) {
				if(returnCounter == n)
					return nextVal; // hammingIterator.next();
				// hammingIterator.next();
				returnCounter++;
			}
		}

		return 0L;
	}


	// smallest way someone else did it
	public static long hamming3(int n) {
		long[] h = new long[n];
		h[0] = 1;
		long x2 = 2, x3 = 3, x5 = 5;
		int i = 0, j = 0, k = 0;

		for (int index = 1; index < n; index++) {
			h[index] = Math.min(x2, Math.min(x3, x5));
			if (h[index] == x2) x2 = 2 * h[++i];
			if (h[index] == x3) x3 = 3 * h[++j];
			if (h[index] == x5) x5 = 5 * h[++k];
		}

		return h[n - 1];
	}
}
/*
public static long hamming(int n) {
		long hammingNum = 0;
		for(int counter = 0; counter < n; counter++) {
			long prevHammingNum = hammingNum;
			hammingNum++;
			while(!isHammingNum(hammingNum)) {
				hammingNum++;
			}

			System.out.println(counter + 1 + ": " + hammingNum + ", difference = " + (hammingNum - prevHammingNum));
		}
		return hammingNum;
	}

	public static boolean isHammingNum(long num) {
		if(num % 2 == 0)
			num = continuousDivide(num, 2);
		if(num % 3 == 0)
			num = continuousDivide(num, 3);
		if(num % 5 == 0)
			num = continuousDivide(num, 5);

		return num == 1;
	}

	public static long continuousDivide(long num, int divisor) {
		while(num % divisor == 0) {
			num /= divisor;
		}

		return num;
	}
 */
