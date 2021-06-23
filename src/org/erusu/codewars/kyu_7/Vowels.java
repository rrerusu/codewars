package org.erusu.codewars.kyu_7;

public class Vowels {
    public static int getCount(String str) {

        // declare and initialize variable to keep track of vowels
        int vowelsCount = 0;

        // loop through and count up all the vowels
        for(int counter = 0; counter < str.length(); counter++)
            if(str.charAt(counter) == 'a' ||
               str.charAt(counter) == 'e' ||
               str.charAt(counter) == 'i' ||
               str.charAt(counter) == 'o' ||
               str.charAt(counter) == 'u')
                vowelsCount++;

        /*
            Alternate Solutions:
            * use str.toCharArray and test each of the values
            for(char c : str.toCharArray())
                vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;

            * an interesting query
            return str.replaceAll("(?i)[^aeiou]", "").length();
         */

        return vowelsCount;
    }
}
