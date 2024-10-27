package dev.nyanchuk.fizzbuzz;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        // etap 1
        //for (byte num = 1; num <= 100; num++) {
        //    System.out.println(Fizzbuzz.FizzBuzzEvaluator1(num));
        //}
        // etap 2
        for (byte num = 1; num <= 100; num++) {
            System.out.println(FizzbuzzNumContain.FizzBuzzEvaluator2(num));
        }
    }
    
}
