package org.example.functionalinterfaces.Ex02Function;

import java.util.function.Function;

/*
    2. Create Function<String, Integer> length and Function<Double, Double> addTax (adds 10%).
    Call .apply() on a few values.
*/

public class Main {
    static void main() {
        String[] names = {"Ali", "John", "Josias"};
        Double[] prices = {200.0, 670.0, 1090.0};

        Function<String, Integer> length = t-> t.length();
        Function<Double, Double> addTax = t -> t + t * 0.1;

        for(String name : names) {
            System.out.printf("Name length (%s): %s\n", name, length.apply(name));
        }

        for(Double price : prices) {
            System.out.printf("Price with increase (%.2f): %.2f\n", price, addTax.apply(price));
        }
    }
}
