package org.erusu.codewars.kyu_4;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
import java.math.BigInteger;

public class DifferentiatePoly {
    public static BigInteger differentiate(String expression, long x) {

        // ArrayList to hold split terms
        List<String> splitExpression = splitTerms(expression);

        // String variables
        // Keep track of term being looked at
        String term = "";

        // Integer Variables
        // Derivative at certain point
        BigInteger derivative = new BigInteger("0");

        // Power to set X to when calculating derivative
        BigInteger power;

        // Coefficient for term
        BigInteger coefficient = new BigInteger("1");

        // Coefficient to replace x
        BigInteger newX = new BigInteger("" + x);

        // Calculate derivative
        for(int counter = 0; (counter < splitExpression.size()); counter++) {

            // For the sake of understandability
            term = splitExpression.get(counter);

            // if term is only negative sign, set coefficient to -1
            if(term.equals("-"))
                splitExpression.set(counter, "-1");

                // if term is only positive sign, set coefficient to 1
            else if(term.equals("+"))
                splitExpression.set(counter, "1");

            else if(term.charAt(0) == 'x') {    // Calculate terms with x

                // Get coefficient if there is one (keep negative that was infront of x)
                if(counter != 0) {

                    coefficient = new BigInteger(splitExpression.get(counter - 1));
                }

                // If x has a power
                if(term.length() > 1) {

                    // in "x^2", power would be whatever is after "^"
                    power = new BigInteger(term.substring(2));
                } else {

                    // term would just be 'x'
                    power = new BigInteger("1");
                }

                derivative = derivative.add(coefficient.multiply(newX.pow(power.intValue() - 1).multiply(power)));
            }
        }

        return derivative;
    }

    public static List<String> splitTerms(String expr) {

        // Arraylist to hold derivative
        List<String> processedExpr = new ArrayList<>();

        // Last value in derivative List
        int lastValIndex = 0;

        // Current character being read in for loop
        String currentChar = "";

        // Put a String.valueOf(char) in each arrayList slot and concatenate numbers and signs
        for(int counter = 0; counter < expr.length(); counter++) {

            // Set character to variable
            currentChar = String.valueOf(expr.charAt(counter));

            // Is current character x, +, or -
            // Or is this the first character of the sequence
            if(currentChar.equals("+") ||
               currentChar.equals("-") ||
               currentChar.equals("x") ||
               counter == 0) {

                // Add character if it cannot be appended
                processedExpr.add(currentChar);
            } else {    // Concatenate current character to last value in processed Expr

                lastValIndex = (processedExpr.size() - 1);
                processedExpr.set(lastValIndex, processedExpr.get(lastValIndex) + currentChar);
            }
        }

        return processedExpr;
    }
}