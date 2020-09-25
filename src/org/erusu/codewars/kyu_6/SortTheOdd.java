package org.erusu.codewars.kyu_6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        List<Integer> sortedOddInts = Arrays.stream(array).sequential()
                              .filter(num -> num % 2 == 1)
                              .sorted().boxed().collect(Collectors.toList());

        return Arrays.stream(array).map(num -> switchNums(sortedOddInts, num)).toArray();
    }

    public static int switchNums(List<Integer> sortedOddInts, int num) {
        if(num % 2 == 1) {
            num = sortedOddInts.get(0);
            sortedOddInts.remove(0);
        }
        return num;
    }

    public static int[] sortArray2(int[] array) {
        List<Integer> sortedOddInts = Arrays.stream(array).sequential()
                .filter(num -> num % 2 == 1)
                .sorted().boxed().collect(Collectors.toList());

        return Arrays.stream(array).map(num -> {
            if(num % 2 == 1) {
                num = sortedOddInts.get(0);
                sortedOddInts.remove(0);
            }
            return num;
        }).toArray();
    }
}
