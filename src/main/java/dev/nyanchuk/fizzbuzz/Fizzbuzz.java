package dev.nyanchuk.fizzbuzz;

public class Fizzbuzz {
    int number;

    // constructor
    Fizzbuzz(int num) {
        this.number = num;
    }

    // function
    public String FizzBuzzEvaluator1(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        } else {
            return String.valueOf(this.number);
        }
    }
}
