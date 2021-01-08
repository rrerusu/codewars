# 4_kyu Kata

Kyu represents the difficulty of the challenge, the lower the harder.

Difficulty: ![4_kyu_difficulty_diagram](4_kyu.PNG?raw=true)

4_kyu Kata are where things start to get hard.

<BR>

# Challenge Info
<details>
	<summary>Catching Car Mileage Numbers</summary>
	
## CatchingCarMileageNumbers

**Link:** https://www.codewars.com/kata/52c4dd683bfd3b434c000292

**Problem Statement**

"7777...8?!??!", exclaimed Bob, "I missed it again! Argh!" Every time there's an interesting number coming up, he notices and then promptly forgets. Who doesn't like catching those one-off interesting mileage numbers?

Let's make it so Bob never misses another interesting number. We've hacked into his car's computer, and we have a box hooked up that reads mileage numbers. We've got a box glued to his dash that lights up yellow or green depending on whether it receives a 1 or a 2 (respectively).

It's up to you, intrepid warrior, to glue the parts together. Write the function that parses the mileage number input, and returns a 2 if the number is "interesting" (see below), a 1 if an interesting number occurs within the next two miles, or a 0 if the number is not interesting.

###Error Checking
* A number is only interesting if it is greater than 99!
* Input will always be an integer greater than 0, and less than 1,000,000,000.
* The awesomePhrases array will always be provided, and will always be an array, but may be empty. (Not everyone thinks numbers spell funny words...)
* You should only ever output 0, 1, or 2.
</details>

<details>
	<summary>Differentiate Poly</summary>
	
## Differentiate Poly
**Link:** https://www.codewars.com/kata/566584e3309db1b17d000027

**Problem Statement:**

Create a function that differentiates a polynomial for a given value of x.
<BR>Your function will receive 2 arguments: a polynomial as a string, and a point to evaluate the equation as an integer.

### Assumptions:
* There will be a coefficient near each x, unless the coefficient equals 1 or -1.
* There will be an exponent near each x, unless the exponent equals 0 or 1.
* All exponents will be greater or equal to zero
</details>

<details>
	<summary>Hamming Numbers</summary>
	
## HammingNumbers

**Link:** https://www.codewars.com/kata/526d84b98f428f14a60008da

**Problem Statement**

A Hamming number is a positive integer of the form 2i3j5k, for some non-negative integers i, j, and k.

Write a function that computes the nth smallest Hamming number.

Specifically:

* The first smallest Hamming number is 1 = 2^0 x 3^0 x 5^0
* The second smallest Hamming number is 2 = 2^1 x 3^0 x 5^0
* The third smallest Hamming number is 3 = 2^0 x 3^1 x 5^0
* The fourth smallest Hamming number is 4 = 2^2 x 3^0 x 5^0
* The fifth smallest Hamming number is 5 = 2^0 x 3^0 x 5^1
* The 20 smallest Hamming numbers are given in example test fixture.

Your code should be able to compute all of the smallest 5,000 (Clojure: 2000, NASM: 13282) Hamming numbers without timing out.
</details>

<details>
	<summary>Human Readable Duration Format</summary>
	
## HumanReadableDurationFormat

**Link:** https://www.codewars.com/kata/52742f58faf5485cae000b9a

**Problem Statement**

Your task in order to complete this Kata is to write a function which formats a duration, given as a number of seconds, in a human-friendly way.

The function must accept a non-negative integer. If it is zero, it just returns "now". Otherwise, the duration is expressed as a combination of years, days, hours, minutes and seconds.

It is much easier to understand with an example:

```
TimeFormatter.formatDuration(62)   //returns "1 minute and 2 seconds"
TimeFormatter.formatDuration(3662) //returns "1 hour, 1 minute and 2 seconds"
```

For the purpose of this Kata, a year is 365 days and a day is 24 hours.

Note that spaces are important.
</details>

<details>
	<summary>SquaresIntoSquares</summary>
	
## SquaresIntoSquares

**Link:** https://www.codewars.com/kata/54eb33e5bc1a25440d000891

**Problem Statement**

My little sister came back home from school with the following task: given a squared sheet of paper she has to cut it in pieces which, when assembled, give squares the sides of which form an increasing sequence of numbers. At the beginning it was lot of fun but little by little we were tired of seeing the pile of torn paper. So we decided to write a program that could help us and protects trees.

### Task
Given a positive integral number n, return a strictly increasing sequence (list/array/string depending on the language) of numbers, so that the sum of the squares is equal to n².

If there are multiple solutions (and there will be), return as far as possible the result with the largest possible values:

For decompose(50) don't return [1, 1, 4, 9, 49] but [1, 3, 5, 8, 49] since [1, 1, 4, 9, 49] doesn't form a strictly increasing sequence.

### Note
Neither [n] nor [1,1,1,…,1] are valid solutions. If no valid solution exists, return nil, null, Nothing, None (depending on the language) or "[]" (C) ,{} (C++), [] (Swift, Go).

The function "decompose" will take a positive integer n and return the decomposition of N = n² as:

* [x1 ... xk] or
* "x1 ... xk" or
* Just [x1 ... xk] or
* Some [x1 ... xk] or
* {x1 ... xk} or
* "[x1,x2, ... ,xk]"

depending on the language (see "Sample tests")

### Note for Bash
```
decompose 50 returns "1,3,5,8,49"
decompose 4  returns "Nothing"
```
	
### Hint
Very often xk will be n-1.
</details>

<details>
	<summary>Sudoku Validator</summary>
	
## Sudoku Validator:
**Link:** https://www.codewars.com/kata/529bf0e9bdf7657179000008

**Problem Statement:**
### Sudoku Background
Sudoku is a game played on a 9x9 grid. The goal of the game is to fill all cells of the grid with digits from 1 to 9, so that each column, each row, and each of the nine 3x3 sub-grids (also known as blocks) contain all of the digits from 1 to 9.
(More info at: http://en.wikipedia.org/wiki/Sudoku)

### Sudoku Solution Validator
Write a function `validSolution/ValidateSolution/valid_solution()` that accepts a 2D array representing a Sudoku board, and returns true if it is a valid solution, or false otherwise. The cells of the sudoku board may also contain 0's, which will represent empty cells. Boards containing one or more zeroes are considered to be invalid solutions.

The board is always 9 cells by 9 cells, and every cell only contains integers from 0 to 9.
</details>

<details>
	<summary>Triplets</summary>
	
## Triplets
**Link:** https://www.codewars.com/kata/53f40dff5f9d31b813000774

**Problem Statement:**

There is a secret string which is unknown to you. Given a collection of random triplets from the string, recover the original string.

A triplet here is defined as a sequence of three letters such that each letter occurs somewhere before the next in the given string. "whi" is a triplet for the string "whatisup".

As a simplification, you may assume that no letter occurs more than once in the secret string.

You can assume nothing about the triplets given to you other than that they are valid triplets and that they contain sufficient information to deduce the original string. In particular, this means that the secret string will never contain letters that do not occur in one of the triplets given to you.
</details>