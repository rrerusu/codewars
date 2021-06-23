package org.erusu.codewars.kyu_7;

public class ExesAndOhs {
    public static boolean getXO (String str) {

        // Variables to store x's and o's
        int xCount = 0, oCount = 0;

        // Convert string to lowercase to account for capital X's and O's
        str.toLowerCase();

        // Loop trough string, add 1 to xCount if char is x and oCount if char is o
        for(int counter = 0; counter < str.length(); counter++) {
            xCount = (str.toLowerCase().charAt(counter) == 'x')? xCount + 1 : xCount;
            oCount = (str.toLowerCase().charAt(counter) == 'o')? oCount + 1 : oCount;
        }

        return xCount == oCount;
    }
}
