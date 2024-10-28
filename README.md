# FizzBuzz Java Console Application

This Java console application outputs numbers from 1 to 100, following the FizzBuzz rules and expanded requirements for additional conditions. It includes comprehensive testing to ensure functionality and code coverage.

## Requirements

- **Java Development Kit (JDK)**: Version 21
- **JUnit**: For testing
- **Maven**: For project management
- **Dependencies**:
  - Hamcrest (for assertion matching)
  - JUnit 5

## Description

The program evaluates each number from 1 to 100 based on the following rules:

### Stage 1 Requirements
1. Returns "Fizz" if a number is divisible by 3.
2. Returns "Buzz" if a number is divisible by 5.
3. Returns "FizzBuzz" if a number is divisible by both 3 and 5.
4. Returns the number itself if none of the above conditions are met.

### Stage 2 Additional Requirements
1. Returns "Fizz" if a number is divisible by 3 **or** contains the digit "3" (e.g., 534).
2. Returns "Buzz" if a number is divisible by 5 **or** contains the digit "5" (e.g., 25).

## Getting Started
Clone the repository:
```bash
git clone https://github.com/NelliYanchuk/homecoffee.git
```

## Testing

This project includes comprehensive tests for `FizzBuzzEvaluator`, verifying its functionality under various conditions and ensuring at least 70% code coverage. You can view the test coverage in Visual Studio Code under the "Testing" section.

### Test Cases

The test cases for `FizzBuzzEvaluator` method cover the following scenarios:

1. **Out of Range**: Confirms the message "Use the range 1 to 100" is returned when a number outside the range (1–100) is provided.
    - Examples:
        ```java
        assertEquals("Use the range 1 to 100", Fizzbuzz.FizzBuzzEvaluator((byte) 0));
        assertEquals("Use the range 1 to 100", Fizzbuzz.FizzBuzzEvaluator((byte) -1));
        ```

2. **Divisible by 3**: Ensures "Fizz" is returned for numbers divisible by 3.
    - Examples:
        ```java
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 6));
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 99));
        ```

3. **Divisible by 5**: Ensures "Buzz" is returned for numbers divisible by 5.
    - Examples:
        ```java
        assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator((byte) 70));
        assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator((byte) 100));
        ```

4. **Contains 3**: Confirms "Fizz" is returned for numbers containing the digit 3.
    - Examples:
        ```java
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 13));
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 37));
        ```

5. **Contains 5**: Confirms "Buzz" is returned for numbers containing the digit 5.
    - Examples:
        ```java
        assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator((byte) 52));
        assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator((byte) 58));
        ```

6. **Divisible by 3 and Contains 3**: Ensures "Fizz" is returned for numbers that are divisible by 3 and contain the digit 3.
    - Examples:
        ```java
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 33));
        assertEquals("Fizz", Fizzbuzz.FizzBuzzEvaluator((byte) 93));
        ```

7. **Divisible by 5 and Contains 5**: Ensures "Buzz" is returned for numbers that are divisible by 5 and contain the digit 5.
    - Examples:
        ```java
        assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator((byte) 25));
        assertEquals("Buzz", Fizzbuzz.FizzBuzzEvaluator((byte) 55));
        ```

8. **Divisible by Both 3 and 5**: Ensures "FizzBuzz" is returned for numbers divisible by both 3 and 5.
    - Examples:
        ```java
        assertEquals("FizzBuzz", Fizzbuzz.FizzBuzzEvaluator((byte) 15));
        assertEquals("FizzBuzz", Fizzbuzz.FizzBuzzEvaluator((byte) 90));
        ```

9. **Neither Divisible by 3 nor 5**: Confirms the number itself is returned for numbers that aren’t divisible by 3 or 5 and don’t contain those digits.
    - Examples:
        ```java
        assertEquals("1", Fizzbuzz.FizzBuzzEvaluator((byte) 1));
        assertEquals("28", Fizzbuzz.FizzBuzzEvaluator((byte) 28));
        ```

These test cases ensure comprehensive coverage for `FizzBuzzEvaluator` functionality.


## Deliverables

- **GitHub Repository Link**: [FizzBuzz Repository](https://github.com/NelliYanchuk/fizzbuzz)
- **Linkedin Link**: [Linkedin](https://github.com/NelliYanchuk/fizzbuzz)
- **Code Coverage Screenshot**: See the `coverage` directory for a screenshot demonstrating test coverage.
