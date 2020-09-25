package org.erusu.codewars.kyu_6;

import java.lang.StringBuilder;

public class CamelCaseTranslator {
    public static String toUnderScore(String name){

        // StringBuilder for efficient string concatenation
        StringBuilder builder = new StringBuilder();

        // Character variables
        // present character: for readability
        char currentChar;
        // previous character: for readability
        char previousChar;

        // add first character because it isnt checked in the loop
        builder.append(name.charAt(0));

        // Loop through each character
        for(int index = 1; index < name.length(); index++) {

            currentChar = name.charAt(index);
            previousChar = name.charAt(index - 1);

            // is an underscore needed?
            if( (Character.isUpperCase(currentChar) && previousChar != '_') ||
                (Character.isDigit(currentChar) && Character.isLetter(previousChar)) )

                // add underscore to builder
                builder.append('_');

            // always add current char to builder
            builder.append(currentChar);
        }

        return builder.toString();
    }
}
