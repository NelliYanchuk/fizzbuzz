package dev.nyanchuk.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzbuzzTest {

    // Test out-of-range
    @Test
    public void testOutOfRange() {
        String response = "Use the range 1 to 100";
        assertEquals(response, Fizzbuzz.FizzBuzzEvaluator1((byte) -120));
        assertEquals(response, Fizzbuzz.FizzBuzzEvaluator1((byte) -1));
        assertEquals(response, Fizzbuzz.FizzBuzzEvaluator1((byte) 0));
        assertEquals(response, Fizzbuzz.FizzBuzzEvaluator1((byte) 127));
    }
    
    // Test single divisibility 
    @Test
    public void testDivisibleByThree() {
        for (byte i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 != 0)) { // Only numbers divisible by 3
                assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator1(i));
            }
        }
    }

    @Test
    public void testDivisibleByFive() {
        for (byte i = 1; i <= 100; i++) {
            if ((i % 5 == 0) && (i % 3 != 0)) { // Only numbers divisible by 5
                assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator1(i));
            }
        }
    }

    // Test combination logic
    @Test
    public void testDivisibleByThreeAndFive() {
        for (byte i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) { // Only numbers divisible by 3 AND by 5
                assertEquals("FizzBuzz", Fizzbuzz.FizzBuzzEvaluator1(i));
            }
        }
    }

    // Test neutral digits
    @Test
    public void testNotDivisibleByThreeOrFive() {
        for (byte i = 1; i <= 100; i++) {
            if ((i % 3 != 0) && (i % 5 != 0)) { // Only numbers NOT divisible by 3 or by 5
                assertEquals(String.valueOf(i), Fizzbuzz.FizzBuzzEvaluator1(i));
            }
        }
    }

    // Test of constructor
    @Test
    public void testConstructor() {
        Fizzbuzz fizzbuzzInstance = new Fizzbuzz((byte) 1); // Set a value to test the constructor
        assertEquals("FizzBuzz", Fizzbuzz.FizzBuzzEvaluator1((byte) 15)); // Test a valid input
    }

}
