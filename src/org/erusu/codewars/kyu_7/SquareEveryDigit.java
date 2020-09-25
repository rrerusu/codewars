package org.erusu.codewars.kyu_7;

import java.util.function.Function;
import java.lang.StringBuilder;
import java.lang.Math;

public class SquareEveryDigit {
    static public int squareDigits_1(int n) {
        String squareNum = "";
        int numLength = Integer.toString(n).length();
        Function<Integer, String> concatenator = num -> (Integer.toString(num * num));

        for(int digit = 0; digit <= numLength; digit++) {
            squareNum += concatenator.apply(n / (int) Math.pow(10, numLength - digit));
            n %= (int) Math.pow(10, numLength - digit);
        }
        return Integer.parseInt(squareNum);
    }

    static public int squareDigits_2(int n) {
        String num = String.valueOf(n);
        StringBuilder builder = new StringBuilder();

        for(int index = 0; index < num.length(); index++) {
            builder.append((int) Math.pow(Integer.parseInt("" + num.charAt(index)), 2));
        }

        return Integer.parseInt(builder.toString());
    }
}