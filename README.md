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

To run the application from the main class `App`, use the following command:
```bash
mvn clean compile exec:java
```

## Testing

This project includes comprehensive tests for `FizzBuzzEvaluator`, verifying its functionality under various conditions and ensuring at least 70% code coverage. You can view the test coverage in Visual Studio Code under the "Testing" section.

### Test Cases

The test cases cover:

1. **Divisible by 3**: Ensures "Fizz" is returned when the number is divisible by 3 and doesn’t contain a 5.
2. **Divisible by 5**: Ensures "Buzz" is returned when the number is divisible by 5 and doesn’t contain a 3.
3. **Divisible by 3 and 5**: Ensures "FizzBuzz" is returned when the number is divisible by both 3 and 5.
4. **Contains 3 (Not Divisible by 5)**: Confirms "Fizz" is returned if the number contains a 3 but isn’t divisible by 5.
5. **Contains 5 (Not Divisible by 3)**: Confirms "Buzz" is returned if the number contains a 5 but isn’t divisible by 3.
6. **Out of Range**: Confirms "Use the range 1 to 100" is returned for numbers outside the 1-100 range.

## Deliverables

- **GitHub Repository Link**: [FizzBuzz Repository](https://github.com/NelliYanchuk/fizzbuzz)
- **Code Coverage Screenshot**: See the `coverage` directory for a screenshot demonstrating test coverage.
