package org.erusu.codewars.kyu_6;

public class PersistentBugger {
    public static int persistence(long n) {

        int counter = 0, productOfDigits;

        while(Long.toString(n).length() > 1) {
            productOfDigits = Long.toString(n).chars().reduce(1, (val1, val2) -> val1 * (val2 - 48));
            n = productOfDigits;
            counter++;
        }
        return counter;
    }

    public static int persistence2(long n) {
        long m = 1, r = n;

        if (r / 10 == 0)
            return 0;

        for (r = n; r != 0; r /= 10)
            m *= r % 10;

        return persistence(m) + 1;

    }
}
