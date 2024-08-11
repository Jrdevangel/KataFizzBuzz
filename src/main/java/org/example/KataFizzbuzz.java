package org.example;

public class KataFizzbuzz {

    public String print(int num) {
        return getFizzBuzz(num);
    }

    public String getFizzBuzz(int num) {

        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        }

        if (num % 3 == 0) {
            return "Fizz";
        }

        if (num % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(num);
    }
}