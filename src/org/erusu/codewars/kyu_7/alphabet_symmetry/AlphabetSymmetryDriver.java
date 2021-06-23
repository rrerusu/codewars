package org.erusu.codewars.kyu_7.alphabet_symmetry;

public class AlphabetSymmetryDriver {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		int[] numArr = AlphabetSymmetry.solve(new String[]{"abcdefghijklmnopqrstuvwxyzt"});

		for(int num : numArr) {
			System.out.println(num);
		}

		System.out.println("Elapsed Time: " + (System.currentTimeMillis() - start));
	}
}
