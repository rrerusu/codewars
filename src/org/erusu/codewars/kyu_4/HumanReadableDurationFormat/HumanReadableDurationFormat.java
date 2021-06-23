package org.erusu.codewars.kyu_4.HumanReadableDurationFormat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.StringBuffer;

public class HumanReadableDurationFormat {
	public static String convert(int time) {
		int[] conversionFactor = new int[]{31536000, 86400, 3600, 60, 1};
		String[] conversionUnits = new String[]{"year", "day", "hour", "minute", "second"};
		String convertedTime = "";

		// Special case, have to say it specifically
		if(time == 0)
			return "0 seconds";

		// create basic string, no commas, no "and"s
		for(int factorIndx = 0; factorIndx < conversionFactor.length; factorIndx++) {
			if(time / conversionFactor[factorIndx] > 0) {
				convertedTime += time / conversionFactor[factorIndx] + " " + conversionUnits[factorIndx];

				if(time / conversionFactor[factorIndx] > 1)
					convertedTime += "s";

				convertedTime += " ";
			}

			time %= conversionFactor[factorIndx];
		}

		// Go through and add commas after each section of num + space + word
		Matcher myMatcher = Pattern.compile("(\\d+\\s\\w+)").matcher(convertedTime);
		StringBuffer myBuffer = new StringBuffer();

		while(myMatcher.find()) {
			myMatcher.appendReplacement(myBuffer, myMatcher.group(1) + ",");
		}

		convertedTime = myBuffer.toString();
		myBuffer = myBuffer.delete(0, myBuffer.capacity());
		myMatcher = Pattern.compile("\\W+(\\d+\\s\\w+)\\W$").matcher(convertedTime);

		while(myMatcher.find()) {
			myMatcher.appendReplacement(myBuffer, " and "  + myMatcher.group(1));
		}

		return (myBuffer.toString().equals("")) ? convertedTime.substring(0, convertedTime.length() - 1)
			: myBuffer.toString();
	}

	/*

	* Even faster solution:
		

	public static String formatDuration(int seconds) {
        String res = "";
        int[] units = new int[] {31536000, 86400, 3600, 60, 1};
        String[] labels = new String[] {"year", "day", "hour", "minute", "second"};

        if (seconds == 0) return "now";

        for (int i = 0; i < 5; i++) {
          if (seconds >= units[i]) {
            int q = seconds / units[i];
            seconds = seconds % units[i];
            res += (res.equals("") ? "" : (seconds == 0 ? " and " : ", "))
                   + q + " " + labels[i] + (q > 1 ? "s" : "");
          }
        }
        return res;
    }

	 */
}
