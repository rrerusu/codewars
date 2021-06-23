package org.erusu.codewars.kyu_6;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
import java.lang.StringBuilder;

public class CoinPossibilities {
    public static String[] coin(int n) {

        // Create arrayList to hold numbers
        List<String> binNumbers = new ArrayList<String>();

        // StringBuilder to increase efficiency
        StringBuilder builder = new StringBuilder();

        // Empty Array to convert ArrayList into
        String[] strArray = {};

        // Fill ArrayList with numbers
        for(int counter = 0; counter < Math.pow(2, n); counter++) {

            // Convert numbers into binary format and add them
            binNumbers.add(calcBinNum(counter, n));
        }


        return binNumbers.toArray(strArray);
    }

    public static String calcBinNum(int num, int digits) {

        // New string builder for speed
        StringBuilder builder = new StringBuilder();

        // Int variables
        // numToBinTemp: number as it is going through binary conversion
        int numToBinTemp = num;
        // digitFactor: shorten the number of calculations done
        int digitFactor = 0;

        // loop through each power of two and create 1 digit of the binary number
        for(int digitCounter = 0; digitCounter < digits; digitCounter++) {

            digitFactor = (int) Math.pow(2, digits - (digitCounter + 1));

            // is bin digit 1 or 0? if 0, add H.  if 1, add T
            if((numToBinTemp / digitFactor) == 0)
                builder.append('H');
            else
                builder.append('T');

            // Decrease number to account only for 1 digit
            numToBinTemp %= digitFactor;
        }

        return builder.toString();
    }

    /*
        Alternate Solution:
        * use Integer.toBinaryString() (WHICH I LOOKED FOR)
        public String[] coin(int n) {
          int t = (int)Math.pow(2,n);

          String[] r = new String[t];
          for (int i = 0; i < t; i++) r[i] = pad(Integer.toBinaryString(i), n).replace("0","H").replace("1","T");
          return r;
        }
        public String pad(String s, int l) {
          while (s.length() < l) s = 'H' + s;
          return s;
        }
     */
}
