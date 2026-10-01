package org.example.functionalinterfaces.Ex01Predicate;

import java.util.function.Predicate;

/*
    1. Create Predicate<Integer> isEven and Predicate<String> isBlank.
    Test each with 3 different values and print the results.
*/

public class Main {

    static void main() {
        Integer[] numbers = {10, 99, 76};
        String[] names = {" ", " ", "Rubens"};

        Predicate<Integer> isEven = t -> t % 2 == 0;
        Predicate<String> isBlank = t -> t.isBlank();

        for(Integer number : numbers) {
            System.out.printf("Is even (%d)? %s\n", number, isEven.test(number));
        }

        for(String name : names) {
            System.out.printf("Is blank (%s)? %s\n", name, isBlank.test(name));
        }
    }
}
