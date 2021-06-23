package org.erusu.codewars.kyu_6;

public class PersistentBuggerTest {
    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();

        System.out.println(PersistentBugger.persistence(999));
        //System.out.println(PersistentBugger.persistence2(999));


        System.out.println("Elapsed time: " + (System.currentTimeMillis() - startTime));
    }
}