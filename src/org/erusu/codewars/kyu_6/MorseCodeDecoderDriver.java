package org.erusu.codewars.kyu_6;

public class MorseCodeDecoderDriver {
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();

        System.out.println(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));

        System.out.println("Time taken: " + (System.currentTimeMillis() - start));
    }
}
