package org.erusu.codewars.kyu_6;
import java.util.ArrayList;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        // Arraylist to hold 'element' 's values
        ArrayList<Integer> processedNums = new ArrayList<Integer>(0);

        // Array to return to user
        int[] changedElements;

        // Convert Array into ArrayList with only non-repeated values
        for(int element : elements) {

            // Var to store occurrences of element in processedNums
            int occurrences = countNums(element, processedNums);

            // Does the current value repeat more than the allowed number of times?
            if(occurrences < maxOccurrences)
                processedNums.add(element);
        }

        // Set changedElements to same size as processedNums
        changedElements = new int[processedNums.size()];

        // Set values in changedElements to same values as processedNums
        for(int counter = 0; counter < processedNums.size(); counter++)
            changedElements[counter] = processedNums.get(counter).intValue();

        return changedElements;
    }

    // Count the number of times 'testValue' shows up in 'nums'
    public static int countNums(int testValue, ArrayList<Integer> nums) {

        // Counter variable to check to count the number of repeated occurrences
        int numCounter = 0;

        // Test ever value to see if it matches 'testValue' and add it to counter
        for(int num: nums) {

            // Is current num the value being counted for?
            if(num == testValue)
                numCounter++;
        }

        return numCounter;
    }
}
