package org.erusu.codewars.kyu_4.CatchingCarMileageNumbers;

//import java.util.Arrays;
//import java.util.function.Predicate;
//import java.util.stream.Stream;

import java.lang.StringBuilder;

public class CatchingCarMileageNumbers {
	public static int isSpecialNum(int num, int[] specialNums) {
		if(num < 98)
			return 0;

		if(runTests(num, specialNums))
			return 2;
		else if(runTests(num + 1, specialNums) || runTests(num + 2, specialNums))
			return 1;

		return 0;
	}

	public static boolean runTests(int num, int[] testNums) {
		return (zeroesTest(num) ||
			sameDigitsTest(num) ||
			increasingNumsTest(num) ||
			decreasingNumsTest(num) ||
			palindromeTest(num) ||
			givenNumsTest(num, testNums)) &&
			num > 99;
	}

	public static boolean zeroesTest(int num) {
		String strOfNum = "" + num;

		for(int digit = 1; digit < strOfNum.length(); digit++) {
			if(Character.getNumericValue(strOfNum.charAt(digit)) != 0)
				return false;
		}
		return true;
	}

	public static boolean sameDigitsTest(int num) {
		String strOfNum = "" + num;

		for(int digit = 1; digit < strOfNum.length(); digit++) {
			if(strOfNum.charAt(digit) != strOfNum.charAt(0))
				return false;
		}
		return true;
	}

	public static boolean increasingNumsTest(int num) {
		String strOfNum = "" + num;

		for(int digit = 1; digit < strOfNum.length(); digit++) {
			if(Character.getNumericValue(strOfNum.charAt(digit)) !=
				(Character.getNumericValue(strOfNum.charAt(digit - 1)) + 1) % 10)
				return false;
		}
		return true;
	}

	public static boolean decreasingNumsTest(int num) {
		String strOfNum = "" + num;

		for(int digit = 1; digit < strOfNum.length(); digit++) {
			if(Character.getNumericValue(strOfNum.charAt(digit)) !=
				(Character.getNumericValue(strOfNum.charAt(digit - 1)) - 1) % 10)
				return false;
		}
		return true;
	}

	public static boolean palindromeTest(int num) {
		StringBuilder myBuilder = new StringBuilder("" + num);

		return num == Integer.parseInt(myBuilder.reverse().toString());
	}

	public static boolean givenNumsTest(int num, int[] testNums) {
		for(int testNum : testNums) {
			if(num == testNum)
				return true;
		}
		return false;
	}

//	    // VERY Interesting Way: Lambda - Predicate Stream
//
////	    import java.util.Arrays;				// Arrays.stream in line 97
////	 	import java.util.function.Predicate;	// Lambda Function at line 92
////	 	import java.util.stream.Stream;			// Stream to return stream at line 93 for .anyMatch() boolean return at line 99
//
//	    // create stream of lambda functions
//	    public static boolean isReallyInteresting(int number, final int[] awesomePhrases) {
//	 		return Stream.<Predicate<String>>of(										// Specifically state <Predicate<String>> because it is not implicit
//	 				s -> s.matches("\\d0+"),										// test for each digit to be the same: s -> s.matcher("(\\d)+")
//	 				s -> new StringBuilder(s).reverse().toString().equals(s),
//	 				s -> "1234567890".contains(s),
//	 				s -> "9876543210".contains(s),
//	 				s -> Arrays.stream(awesomePhrases).anyMatch(n -> Integer.parseInt(s) == n)
//	 		).anyMatch( p -> number > 99 && p.test(Integer.toString(number)));	// p is a predicate function, test is defined in Predicate interface
//	 	  }
//
//	 	  public static int isInteresting(int number, int[] awesomePhrases) {
//	 		return isReallyInteresting(number, awesomePhrases) ? 2 :
//	 			   isReallyInteresting(number + 1, awesomePhrases) ? 1 :
//	 			   isReallyInteresting(number + 2, awesomePhrases) ? 1 : 0;
//	 	  }
}
