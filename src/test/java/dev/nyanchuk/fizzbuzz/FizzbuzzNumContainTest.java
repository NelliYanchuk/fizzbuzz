package dev.nyanchuk.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzbuzzNumContainTest {

    // Test out-of-range
    @Test
    public void testOutOfRange() {
        String response = "Use the range 1 to 100";
        assertEquals(response, FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 0));
        assertEquals(response, FizzbuzzNumContain.FizzBuzzEvaluator2((byte) -10));
        assertEquals(response, FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 101));
        assertEquals(response, FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 127));
        assertEquals(response, FizzbuzzNumContain.FizzBuzzEvaluator2((byte) -128));
    }

    // Test single divisibility
    @Test
    public void testDivisibleByThree() {
        assertEquals("Fizz", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 6));
        assertEquals("Fizz", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 12));
        assertEquals("Fizz", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 57));
        assertEquals("Fizz", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 99));
    }

    @Test
    public void testDivisibleByFive() {
        assertEquals("Buzz", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 10));
        assertEquals("Buzz", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 70));
        assertEquals("Buzz", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 100));
    }

    // Test containing the digits only
    @Test
    public void testContainsDigitThreeOnly() {
        assertEquals("Fizz", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 13));
        assertEquals("Fizz", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 37));
        assertEquals("Fizz", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 83));
    }

    @Test
    public void testContainsDigitFiveOnly() {
        assertEquals("Buzz", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 52));
        assertEquals("Buzz", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 58));
        assertEquals("Buzz", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 59));
    }

    // Test divisible by both 3 and 5
    // since there is no logic for this in the task, responce should by Fizz
    @Test
    public void testDivisibleByThreeAndFive() {
        assertEquals("Fizz", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 15));
        assertEquals("Fizz", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 30));
        assertEquals("Fizz", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 45));
    }

    // Test containing both 3 and 5 digits inside 
    // since there is no logic for this in the task, responce should by Fizz
    @Test
    public void testContainsThreeAndFive() {
        assertEquals("Fizz", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 35));
        assertEquals("Fizz", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 53));
    }

    // Test neutral digits
    @Test
    public void testNotDivisibleByThreeOrFive() {
        assertEquals("1", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 1));
        assertEquals("2", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 2));
        assertEquals("4", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 4));
        assertEquals("7", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 7));
        assertEquals("8", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 8));
    }

    // Test of constructor
    @Test
    public void testConstructor2() {
        FizzbuzzNumContain fizzbuzzInstance = new FizzbuzzNumContain((byte) 1); // Set a value to test the constructor
        assertEquals("Fizz", FizzbuzzNumContain.FizzBuzzEvaluator2((byte) 15)); // Test a valid input
    }
}
