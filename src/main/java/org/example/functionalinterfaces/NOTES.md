# Functional Interfaces

**Why it works and helps us?**

## Exercise 01 – Predicate

**What goes in, and what comes out?**
A value of any type goes in, and a boolean comes out.
Method signature:   `boolean test(T t)`

**How would I write this lambda as a normal method?**
```java
public boolean isEven(Integer t) {
    return t % 2 == 0;
}
```

**Where would this interface appear in real code?**
In filtering (`removeIf`, `stream().filter`), validation and business rules.
For example: checking if a bank transaction is an expense.

## Exercise 02 - Function

**What goes in, and what comes out?**
A value of any type goes in, and another value of any type comes out.
Method signature: `R apply(T t)`

**How would I write this lambda as a normal method?**
```java
public Integer length(String t) {
    return t.length();
}
```
**Where would this interface appear in real code?**
Converting an entity into a DTO, `Optional.map`, `stream().map`.
For example: formatting a transaction into a text.

## Exercise 03 - Consumer

**What goes in, and what comes out?**
A value of any type goes in, and nothing comes out. 
Its purpose is the action itself, not a result.
Method signature: `void accept(T t)`

**How would I write this lambda as a normal method?**
```java
public void shout(String t) {
    System.out.println(t.toUpperCase() + "!");
}
```

**Where would this interface appear in real code?**
In `forEach`, `Optional.ifPresent`, logging, sending notifications.
For example: printing a formatted transaction.

## Exercise 04 - Supplier

**What goes in, and what comes out?**
Nothing goes in, and a value of any type comes out. 
Its purpose is the result itself, not an action.
Method signature: `T get()`

**How would I write this lambda as a normal method?**
```java
public Integer randomDice() {
    return random.nextInt(1, 7);
}
```

**Where would this interface appear in real code?**
In `Optional.orElseGet(() ->...)` and `orElseThrow(() -> new SomeException())`.
For example: generating random transactions.

**Why doesn't a Supplier take any parameters?**
Because 


