# 5_kyu Kata

Kyu represents the difficulty of the challenge, the lower the harder.

Difficulty: ![5_kyu_difficulty_diagram](5_kyu.PNG?raw=true)

5_kyu Kata are a little more challenging than 6 _kyu, but they are not extremely hard.

<BR>

## Challenge Info
<details>
	<summary>Pick Peaks</summary>
	
## Pick Peaks

**Link:** https://www.codewars.com/kata/5279f6fe5ab7f447890006a7

**Problem Statement:**

In this kata, you will write a function that returns the positions and the values of the "peaks" (or local maxima) of a numeric array.

For example, the array arr = [0, 1, 2, 5, 1, 0] has a peak at position 3 with a value of 5 (since arr[3] equals 5).

The output will be returned as a ``Map<String,List>with two key-value pairs:"pos"and"peaks". If there is no peak in the given array, simply return{"pos" => [], "peaks" => []}`.

Example: pickPeaks([3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3]) should return {pos: [3, 7], peaks: [6, 3]} (or equivalent in other languages)

All input arrays will be valid integer arrays (although it could still be empty), so you won't need to validate the input.

The first and last elements of the array will not be considered as peaks (in the context of a mathematical function, we don't know what is after and before and therefore, we don't know if it is a peak or not).

Also, beware of plateaus !!! [1, 2, 2, 2, 1] has a peak while [1, 2, 2, 2, 3] does not. In case of a plateau-peak, please only return the position and value of the beginning of the plateau. For example: pickPeaks([1, 2, 2, 2, 1]) returns {pos: [1], peaks: [2]} (or equivalent in other languages)
</details>

<details>
	<summary>Simple Pig Latin</summary>
	
## Simple Pig Latin

**Link:** https://www.codewars.com/kata/520b9d2ad5c005041100000f

**Problem Statement:**

Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
</details>

<details>
	<summary>Trailing Zeroes</summary>
	
## Trailing Zeroes

**Link:** https://www.codewars.com/kata/52f787eb172a8b4ae1000a34

**Problem Statement:**

Write a program that will calculate the number of trailing zeros in a factorial of a given number.

N! = 1 * 2 * 3 * ... * N

Be careful 1000! has 2568 digits...

For more info, see: http://mathworld.wolfram.com/Factorial.html
</details>

<details>
	<summary>Human Readable Time</summary>
	
## Human Readable Time

**Link:** https://www.codewars.com/kata/52685f7382004e774f0001f7

**Problem Statement**

Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

* HH = hours, padded to 2 digits, range: 00 - 99
* MM = minutes, padded to 2 digits, range: 00 - 59
* SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)

You can find some examples in the test fixtures.
</details>