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
        assertEquals(response, Fizzbuzz.FizzBuzzEvaluator((byte) 50));
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

    
    // Test combination logic
    @Test
    public void testDivisibleByThreeAndFive() {
        for (byte i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                assertEquals("FizzBuzz", Fizzbuzz.FizzBuzzEvaluator(i));
            }
        }
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
