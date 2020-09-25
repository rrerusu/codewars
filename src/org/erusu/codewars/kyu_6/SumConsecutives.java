package org.erusu.codewars.kyu_6;

import java.util.List;
import java.util.ArrayList;

public class SumConsecutives {
    public static List<Integer> sumConsecutives(List<Integer> s) {

        // ArrayList to make list mutable
        List<Integer> processedNums = new ArrayList<Integer>(s);

        // Variable to keep track of consecutive number
        int consecutiveNum = 0;

        // Loop through input array
        for(int counter = 0; counter < processedNums.size() - 1; counter++) {

            consecutiveNum = processedNums.get(counter);
            while(consecutiveNum == processedNums.get(counter + 1)) {
                processedNums.set(counter, processedNums.get(counter) + consecutiveNum);
                processedNums.remove(counter + 1);
            }
        }

        return processedNums;
    }

    /*
        Alternate Solution:
        * Use LinkedList to test for the last value
        public static List<Integer> sumConsecutives(List<Integer> s) {
          int previous = Integer.MAX_VALUE;
          LinkedList<Integer> l = new LinkedList<>();
          for (Integer v: s){
             l.add(v == previous? l.pollLast() + v : v);
             previous = v;
          }
          return l;
        }`
     */
}
