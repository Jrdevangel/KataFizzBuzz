# Exercise KataFizzbuzz

Explanation of the exercise:

This exercise is performer in the Java Programming language and is about that you have to print a
line for each number from 1 to 100, for the multiples of three, you have to print the word "Fizz"
and for the multiples of five you have to print the word "Buzz" instead of the number and to 
finalise for the numbers that are multiples of three and five, the console will have to print
the word "FizzBuzz", instead of the number.

# Explanation of the Java code

On line 3, I have called the KataFizzbuzz class and made it public because I am interested in 
everyone accessing it.

On line 5, I declared a printing method so that I would print the variable called "num" for when
I have to use it later.

On line 6, I put a return that I have called "getFizzBuzz(num)" so I can use it next.

Next, I will explain how I made the conditional if of lines 11 to 23:

This Java code is part of a function that returns a specific word or the number itself based on certain conditions. It's a simple implementation of the "FizzBuzz" game. Here's a breakdown of how it works:

1. Condition:

if (num % 3 == 0 && num % 5 == 0) {
return "FizzBuzz";
}

* What it checks: If the number num is divisible by both 3 and 5 (meaning no remainder when divided).

* What it returns: If the condition is true, it returns the string "FizzBuzz".

1. Second Condition:

if (num % 3 == 0) {
return "Fizz";
}

* What it checks: If the number num is divisible by 3.

* What it returns: If true, it returns the string "Fizz".

1. Third Condition:

if (num % 5 == 0) {
return "Buzz";
}

* What it checks: If the number num is divisible by 5.

* What it returns: If true, it returns the string "Buzz".

Default Return:

return String.valueOf(num);
What it does: If none of the above conditions are met, it converts the number num to a string and returns it.