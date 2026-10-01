package org.example.functionalinterfaces.Ex05PrintIf;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
    5. Write a method printIf(List<String> list, Predicate<String> condition)
    that prints only the items that pass the condition.
    Call it with 3 different lambdas.
*/

public class Main {
    static void main() {
        List<String> list = new ArrayList<>();
        list.add("Anthony");
        list.add("apple");
        list.add("join");

        Predicate<String> isShort = t -> t.length() <= 5;
        Predicate<String> isLowerCase = t -> t.equals(t.toLowerCase());
        Predicate<String> containsA = t -> t.contains("A") || t.contains("a");

        printIf(list, isShort);
        printIf(list, isLowerCase);
        printIf(list, containsA);
    }

    static void printIf(List<String> list, Predicate<String> condition) {
        for(String word : list) {
            if(condition.test(word)) {
                System.out.println(word);
            }
        }
    }
}
