package org.erusu.codewars.kyu_7;

public class SquareEveryDigitTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        // System.out.println(SquareEveryDigit.squareDigits_1(9119));
        System.out.println(SquareEveryDigit.squareDigits_2(9119));

        System.out.println("Milliseconds taken: " + (System.currentTimeMillis() - start));
    }
}
