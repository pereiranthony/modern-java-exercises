package org.example.functionalinterfaces.Ex03Consumer;

import java.util.function.Consumer;

/*
    3. Create Consumer<String> shout that prints the text in uppercase with "!" at the end.
    Call .accept() on 3 words.
*/

public class Main {
    static void main() {
        String[] words = {"apple", "play", "juice"};

        Consumer<String> shout = t -> System.out.println(t.toUpperCase() + "!");

        for(String word : words) {
            shout.accept(word);
        }

        System.out.println();
    }
}
