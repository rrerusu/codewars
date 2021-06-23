package org.erusu.codewars.kyu_6;

import java.lang.StringBuilder;

public class RegularCaseToCamel {
    public static String camelCase(String str) {

        // StringBuilder to efficiently edit strings
        StringBuilder builder = new StringBuilder();

        // keep track if next value should become uppercase
        boolean upperConvert = true;

        // loop through each letter
        for(int counter = 0; counter < str.length(); counter++) {

            // if this character is space, set upperConvert to true
            if(str.charAt(counter) == ' ') {
                upperConvert = true;
            } else {    // if this character is a letter

                // if we need to capitalize this letter, add its capital to builder
                if(upperConvert) {

                    builder.append(Character.toUpperCase(str.charAt(counter)));

                    // set upperConvert to false to keep only one capital letter
                    upperConvert = false;
                } else    // if we dont need to capitalize, just add character to builder
                    builder.append(str.charAt(counter));

            }
        }

        return builder.toString();
    }
}
