package org.erusu.codewars.kyu_6;
// Purpose: test to see if certain words are or close to palindromes

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Instantiate Scanner object 'input'
        Scanner input = new Scanner(System.in);

        // Declare variable to store word
        String word = "";

        // Get word to test to see if it is or close to palindrome
        System.out.print("Enter word: ");
        word = input.next();

        // Test to see if word is palindrome
        if(isPalindrome(word))
            System.out.println("Ok");
        else if(couldBePalindrome(word))
            System.out.println("Almost");
        else
            System.out.println("No");

    }

    // Test to see if 2 letters are the same
    public static boolean isSameChar(char let1, char let2) {

        if(let1 == let2)
            return true;
        else
            return false;
    }

    // Test whether word is a palindrome
    public static boolean isPalindrome(String testWord) {

        /*
            Loop through every letter and see if the word length - letter index
            is the same.  Ignore the middle letter because it doesnt affect whether or not
            a word is a palindrome
         */

        for(int counter = 0; counter < testWord.length(); counter++) {
            if(!isSameChar(testWord.charAt(counter), testWord.charAt((testWord.length() - 1) - counter)))
                return false;
        }

        return true;
    }

    // Test to see if word could be palindrome if 1 letter was removed
    public static boolean couldBePalindrome(String word) {

        /*
            Loop through and remove 1 letter.  Then, test to see if the current
            word is a palindrome.
         */
        for(int counter = 0; counter < word.length(); counter++) {
            if(isPalindrome((word.substring(0, counter) +
                              word.substring(counter + 1, word.length()))))
                return true;
        }

        return false;
    }
    /*
        Alternate method:
        class Solution{
            public static String solve(String s){
                StringBuilder stringBuilder = new StringBuilder(s);

                if(s.equals(stringBuilder.reverse().toString())) return "OK";

                for (int i = 0; i < s.length(); i++) {
                    stringBuilder = new StringBuilder(s).delete(i, i+1);

                    if(stringBuilder.toString().equals(stringBuilder.reverse().toString())) {
                        return "remove one";
                    }
        
                }

                return "not possible";
            }
        }
     */
}