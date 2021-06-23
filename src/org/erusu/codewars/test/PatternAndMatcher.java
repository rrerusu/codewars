package org.erusu.codewars.test;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class PatternAndMatcher {
    public static void main(String[] args) {
        String testString = "This is a test";
        System.out.println(testString.substring(15));

        StringBuffer myStringBuffer = new StringBuffer();

        Matcher myMatcher = Pattern.compile("(\\w+)[ ]").matcher(testString);
        while(myMatcher.find()) {
            System.out.println(myMatcher.group(1));
        }
    }
}
