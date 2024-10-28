package dev.nyanchuk.fizzbuzz;

public class FizzbuzzNumContain {
    byte number;

    // constructor
    FizzbuzzNumContain(byte num) {
        this.number = num;
    }

    // function
    public static String FizzBuzzEvaluator2(byte num) {

        if (num < 1 || num > 100) {
            return "Use the range 1 to 100";
        }
        // this part is not in requirements but according to my logic has to be here.
        // if (((num % 3 == 0) || String.valueOf(num).contains("3"))
        // && ((num % 5 == 0) || String.valueOf(num).contains("5"))) {
        // return "FizzBuzz";
        // }
        if ((num % 3 == 0) || String.valueOf(num).contains("3")) {
            return "Fizz";
        }
        if ((num % 5 == 0) || String.valueOf(num).contains("5")) {
            return "Buzz";
        }
        return String.valueOf(num);
    }

}
