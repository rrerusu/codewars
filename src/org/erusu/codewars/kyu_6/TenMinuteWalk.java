package org.erusu.codewars.kyu_6;

public class TenMinuteWalk {
    public static boolean isValid(char[] walk) {

        // make sure walk is only 10 chars long
        if(walk.length == 10) {

            // define coordinate directions to keep track of motion
            int x = 0, y = 0;

            // represent 'n', 'e', 's', and 'w' as coordinates
            for(int counter = 0; counter < walk.length; counter++) {
                if(walk[counter] == 'n')
                    y++;
                else if(walk[counter] == 's')
                    y--;
                else if(walk[counter] == 'e')
                    x++;
                else
                    x--;
            }

            // If coordinates are (0, 0), we ended back at the starting position
            if(x == 0 && y == 0)
                return true;
            else
                return false;
        } else {
            return false;
        }

        /*
            Alternate Solutions:
            * using point class
            Point point = new Point(0,0);
            for (char c : walk) {
                switch (c) {
                    case 'n': point.translate(1,0); break;
                    case 'e': point.translate(0,1); break;
                    case 's': point.translate(-1,0); break;
                    case 'w': point.translate(0,-1); break;
                }
            }
            return point.equals(new Point(0,0)) && walk.length == 10;
         */
    }
}
