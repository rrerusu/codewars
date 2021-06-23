package org.erusu.codewars.kyu_6;

import java.lang.Math;

public class Prime {
    public static boolean isPrime(int num) {
        if(num <= 3)
            return num > 1;

        for(int divisor = 2; divisor <= ((int) Math.sqrt(num)); divisor++) {
            if(isPrime(divisor)) {
                if (num % divisor == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isPrime2(int num) {
        int divisor = 2;

        if(num <= 3)
            return num > 1;

        while(divisor <= ((int) Math.sqrt(num))) {
            if(isPrime2(divisor))
                if(num % divisor == 0)
                    return false;
            divisor++;
        }

        return true;
    }
}