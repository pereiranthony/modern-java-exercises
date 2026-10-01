package org.example.functionalinterfaces.Ex10Transactions;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    static void main() {
        Random random = new Random();
        String[] description = {"coffee", "water", "donuts"};
        double[] amount = {-8.5, -3.0, 10.0};

        Supplier<Transaction> genTransaction = () ->
                new Transaction(description[random.nextInt(description.length)],
                                amount[random.nextInt(amount.length)]);
        Predicate<Transaction> lessThan0 = t -> t.amount() < 0;
        Function<Transaction, String> formatTransaction =
                t -> String.format("%s: -R$%.2f", t.description(), Math.abs(t.amount()));
        Consumer<String> printTransaction = t -> System.out.println(t);

        printExpenses(genTransaction, lessThan0, formatTransaction, printTransaction);
    }

    static void printExpenses(Supplier<Transaction> genTransaction,
                              Predicate<Transaction> lessThan0,
                              Function<Transaction, String> formatTransaction,
                              Consumer<String> printTransaction) {
        for(int i = 0; i < 10; i++) {
            Transaction transaction = genTransaction.get();
            if (lessThan0.test(transaction)) {
                printTransaction.accept(formatTransaction.apply(transaction));
            } else {
                System.out.println("Payment received");
            }
        }
    }
}
