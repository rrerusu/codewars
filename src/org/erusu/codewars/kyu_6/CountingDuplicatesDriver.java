package org.erusu.codewars.kyu_6;

public class CountingDuplicatesDriver {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        // System.out.println(CountingDuplicates.duplicateCount("aabbcde"));

        System.out.println(CountingDuplicates.duplicateCountWithMap("aabbcde"));

        System.out.println("Elapsed time: " + (System.currentTimeMillis() - start));
    }
}