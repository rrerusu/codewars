# 6_kyu Kata

Kyu represents the difficulty of the challenge, the lower the harder.

Difficulty: ![6_kyu_difficulty_diagram](6_kyu.PNG?raw=true)

6_kyu Kata are where the challenges get a little more challenging.

<BR>

## Challenge Info

<details>
	<summary>Break Camel Case</summary>
	
## Break Camel Case

**Link:** https://www.codewars.com/kata/5208f99aee097e6552000148

**Problem Statement:**

Complete the solution so that the function will break up camel casing, using a space between words.
</details>

<details>
	<summary>Camel Case Translator</summary>
	
## Camel Case Translator

**Link:** https://www.codewars.com/kata/5b1956a7803388baae00003a

**Problem Statement:**

You wrote all your unit test names in camelCase. But some of your colleagues have troubles reading these long test names. So you make a compromise to switch to underscore separation.

To make these changes fast you wrote a class to translate a camelCase name into an underscore separated name.

Implement the ToUnderscore() method.

But of course there are always special cases...

You also have some calculation tests. Make sure the results don't get split by underscores. So only add an underscore in front of the first number.

Also Some people already used underscore names in their tests. You don't want to change them. But if they are not split correct you should adjust them.

Some of your colleagues mark their tests with a leading and trailing underscore. Don't remove this.

And of course you should handle empty strings to avoid unnecessary errors. Just return an empty string then.
</details>

<details>
	<summary>Coin Possibilities</summary>
	
## Coin Possibilities

**Link:** https://www.codewars.com/kata/5ad6266b673f2f067b000004

**Problem Statement**

In this kata you will be given an integer n, which is the number of times that is thown a coin. You will have to return an array of string for all the possibilities (heads[H] and tails[T]).
When finished sort them alphabetically.

In C and C++ just return a char* with all elements separated by, (without space)

INPUT:
	0 < n < 18

Careful with performance!! You'll have to pass 3 basic test (n = 1, n = 2, n = 3), many medium tests (3 < n <= 10) and many large tests (10 < n < 18)
</details>

<details>
	<summary>Counting Duplicates</summary>
	
## Counting Duplicates

**Link:** https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1

**Problem Statement:**

Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
</details>

<details>
	<summary>Enough is Enough</summary>
	
## Enough is Enough

**Link:** https://www.codewars.com/kata/554ca54ffa7d91b236000023

**Problem Statement**

Alice and Bob were on a holiday. Both of them took many pictures of the places they've been, and now they want to show Charlie their entire collection. However, Charlie doesn't like these sessions, since the motive usually repeats. He isn't fond of seeing the Eiffel tower 40 times. He tells them that he will only sit during the session if they show the same motive at most N times. Luckily, Alice and Bob are able to encode the motive as a number. Can you help them to remove numbers such that their list contains each number only up to N times, without changing the order?

### Task
Given a list lst and a number N, create a new list that contains each number of lst at most N times without reordering. For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
</details>

<details>
	<summary>Find Odd Int</summary>
	
## Find Odd Int

**Link:** https://www.codewars.com/kata/54da5a58ea159efa38000836

**Problem Statement**

Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.
</details>

<details>
	<summary>Morse Code Decoder</summary>
	
## Morse Code Decoder

**Link:** https://www.codewars.com/kata/54b724efac3d5402db00065e

**Problem Statement**

In this kata you have to write a simple Morse code decoder. While the Morse code is now mostly superseded by voice and digital data communication channels, it still has its use in some applications around the world.
The Morse code encodes every character as a sequence of "dots" and "dashes". For example, the letter A is coded as ·-, letter Q is coded as --·-, and digit 1 is coded as ·----. The Morse code is case-insensitive, traditionally capital letters are used. When the message is written in Morse code, a single space is used to separate the character codes and 3 spaces are used to separate words. For example, the message HEY JUDE in Morse code is ···· · -·--   ·--- ··- -·· ·.

**NOTE:** Extra spaces before or after the code have no meaning and should be ignored.

In addition to letters, digits and some punctuation, there are some special service codes, the most notorious of those is the international distress signal SOS (that was first issued by Titanic), that is coded as ···---···. These special codes are treated as single special characters, and usually are transmitted as separate words.

Your task is to implement a function that would take the morse code as input and return a decoded human-readable string.

**NOTE:** For coding purposes you have to use ASCII characters . and -, not Unicode characters.

The Morse code table is preloaded for you as a dictionary, feel free to use it:

* Coffeescript/C++/Go/JavaScript/Julia/PHP/Python/Ruby/TypeScript: MORSE_CODE['.--']
* C#: MorseCode.Get(".--") (returns string)
* Elixir: @morse_codes variable (from use MorseCode.Constants). Ignore the unused variable warning for morse_codes because it's no longer used and kept only for old solutions.
* Elm: MorseCodes.get : Dict String String
* Haskell: morseCodes ! ".--" (Codes are in a Map String String)
* Java: MorseCode.get(".--")
* Kotlin: MorseCode[".--"] ?: "" or MorseCode.getOrDefault(".--", "")
* Rust: self.morse_code
* Scala: morseCodes(".--")
* C: provides parallel arrays, i.e. morse[2] == "-.-" for ascii[2] == "C"
All the test strings would contain valid Morse code, so you may skip checking for errors and exceptions. In C#, tests will fail if the solution code throws an exception, please keep that in mind. This is mostly because otherwise the engine would simply ignore the tests, resulting in a "valid" solution.

Good luck!
</details>

<details>
	<summary>Palindrome</summary>
	
## Palindrome

**Link:** https://www.codewars.com/kata/5a2c22271f7f709eaa0005d3

**Problem Statement**

You will be given a string and you task is to check if it is possible to convert that string into a palindrome by removing a single character. If the string is already a palindrome, return "OK". If it is not, and we can convert it to a palindrome by removing one character, then return "remove one", otherwise return "not possible". The order of the characters should not be changed.

Good luck!
</details>

<details>
	<summary>Parity Outlier</summary>
	
## Parity Outlier

**Link:** https://www.codewars.com/kata/5526fc09a1bbd946250002dc

**Problem Statement**

You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.
</details>

<details>
	<summary>Persistent Bugger</summary>
	
## Persistent Bugger

**Link:** https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec

**Problem Statement**

Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.
</details>

<details>
	<summary>Prime</summary>
	
## Prime

**Link:** https://www.codewars.com/kata/5262119038c0985a5b00029f

**Problem Statement**

Define a function that takes one integer argument and returns logical value true or false depending on if the integer is a prime.

Per Wikipedia, a prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself.

### Requirements
You can assume you will be given an integer input.
You can not assume that the integer will be only positive. You may be given negative numbers as well (or 0).
NOTE on performance: There are no fancy optimizations required, but still the most trivial solutions might time out. Numbers go up to 2^31 (or similar, depends on language version). Looping all the way up to n, or n/2, will be too slow.
</details>

<details>
	<summary>Regular Case to Camel</summary>
	
## Regular Case to Camel

**Link:** https://www.codewars.com/kata/587731fda577b3d1b0001196

**Problem Statement**

Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java) for strings. All words must have their first letter capitalized without spaces.
</details>

<details>
	<summary>Sort the Odd</summary>
	
## Sort the Odd

**Link:** https://www.codewars.com/kata/578aa45ee9fd15ff4600090d

**Problem Statement**

You have an array of numbers.
Your task is to sort ascending odd numbers but even numbers must be on their places.

Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.
</details>

<details>
	<summary>String to Camel Case</summary>
	
## String to Camel Case

**Link:** https://www.codewars.com/kata/517abf86da9663f1d2000003

**Problem Statement**

Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
</details>

<details>
	<summary>Sum Consecutives</summary>
	
## Sum Consecutives

**Link:** https://www.codewars.com/kata/55eeddff3f64c954c2000059

**Problem Statement**

You are given a list/array which contains only integers (positive and negative). Your job is to sum only the numbers that are the same and consecutive. The result should be one list.

Extra credit if you solve it in one line. You can assume there is never an empty list/array and there will always be an integer.

Same meaning: 1 == 1

1 != -1
</details>

<details>
	<summary>Ten Minute Walk</summary>
	
## Ten Minute Walk

**Link:** https://www.codewars.com/kata/54da539698b8a2ad76000228

**Problem Statement**

You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk. The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block for each letter (direction) and you know it takes you one minute to traverse one city block, so create a function that will return true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will, of course, return you to your starting point. Return false otherwise.

**Note:** you will always receive a valid array containing a random assortment of direction letters ('n', 's', 'e', or 'w' only). It will never give you an empty array (that's not a walk, that's standing still!).
</details>

<details>
	<summary>Which are In</summary>
	
## Which are In

**Link:** https://www.codewars.com/kata/550554fd08b86f84fe000a58

**Problem Statement**

Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.

### Notes:
Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.

In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.

Beware: r must be without duplicates.
Don't mutate the inputs.
</details>