package org.erusu.codewars.kyu_4;

import java.util.Arrays;
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 19faa84b31e7a982ec7eb3074c4fc0e1d96e64d7

public class DifferentiatePolyTest {
    public static void main(String[] args) {
        // System.out.println(Arrays.deepToString(DifferentiatePoly.splitTerms("12x+2").toArray()));

        // System.out.println(DifferentiatePoly.differentiate("x^3+x-3", 2L));

        System.out.println(DifferentiatePoly.differentiate("x^2+3x+2", 5L));
<<<<<<< HEAD
=======
import java.util.Scanner;

public class DifferentiatePolyTest {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        // System.out.println(Arrays.deepToString(DifferentiatePoly.splitTerms("12x+2").toArray()));

        // System.out.println(DifferentiatePoly.differentiate("x^3+x-3", 2L));
		System.out.print("Enter derivative: ");
		String derivative = input.nextLine();

		System.out.print("Enter x coordinate: ");
		long x = input.nextLong();

		System.out.println(DifferentiatePoly.splitTerms(derivative));
		System.out.println(DifferentiatePoly.differentiate(derivative, x));

//      System.out.println(DifferentiatePoly.differentiate("x^2+3x+2", 5L));
>>>>>>> bc4c0dd (Trying to push everything back to github)
=======
>>>>>>> 19faa84b31e7a982ec7eb3074c4fc0e1d96e64d7
    }
}
