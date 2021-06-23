package org.erusu.codewars.kyu_7;

import java.lang.StringBuilder;

public class ComplimentaryDNA {
    public static String makeComplement(String dna) {

        // Instantiate StringBuilder to create new word
        StringBuilder builder = new StringBuilder();

        // Loop through 'dna' and switch letters
        for(int counter = 0; counter < dna.length(); counter++) {

            // A = T, T = A, G = C, C = G
            switch(dna.charAt(counter)) {
                case 'A':
                    builder.append('T');
                    break;
                case 'T':
                    builder.append('A');
                    break;
                case 'G':
                    builder.append('C');
                    break;
                case 'C':
                    builder.append('G');
                    break;
            }
        }

        return builder.toString();
    }

    /*
        original script:

        if(dna.charAt(counter) == 'A')
            builder.append('T');
        else if(dna.charAt(counter) == 'T')
            builder.append('A');
        else if(dna.charAt(counter) == 'C')
            builder.append('G');
        else
            builder.append('C');
     */
}
