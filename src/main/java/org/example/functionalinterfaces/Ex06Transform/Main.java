package org.example.functionalinterfaces.Ex06Transform;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/*
    6. Write a method transform(List<Integer> list, Function<Integer, Integer> operation)
    that returns a new list.
    Call it to double every number, square every number, and turn negatives into zero.
*/

public class Main {
    static void main() {
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(16);
        list.add(-25);

        Function<Integer, Integer> doubleOp = t -> t + t;
        Function<Integer, Integer> squareOp = t -> t * t;
        Function<Integer, Integer> negativeOp = t -> Math.max(0,t);


        System.out.print("Current numbers: ");
        for(Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.print("\nDouble operation: ");
        for(Integer num : transform(list, doubleOp)) {
            System.out.print(num + " ");
        }
        System.out.print("\nSquare operation: ");
        for(Integer num : transform(list, squareOp)) {
            System.out.print(num + " ");
        }
        System.out.print("\nNegative operation: ");
        for(Integer num : transform(list, negativeOp)) {
            System.out.print(num + " ");
        }
    }

    static List<Integer> transform(List<Integer> list,
                                   Function<Integer, Integer> operation) {
        List<Integer> newList = new ArrayList<>();
        for(Integer num : list) {
            newList.add(operation.apply(num));
        }
        return newList;
    }
}
