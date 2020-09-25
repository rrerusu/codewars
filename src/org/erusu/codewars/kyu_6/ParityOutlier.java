package org.erusu.codewars.kyu_6;

import java.util.Arrays;
import java.lang.Math;

public class ParityOutlier {
    public static int find_1(int[] integers){
        int[] mod2Integers = Arrays.copyOf(integers, integers.length);

        int index = 0;

        Arrays.setAll(mod2Integers, (index1) -> Math.abs(mod2Integers[index1] % 2));

        while(mod2Integers[index] == mod2Integers[index + 1])
            index++;

        if(index > 1)
            return integers[index + 1];
        else {
            if(mod2Integers[2] == mod2Integers[1])
                return integers[0];
            else
                return integers[1];
        }
    }

    public static int find_2(int[] integers){
        int index = 0;

        while(Math.abs(integers[index] % 2) == Math.abs(integers[index + 1] % 2))
            index++;

        if(index > 1)
            return integers[index + 1];
        else {
            if(Math.abs(integers[2] % 2) == Math.abs(integers[1] % 2))
                return integers[0];
            else
                return integers[1];
        }
    }
}
