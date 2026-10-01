package org.example.functionalinterfaces.Ex08PredicateAndConsumer;

import java.util.function.Consumer;
import java.util.function.Predicate;

/*
    8. Write one method that receives a Predicate and a Consumer.
    It should run the consumer only on the items that pass the predicate.
    For example, print a warning for every value above 1000.
*/

public class Main {
    static void main() {
        Integer[] numbers = {999, 1001, 4000};
        Predicate<Integer> condition = t -> t > 1000;
        Consumer<Integer> warning = t ->
                System.out.println("Warning: number " + t + " is above 1000!");
        checkNum(condition, warning, numbers);
    }

    static void checkNum(Predicate<Integer> condition,
                         Consumer<Integer> warning,
                         Integer[] numbers) {
        for(Integer num : numbers) {
            if(condition.test(num)) {
                warning.accept(num);
            }
        }
    }
}
