package org.erusu.codewars.kyu_6;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class SumConsecutivesTest {
    public static void main(String[] args) {
        List<Integer> i = Arrays.asList(1,4,4,4,0,4,3,3,1);

        System.out.println(SumConsecutives.sumConsecutives(i));
    }
}