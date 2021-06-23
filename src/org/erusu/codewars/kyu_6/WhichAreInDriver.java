package org.erusu.codewars.kyu_6;

import java.util.Arrays;

public class WhichAreInDriver {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        System.out.println(Arrays.toString(WhichAreIn.inArray(new String[]{"tarp", "mice", "bull"},
                            new String[] { "lively", "alive", "harp", "sharp", "armstrong" })));

        System.out.println("Elapsed time: " + (System.currentTimeMillis() - start));
    }
}