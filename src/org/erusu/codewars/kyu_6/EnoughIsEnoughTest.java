package org.erusu.codewars.kyu_6;
import java.util.Arrays;

public class EnoughIsEnoughTest {
    public static void main(String[] args) {
        int[] test = EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3);

        System.out.println(Arrays.toString(test));
    }
}
