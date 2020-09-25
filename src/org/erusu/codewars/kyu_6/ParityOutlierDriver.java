package org.erusu.codewars.kyu_6;

public class ParityOutlierDriver {
    public static void main(String args[]) {
        long start = System.currentTimeMillis();

        // System.out.println(ParityOutlier.find_1(new int[] {2, 4, 6, 5, 8, 10, 12}));
        System.out.println(ParityOutlier.find_2(new int[] {Integer.MAX_VALUE, 0, 1}));

        System.out.println("Time taken: " + (System.currentTimeMillis() - start));
    }
}
