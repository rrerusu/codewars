package org.erusu.codewars.kyu_6;

import java.lang.StringBuilder;

public class BreakCamelCase {
    public static String camelCase(String input) {

        // Build string more efficiently
        StringBuilder builder = new StringBuilder();

        // Store current letter for understandability
        char currentLetter;

        // Loop through each letter
        for(int counter = 0; counter < input.length(); counter++) {

            // set currentLetter to letter being checked
            currentLetter = input.charAt(counter);

            // if letter ascii value is in the Capital range, add space
            if(currentLetter > 64 && currentLetter < 91)
                builder.append(" ");

            // add letter to string
            builder.append(currentLetter);
        }

        return builder.toString();
    }
}
