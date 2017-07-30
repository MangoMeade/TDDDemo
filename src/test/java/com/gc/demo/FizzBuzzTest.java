package com.gc.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void testCase1() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();


        String expected = "1";
        String actual = fizzBuzz.fizzBuzz(1);
        assertEquals("TestCase 1 Failed", expected, actual);

    }

    @Test
    public void testCase3() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();


        String expected = "fizz";
        String actual = fizzBuzz.fizzBuzz(3);
        assertEquals("TestCase 3 Failed", expected, actual);

    }

    @Test
    public void testCase5() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expected = "buzz";
        String actual = fizzBuzz.fizzBuzz(5);
        assertEquals("TestCase 1 Failed", expected, actual);

    }

    @Test
    public void testCase15() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expected = "fizz buzz";
        String actual = fizzBuzz.fizzBuzz(15);
        assertEquals("TestCase 1 Failed", expected, actual);

    }

    @Test
    public void testCase31() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expected = "31";
        String actual = fizzBuzz.fizzBuzz(31);
        assertEquals("TestCase 1 Failed", expected, actual);

    }
}