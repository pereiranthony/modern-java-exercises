package org.example.functionalinterfaces.Ex04Supplier;

import java.util.Random;
import java.util.function.Supplier;

/*
    4. Create Supplier<Integer> randomDice that returns a number from 1 to 6.
    Call .get() 5 times. Then think about this: why doesn't a Supplier take any parameters?
*/

public class Main {
    static void main() {
        Random random = new Random();
        Supplier<Integer> randomDice = () -> random.nextInt(1, 7);
        for(int i = 0; i < 5; i++) {
            System.out.println(randomDice.get());
        }
    }
}
