package org.erusu.codewars.kyu_6;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MorseCodeDecoder {
    public static String decode(String morse) {
        return morse.replaceAll("\\s?([^\\s+])\\s?", "$1");
    }
}