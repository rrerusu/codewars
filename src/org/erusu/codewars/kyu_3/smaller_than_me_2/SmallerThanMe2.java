package org.erusu.codewars.kyu_3.smaller_than_me_2;

import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.TreeMap;
import java.util.stream.IntStream;
import java.util.function.IntFunction;
import java.util.function.IntConsumer;
import java.util.Map.Entry;

public class SmallerThanMe2 {
	public static int[] findSmaller(int[] arr) {

		List<Integer> sortedList = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());

		int[] smallerVals = new int[arr.length];

		for(int numIndx = 0; numIndx < arr.length - 1; numIndx++) {
			smallerVals[numIndx] = sortedList.indexOf(arr[numIndx]);
			sortedList.remove(smallerVals[numIndx]);
			System.out.println(smallerVals[numIndx] + " " + numIndx);
		}

		return smallerVals;
	}

	public static List<Integer> findSmaller2(int[] unsorted) {
		List<Integer> smallerVals = Arrays.stream(unsorted).boxed().collect(Collectors.toList());

		for(int currIndx = 0; currIndx < smallerVals.size() - 1; currIndx++) {
			int currVal = smallerVals.get(currIndx);
			smallerVals.set(currIndx, 0);
			for(int nextVal = currIndx + 1; nextVal < smallerVals.size(); nextVal++) {
				if(currVal > nextVal)
					smallerVals.set(currIndx, smallerVals.get(currIndx) + 1);
			}
			System.out.println(smallerVals.get(currIndx) + " " + currIndx);
		}

		return smallerVals;
	}

	private static TreeMap<Integer, Integer> sortedVals;

	public static int[] findSmallerMap(int[] arr) {
		// Creates Hash Map
		sortedVals = createTreeMap(arr);
		int[] smallerNums = new int[arr.length];

//		for(int num : arr) {
//			if(sortedVals.containsKey(num))
//				sortedVals.replace(num, sortedVals.get(num) + 1);
//			else
//				sortedVals.putIfAbsent(num, 1);
//		}

//		IntConsumer sorter = val -> {
//			sortedVals.put(val, (sortedVals.get(val) == null)? 1 : sortedVals.get(val) + 1);
//		};
//
//		Arrays.spliterator(arr).forEachRemaining(sorter);


//		IntUnaryOperator createMap = val -> {
//			if(sortedVals.containsKey(val))
//				sortedVals.replace(val, sortedVals.get(val) + 1);
//			else
//				sortedVals.putIfAbsent(val, 1);
//
//			return val;
//		};
//
//		IntStream arrStream = Arrays.stream(arr).map(key -> createMap.applyAsInt(key));

//		// Creates Hash Map
//		sortedVals = createTreeMap(arr);
//		int[] smallerNums = new int[arr.length];
//
//		// keySet();
//		Integer[] sortedValsKeys = sortedVals.keySet().toArray(new Integer[]{});
//
//		// values():
//		Integer[] sortedValsValues = sortedVals.values().toArray(new Integer[]{});

//		 int currIndx = 0;

		// create smallerNums array
//		for(int indx = 0; indx < arr.length; indx++) {
//			currIndx = Arrays.binarySearch(sortedValsKeys, arr[indx]);
//			arr[indx] = 0;
//
//			for(int addValIndx = 0; addValIndx < currIndx; addValIndx++) {
//				arr[indx] += sortedValsValues[addValIndx];
//			}
//
////			arr[indx] = Arrays.stream(sortedValsValues).limit(currIndx).reduce((x, y) -> x + y).orElse(0);
//
//			sortedValsValues[currIndx]--;
//
//			System.out.println(arr[indx] + " " + indx);
//		}

//		IntFunction<Integer> mySmallNumsCalc = val -> {
//			int currIndx = Arrays.binarySearch(sortedValsKeys, val);
//			int numsSmaller = 0;
//
//			for(int addValIndx = 0; addValIndx < currIndx; addValIndx++) {
//				numsSmaller += sortedValsValues[addValIndx];
//			}
//
////			numsSmaller = Arrays.stream(sortedValsValues).limit(currIndx).reduce((x, y) -> x + y).orElse(0);
//
//			sortedValsValues[currIndx]--;
//
//			System.out.println(numsSmaller + " ");
//
//			return numsSmaller;
//		};
//
//		IntStream arrStream = Arrays.stream(arr);
////
//		return arrStream.map(myVal -> mySmallNumsCalc.apply(myVal)).toArray();

//		return Arrays.stream(arr).map(myVal -> mySmallNumsCalc.apply(myVal)).toArray();

//		return arr;

		for(int counter = 0; counter < arr.length; counter++) {
			// smallerNums[counter] = addAllVals(sortedVals.floorEntry(arr[counter])) - sortedVals.get(arr[counter]);
			smallerNums[counter] = addAllVals(sortedVals.floorEntry(arr[counter]));
			if(sortedVals.get(arr[counter]) == 1)
				sortedVals.remove(arr[counter]);
			else
				sortedVals.put(arr[counter], sortedVals.get(arr[counter]) - 1);

//			System.out.println(smallerNums[counter] + " " + counter);
		}

		return smallerNums;
	}

	public static int addAllVals(Entry<Integer, Integer> prevEntry) {
//		if(prevEntry.equals(sortedVals.firstEntry()))
//			return prevEntry.getValue();
//		else
//			return prevEntry.getValue() + addAllVals(sortedVals.lowerEntry(prevEntry.getKey()));

		int val = 0;

		while(prevEntry.getKey() != sortedVals.firstKey()) {
			prevEntry = sortedVals.lowerEntry(prevEntry.getKey());
			val += prevEntry.getValue();
		}

		return val;
	}

	public static TreeMap<Integer, Integer> createTreeMap(int[] arr) {
		sortedVals = new TreeMap<>();

		// Stream - slowest
//		Arrays.stream(arr).forEach(key ->  {
//			sortedVals.put(key, (sortedVals.get(key) == null) ? 0 : sortedVals.get(key) + 1);
//		});

		// Spliterator - slower than for loop
//		IntConsumer sorter = num -> {
//			if(sortedVals.containsKey(num))
//				sortedVals.replace(num, sortedVals.get(num) + 1);
//			else
//				sortedVals.putIfAbsent(num, 1);
//		};
//
//		Arrays.spliterator(arr).forEachRemaining(sorter);

		// For Loop - slower than spliterator
		for(int num : arr) {
			if(sortedVals.containsKey(num))
				sortedVals.replace(num, sortedVals.get(num) + 1);
			else
				sortedVals.putIfAbsent(num, 1);
		}

		return sortedVals;
	}

	public static int[] findSmallerReverse(int[] arr) {
		sortedVals = createTreeMap(arr);

		// keySet();
		Integer[] sortedValsKeys = sortedVals.keySet().toArray(new Integer[]{});

		// values():
		Integer[] sortedValsValues = sortedVals.values().toArray(new Integer[]{});

		int[] totalSmaller = new int[sortedValsValues.length];

		// total numbers smaller than current number stored here
		for(int counter = 1; counter < sortedValsValues.length; counter++) {
			totalSmaller[counter] = totalSmaller[counter - 1] + sortedValsValues[counter - 1];
		}

		// calculate numbers
		for(int counter = 0; counter < arr.length; counter++) {
			int currIndx = Arrays.binarySearch(sortedValsKeys, arr[counter]);
			arr[counter] = totalSmaller[currIndx];
			for(int counter2 = currIndx; counter2 < totalSmaller.length; counter2++) {
				if(totalSmaller[counter2] > 0)
					totalSmaller[counter2]--;
			}

			System.out.println(arr[counter] + " " + counter);

		}

		return arr;
	}
}
