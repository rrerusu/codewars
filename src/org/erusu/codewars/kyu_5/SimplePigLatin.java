package org.erusu.codewars.kyu_5;

import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimplePigLatin {
    public static String pigIt(String str) {
        Matcher myMatcher = Pattern.compile("(\\w+)").matcher(str);
        StringBuffer pigLatinStr = new StringBuffer();

        Function<String, String> createPigLatin = (word) ->  word.substring(1) + word.charAt(0) + "ay";

        while(myMatcher.find()) {
            myMatcher.appendReplacement(pigLatinStr, createPigLatin.apply(myMatcher.group(1)));
        }

        myMatcher.appendTail(pigLatinStr);

        return pigLatinStr.toString();
    }
}