package org.example.functionalinterfaces.Ex07Fill;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/*
    7. Write a method fill(int size, Supplier<String> generator)
    that returns a list with size items created by the supplier.
    Test it with a supplier that always returns "empty"
    and another that returns random codes like "TX-4821".
*/

public class Main {
    static void main() {
        Random random = new Random();

        Supplier<String> emptyGen = () -> "empty";
        Supplier<String> codeGen = () -> "TX-" + String.format("%04d", random.nextInt(10000));

        for(String value : fill(5, emptyGen)) {
            System.out.printf("%s ", value);
        }
        System.out.println();

        for(String value : fill(5, codeGen)) {
            System.out.printf("%s ", value);
        }
    }

    static List<String> fill(int size, Supplier<String> generator) {
        List<String> list = new ArrayList<>();

        for(int i=0; i<size; i++) {
            list.add(generator.get());
        }
        return list;
    }
}
