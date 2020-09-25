package org.erusu.codewars.kyu_6;

import java.util.Arrays;

public class SortTheOddDriver {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        System.out.println(Arrays.toString(SortTheOdd.sortArray(new int[] {5, 3, 2, 8, 1, 4})));
        //System.out.println(Arrays.toString(SortTheOdd.sortArray2(new int[] {5, 3, 2, 8, 1, 4})));

        System.out.println("Elapsed time: " + (System.currentTimeMillis() - start));
    }
}
