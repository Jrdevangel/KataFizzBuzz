# KataFizzBuzz

This Java code defines a KataFizzbuzz class with two methods. The print(int num) method calls 
the getFizzBuzz(int num) method, which returns "FizzBuzz" if the number is divisible by both 3 and 5, "Fizz" if divisible by 3,
"Buzz" if divisible by 5, or the number itself as a string if none of
these conditions are met.

# Test

This Java test class, KataFizzbuzzTest, uses JUnit to verify the KataFizzbuzz class. It contains four tests:

testFizzBuzz: Verifies that print(15) returns "FizzBuzz".
testFizz: Verifies that print(4) returns "4".
testBuzz: Verifies that print(3) returns "Fizz".
testNumber: Verifies that print(33) returns "Fizz".
These tests check that the KataFizzbuzz class behaves as 
expected for different inputs.