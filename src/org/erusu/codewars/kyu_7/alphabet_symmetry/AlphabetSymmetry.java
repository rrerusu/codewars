package org.erusu.codewars.kyu_7.alphabet_symmetry;

public class AlphabetSymmetry {
	private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

	public static int[] solve(String[] groupOfLetters) {

		int[] returnArr = new int[groupOfLetters.length];

		for(int counter = 0; counter < groupOfLetters.length; counter++) {
			for(int charIndex = 0; charIndex < groupOfLetters[counter].length() && charIndex < 26; charIndex++) {
				if(groupOfLetters[counter].toLowerCase().charAt(charIndex) == alphabet.charAt(charIndex)) {
					returnArr[counter]++;
				}
			}
		}

		return returnArr;
	}
}
