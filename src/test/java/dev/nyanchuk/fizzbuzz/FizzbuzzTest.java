package dev.nyanchuk.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzbuzzTest {

    @Test
    public void testDivisibleByThree() {
        for (int i = 1; i <= 30; i++) {
            if ((i % 3 == 0) && (i % 5 != 0)) { // Only numbers divisible by 3
                assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator1(i));
            }
        }
    }

    @Test
    public void testDivisibleByFive() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 5 == 0) && (i % 3 != 0)) { // Only numbers divisible by 5
                assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator1(i));
            }
        }
    }

    @Test
    public void testDivisibleByThreeAndFive() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) { // Only numbers divisible by 3 AND by 5
                assertEquals("FizzBuzz", Fizzbuzz.FizzBuzzEvaluator1(i));
            }
        }
    }

    @Test
    public void testNotDivisibleByThreeOrFive() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 != 0) && (i % 5 != 0)) { // Only numbers NOT divisible by 3 or by 5
                assertEquals(String.valueOf(i), Fizzbuzz.FizzBuzzEvaluator1(i));
            }
        }
    }

    @Test
    public void testOutOfRange() {
        String response = "Use the range 1 to 100";
        assertEquals(response, Fizzbuzz.FizzBuzzEvaluator1(-500));
        assertEquals(response, Fizzbuzz.FizzBuzzEvaluator1(-1));
        assertEquals(response, Fizzbuzz.FizzBuzzEvaluator1(0));
        assertEquals(response, Fizzbuzz.FizzBuzzEvaluator1(1000));
    }
}
