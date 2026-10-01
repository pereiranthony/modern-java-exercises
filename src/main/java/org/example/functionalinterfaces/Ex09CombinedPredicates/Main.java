package org.example.functionalinterfaces.Ex09CombinedPredicates;

/*
    9. Use .and(), .or() and .negate() to build 3 combined predicates from these two:
    Predicate<String> startsWithA and Predicate<String> longerThan5.
    Before running each one, predict which words will pass, then check your prediction.
*/

import java.util.function.Predicate;

public class Main {
    static void main() {
        Predicate<String> startsWithA = t -> t.startsWith("A");
        Predicate<String> longerThan5 = t -> t.length() > 5;
        combinePredicates(startsWithA, longerThan5);
    }

    static void combinePredicates(Predicate<String> startsWithA, Predicate<String> longerThan5) {
        String[] words = {"apple", "orange", "Aim"};

        for(String word : words) {
            System.out.printf("Or(%s): %s\n", word,startsWithA.or(longerThan5).test(word));
            System.out.printf("And(%s): %s\n", word,startsWithA.and(longerThan5).test(word));
            System.out.printf("Negate(%s): %s\n", word,startsWithA.negate().test(word));
        }
    }
}
