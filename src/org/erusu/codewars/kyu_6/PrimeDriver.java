package org.erusu.codewars.kyu_6;

public class PrimeDriver {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        System.out.println(Prime.isPrime(1000000007));
        // System.out.println(Prime.isPrime2(1000000007));

        System.out.println("Elapsed Time: " + (System.currentTimeMillis() - start));
    }
}
