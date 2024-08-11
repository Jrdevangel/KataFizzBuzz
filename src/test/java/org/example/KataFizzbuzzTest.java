package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KataFizzbuzzTest {

    @Test
    public void testFizzBuzz() {
        KataFizzbuzz fizzBuzz = new KataFizzbuzz();
        assertEquals("FizzBuzz", fizzBuzz.print(15));
    }

    @Test
    public void testFizz() {
        KataFizzbuzz fizzBuzz = new KataFizzbuzz();
        assertEquals("4", fizzBuzz.print(4));
    }

    @Test
    public void testBuzz() {
        KataFizzbuzz fizzBuzz = new KataFizzbuzz();
        assertEquals("Fizz", fizzBuzz.print(3));
    }

    @Test
    public void testNumber() {
        KataFizzbuzz fizzBuzz = new KataFizzbuzz();
        assertEquals("Fizz", fizzBuzz.print(33));
    }
}