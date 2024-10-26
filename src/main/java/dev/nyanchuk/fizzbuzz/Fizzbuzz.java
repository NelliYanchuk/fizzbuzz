package dev.nyanchuk.fizzbuzz;

public class Fizzbuzz {
    int number;

    // constructor
    Fizzbuzz(int num) {
        this.number = num;
    }

    // function
    public static String FizzBuzzEvaluator1(int num) {
        if ((num<1)||(num>100)) {
            return "Use the range 1 to 100";
        }
        if ((num % 3 == 0) && (num % 5 == 0)) {
            return "FizzBuzz";
        }
        if (num % 3 == 0) {
            return "Fizz";
        }
        if (num % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }
}
