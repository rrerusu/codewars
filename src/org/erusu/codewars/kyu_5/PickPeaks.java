package org.erusu.codewars.kyu_5;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class PickPeaks {
    public static Map<String, List<Integer>> getPeaks(int[] ranges) {
        Map<String, List<Integer>> result = new HashMap<>();

        List<Integer> peakLocations = new ArrayList<>();

        boolean isPlateau = false;
        int plateauStart = 0;

        for(int counter = 1; counter < ranges.length - 1; counter++) {

            if(isPlateau && ranges[counter + 1] != ranges[plateauStart]) {
                if(ranges[counter + 1] < ranges[plateauStart]) {
                    peakLocations.add(plateauStart);
                }
                isPlateau = false;
            } else if(ranges[counter] > ranges[counter - 1]) {
                if(ranges[counter] > ranges[counter + 1]) {
                    peakLocations.add(counter);
                } else if(ranges[counter] == ranges[counter + 1]) {
                    isPlateau = true;
                    plateauStart = counter;
                }
            }
        }

        result.put("pos", peakLocations);
        result.put("peaks", peakLocations.stream().map(peak -> ranges[peak]).collect(Collectors.toList()));

        return result;
    }
}
