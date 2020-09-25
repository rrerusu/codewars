package org.erusu.codewars.kyu_5;

import java.util.Arrays;

public class PickPeaksTest {
    public static void main(String[] args) {
        double start = System.currentTimeMillis();

        System.out.println(Arrays.toString(PickPeaks.getPeaks(new int[]{17, 7, -2, -5, -4, -3, 0, 0, 11, 10, 3})
                .values().toArray()));

        System.out.println("Elapsed time: " + (System.currentTimeMillis() - start));
    }
}