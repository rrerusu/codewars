package org.erusu.codewars.kyu_6;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Arrays;

import java.util.Map;
import java.util.HashMap;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int doubleCount = 0;

        char[] sortedChars = text.toLowerCase().toCharArray();
        Arrays.sort(sortedChars);

        Matcher multipleLetters = Pattern.compile("(\\w)\\1+").matcher(new String(sortedChars));
        while(multipleLetters.find()) {
            doubleCount++;
        }

        return doubleCount;
    }

    public static int duplicateCountWithMap(String text) {
        Map<Character, Integer> chars = new HashMap<>();
        int doubleCount = 0;

        for(char ch : text.toLowerCase().toCharArray()) {
            if(!chars.containsKey(ch))
                chars.put(ch, 1);
            else
                chars.replace(ch, chars.get(ch) + 1);
        }

        for(int keyIndex = 0; keyIndex < chars.size(); keyIndex++) {
            if(!chars.values().toArray()[keyIndex].equals(1))
                doubleCount++;
        }

        return doubleCount;
    }
}