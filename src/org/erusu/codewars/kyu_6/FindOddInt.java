package org.erusu.codewars.kyu_6;

public class FindOddInt {
    public static int findIt(int[] a) {

        int currentNum, testNum, numCounter = 0;

        for(int index = 0; index < a.length; index++) {
            currentNum = a[index];

            for(int testIndex = 0; testIndex < a.length; testIndex++) {
                testNum = a[testIndex];
                if(testNum == currentNum)
                    numCounter++;
            }

            if(numCounter % 2 == 1)
                return currentNum;
        }

        return 0;
    }

    /*
        Alternate Solution:
        * xor test for each character

        test xor for each character, the matching characters will cancel each other out and leave
        the only extra character

        public static int findIt(int[] A) {
            int xor = 0;
            for (int i = 0; i < A.length; i++) {
              xor ^= A[i];
            }
            return xor;
        }

        * xor and lambda expression
        public static int findIt(int [A]) {
            return stream(arr).reduce(0, (x, y) -> x ^ y);
        }
     */
}
