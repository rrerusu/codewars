package org.erusu.codewars.kyu_3.smaller_than_me_2;

import java.util.Random;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class SmallerThanMe2Driver {
	public static void main(String[] args) {
		Random randGen = new Random();

		int[] test = new int[1000000];

		for(int index = 0; index < 1000000; index++) {
			test[index] = randGen.nextInt(100000);
		}

		long start = System.currentTimeMillis();

		// new int[]{5, 4, 7, 9, 2, 4, 4, 5, 6}
//		Map<Integer, Integer> result = SmallerThanMe2.createTreeMap(new int[]{5, 4, 7, 9, 2, 4, 4, 5, 6});
		int[] resultarr = SmallerThanMe2.findSmallerReverse(test);

		long stop = System.currentTimeMillis();

		for(int num : resultarr)
			System.out.print(num + " ");

		System.out.println("\n\nLength: " + resultarr.length);

//		System.out.println(result.toString());

		System.out.println("\nElapsed time: " + (stop - start));
	}
}
