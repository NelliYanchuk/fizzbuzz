package dev.nyanchuk.fizzbuzz;

public class Fizzbuzz {
    byte number;

    // constructor
    Fizzbuzz(byte num) {
        this.number = num;
    }

    // function
    public static String FizzBuzzEvaluator1(byte num) {
        if (num < 1 || num > 100) {
            return "Use the range 1 to 100";
        }
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        }
        if (num % 3 == 0) {
            return "Fizz";
        }
        if (num % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(num);
    }

}
