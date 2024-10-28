package dev.nyanchuk.fizzbuzz;

public class Fizzbuzz {
    byte number;

    // constructor
    Fizzbuzz(byte num) {
        this.number = num;
    }

    // function
    public static String FizzBuzzEvaluator(byte num) {
        if ((num < 1) || (num > 100)) {
            return "Use the range 1 to 100";
        }
        if ((num % 3 == 0) && (num % 5 == 0)) {
            return "FizzBuzz";
        }
        if ((num % 3 == 0) || String.valueOf(num).contains("3")) {
            return "Fizz";
        }
        if ((num % 5 == 0) || String.valueOf(num).contains("5")) {
            return "Buzz";
        }
        return String.valueOf(num);
    }
}
