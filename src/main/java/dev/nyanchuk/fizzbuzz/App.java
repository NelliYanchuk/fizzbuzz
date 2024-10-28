package dev.nyanchuk.fizzbuzz;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        for (byte num = 1; num <= 100; num++) {
            System.out.println(Fizzbuzz.FizzBuzzEvaluator(num));
        }
    }

}
