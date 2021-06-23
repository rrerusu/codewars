package org.erusu.codewars.kyu_7.simple_string_reversal;

import java.lang.StringBuilder;

public class SimpleStringReversal {
	public static String solve(String s) {
		StringBuilder myBuilder = new StringBuilder(s.replaceAll(" ", "")).reverse();

		for(int index = 0; index < s.length(); index++) {
			if(s.charAt(index) == ' ')
				myBuilder.insert(index, " ");
		}

		return myBuilder.toString();
	}
	/*
		Other solution: Interesting way to use IntStream to use IntStream to affect 2 variables
	public static String solve(String s){
        StringBuilder str = new StringBuilder(s.replaceAll(" ", "")).reverse();
        IntStream.range(0, s.length())
                .filter(i -> s.charAt(i) == ' ')
                .forEach(j -> str.insert(j, ' '));
        return str.toString();
    }
	 */
}
