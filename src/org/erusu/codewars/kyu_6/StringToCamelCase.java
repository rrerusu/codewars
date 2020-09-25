package org.erusu.codewars.kyu_6;

import java.lang.StringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToCamelCase {
    /*
    public static String toCamelCase(String s){

        // StringBuilder for efficient string manipulation
        StringBuilder builder = new StringBuilder();

        // current character: for readability
        char currentChar;

        // loop through each character
        for(int index = 0; index < s.length(); index++) {

            // set currentChar to character being checked
            currentChar = s.charAt(index);

            // is this character - or _?
            if(currentChar == '-' || currentChar == '_') {

                // add next character in uppercase to builder
                builder.append(Character.toUpperCase(s.charAt(index + 1)));

                // skip next letter in loop
                index++;
            } else {    // add letter to builder
                builder.append(currentChar);
            }
        }

        return builder.toString();
    }
    */
    public static String toCamelCase(String s){
        Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group(1).toUpperCase());
        }
        return m.appendTail(sb).toString();
    }
}
