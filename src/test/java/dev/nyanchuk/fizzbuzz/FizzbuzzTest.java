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
        for (byte i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 != 0)) {
                assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator(i));
            }
        }
    }

    @Test
    public void testDivisibleByFive() {
        for (byte i = 1; i <= 100; i++) {
            if ((i % 5 == 0) && (i % 3 != 0)) {
                assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator(i));
            }
        }
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
        for (byte i = 1; i <= 100; i++) {
            if ((i % 3 != 0) && (i % 5 != 0)) {
                assertEquals(String.valueOf(i), Fizzbuzz.FizzBuzzEvaluator(i));
            }
        }
    }

    // Test of constructor
    @Test
    public void testConstructor() {
        Fizzbuzz fizzbuzzInstance = new Fizzbuzz((byte) 1); // Set a value to test the constructor
        assertEquals("FizzBuzz", Fizzbuzz.FizzBuzzEvaluator((byte) 15)); // Test a valid input
    }

}
