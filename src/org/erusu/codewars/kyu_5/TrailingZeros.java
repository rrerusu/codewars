package org.erusu.codewars.kyu_5;

public class TrailingZeros {
    public static int zeros(int n) {
        int trailingZeros = 0;

        while(n > 4) {
            n /= 5;
            trailingZeros += n;
        }

        return trailingZeros;
    }

    public static int zeros2(int n) {
        return (n < 5)? 0 : zeros2(n / 5) * 5 + 1;
    }
}