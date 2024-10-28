
    // Test single divisibility
    @Test
    public void testDivisibleByThree() {
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 6));
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 12));
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 57));
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 99));
    }

    @Test
    public void testDivisibleByFive() {
        assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator((byte) 10));
        assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator((byte) 70));
        assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator((byte) 100));
    }

    // Test containing the digits only
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

    // Test divisible by both 3 and 5
    // since there is no logic for this in the task, responce should by Fizz
    @Test
    public void testDivisibleByThreeAndFive() {
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 15));
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 30));
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 45));
    }

    // Test containing both 3 and 5 digits inside 
    // since there is no logic for this in the task, responce should by Fizz
    @Test
    public void testContainsThreeAndFive() {
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 35));
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 53));
    }
}