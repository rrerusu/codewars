package org.erusu.codewars.kyu_4.square_into_squares;

/*
import java.lang.Math;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
*/

import java.util.*;

public class SquareIntoSquares {

	public static String decompose(long num){

		// Any value under 4 doesnt work
		if(num < 4)
			return null;

		List<Long> decomposition;
		ArrayList<Long> startingNums = new ArrayList<>(Arrays.asList(num - 1));

		long total = num * 2 - 1;
		decomposition = calcDecomposition(total, startingNums);

		do {
			if (decomposition.size() == decomposition.stream().distinct().count() &&
				decomposition.stream()
					.reduce(0L, (num1, num2) -> num1 + num2 * num2) == num * num) {

				Collections.reverse(decomposition);
				return decomposition.toString().replaceAll("\\W+", " ").trim();
			} else {
				total = startingNums.stream()
					.reduce(0L, (num1, num2) -> num1 + num2 * num2);
				startingNums = new ArrayList<>(detNewStartingNums(total, decomposition));
				decomposition = calcDecomposition(num * num - total, startingNums);
			}
		} while(Math.pow(decomposition.get(0), 2) > Math.pow(num, 2) / 2);

		return null;
	}

	public static List<Long> calcDecomposition(long num, ArrayList<Long> partialDec) {
		long nextNum;

		while(num > 0) {
			nextNum = (long) Math.sqrt(num);
			partialDec.add(nextNum);
			num -= Math.pow(nextNum, 2);
		}
		return partialDec;
	}

	public static List<Long> detNewStartingNums(long ttl, List<Long> decomposition) {

		long total = ttl;

		for(int counter = 0; counter < decomposition.size() - 1; counter++) {
			// If decomposition contains duplicate nums, take them out and reprocess
			if(decomposition.get(counter) == decomposition.get(counter + 1)) {
				decomposition.set(counter - 1, decomposition.get(counter - 1) - 1);
				return detNewStartingNums(ttl, decomposition);

			// if num isn't ideal, subtract from the next num and reprocess
			} else if(Math.pow(decomposition.get(counter + 1), 2) * 2 <
				total - Math.pow(decomposition.get(counter), 2)) {
				decomposition.set(counter, decomposition.get(counter) - 1);
				return decomposition.subList(0, counter + 1);
			}

			total -= Math.pow(decomposition.get(counter), 2);
		}

		return decomposition;
	}

	/*
		Better Solution: Less cluttery, completely recursive

	 */
		private static String tryDecomp(long nb, long rac) {
		if (nb == 0) return "";
		String l = null;
		long i = rac;
		while (i >= (long)Math.sqrt(nb/2.0) + 1) {
			long diff = nb - i * i;
			rac = (long)Math.sqrt(diff);
			l = tryDecomp(diff, rac);
			if (l != null) { return l + " " + i; }
			i -=1;
		}
		return null;
	}
	public static String decompose2(long n) {
		String l = tryDecomp(n * n, (long)Math.sqrt(n * n - 1));
		return l != null ? l.trim() : l;
	}
}

/*
	public static String decompose(long num){
		List<Long> decomposition;
		ArrayList<Long> startingNums = new ArrayList<>(Arrays.asList(num - 1));
		decomposition = calcDecomposition(num * 2 - 1, startingNums);

		do {
			if (decomposition.size() == decomposition.stream().distinct().count()) {
				Collections.reverse(decomposition);
				return decomposition.toString().replaceAll("\\W+", " ").trim();
			} else {
				startingNums = new ArrayList<>(detNewStartingNums(decomposition));
				decomposition = calcDecomposition(num * num - startingNums.stream()
					.reduce(0L, (num1, num2) -> num1 + num2 * num2), startingNums);
			}
		} while(Math.pow(decomposition.get(0), 2) > Math.pow(num, 2) / 2);

		return null;
	}

	public static List<Long> calcDecomposition(long num, ArrayList<Long> partialDec) {
		long nextNum;

		while(num > 0) {
			nextNum = (long) Math.sqrt(num);
			partialDec.add(nextNum);
			num -= Math.pow(nextNum, 2);
		}
		return partialDec;
	}

	public static List<Long> detNewStartingNums(List<Long> decomposition) {

		for(int counter = 0; counter < decomposition.size() - 1; counter++) {
			if(decomposition.get(counter) == decomposition.get(counter + 1)) {
				decomposition.set(counter - 1, decomposition.get(counter - 1) - 1);
				return decomposition.subList(0, counter);
			}
		}

		return new ArrayList<>();
	}
 */
