package dev.nyanchuk.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzbuzzTest {

    // Test out-of-range
    @Test
    public void testOutOfRange() {
        String response = "Use the range 1 to 100";
        assertEquals(response, Fizzbuzz.FizzBuzzEvaluator((byte) 0));
        assertEquals(response, Fizzbuzz.FizzBuzzEvaluator((byte) -1));
        assertEquals(response, Fizzbuzz.FizzBuzzEvaluator((byte) 101));
        assertEquals(response, Fizzbuzz.FizzBuzzEvaluator((byte) 127));
        assertEquals(response, Fizzbuzz.FizzBuzzEvaluator((byte) -128));
    }

    // Test single divisibility
    @Test
    public void testDivisibleByThree() {
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 6));
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 57));
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 99));
    }

    @Test
    public void testDivisibleByFive() {
        assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator((byte) 10));
        assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator((byte) 70));
        assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator((byte) 100));
    }

    // Test containing the digits only, not divisible
    @Test
    public void testContainsDigitThreeOnly() {
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 13));
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 37));
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 83));
    }

    @Test
    public void testContainsDigitFiveOnly() {
        assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator((byte) 52));
        assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator((byte) 58));
        assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator((byte) 59));
    }

    // Test divisibility and containing digits
    @Test
    public void testtDivisibleAndContainsDigitThree() {
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 33));
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 36));
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 93));
    }

    @Test
    public void testtDivisibleAndContainsDigitFive() {
        assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator((byte) 25));
        assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator((byte) 55));
        assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator((byte) 95));
    }

    // Test divisibility both 3 and 5
    @Test
    public void testDivisibleByThreeAndFive() {
        assertEquals("FizzBuzz", Fizzbuzz.FizzBuzzEvaluator((byte) 15));
        assertEquals("FizzBuzz", Fizzbuzz.FizzBuzzEvaluator((byte) 45));
        assertEquals("FizzBuzz", Fizzbuzz.FizzBuzzEvaluator((byte) 90));
    }

    // Test neutral digits
    @Test
    public void testNotDivisibleByThreeOrFive() {
        assertEquals("1", Fizzbuzz.FizzBuzzEvaluator((byte) 1));
        assertEquals("7", Fizzbuzz.FizzBuzzEvaluator((byte) 7));
        assertEquals("28", Fizzbuzz.FizzBuzzEvaluator((byte) 28));
    }

    // Test of constructor
    @Test
    public void testConstructor2() {
        Fizzbuzz fizzbuzzInstance = new Fizzbuzz((byte) 1); // Set a value to test the constructor
        assertEquals("FizzBuzz", Fizzbuzz.FizzBuzzEvaluator((byte) 15)); // Test a valid input
    }

}
