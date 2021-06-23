package org.erusu.codewars.kyu_6;

import java.util.Arrays;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {

        return Arrays.stream(array1)
        .filter((testWord) -> {
            for(String word : array2) {
                if(word.contains(testWord))
                    return true;
            }
            return false;
        })
        .distinct()
        .filter((word) -> word != "")
        .sorted()
        .toArray(String[]::new);

    }
}
