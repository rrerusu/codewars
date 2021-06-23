package org.erusu.codewars.kyu_5;

public class TrailingZerosDriver {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        // System.out.println(TrailingZeros.zeros(625));
        System.out.println(TrailingZeros.zeros2(625));

        System.out.println("Elapsed time: " + (System.currentTimeMillis() - start));
    }
}
