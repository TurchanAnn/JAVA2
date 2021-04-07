package lesson4;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1: ");
        doTaskOne();
        System.out.println("---------------");
        System.out.println("Задание 2: ");
        doTaskTwo();
        System.out.println("---------------");
        System.out.println("Задание 3: ");
        doTaskThree(17);
        System.out.println("---------------");
        System.out.println("Задание 4: ");
        doTaskFor();
    }


    static void doTaskOne() {
        List<String> animals = Arrays.asList("Cat", "Dog", "Cracodile", "Pig");
        animals.forEach(s -> System.out.println(s));
    }


    static void doTaskTwo() {
        Set<String> values = new HashSet<String>(Arrays.asList("Cat", "Dog", "Cracodile", "Pig"));
        forItem(values, System.out::println);
    }


    static void forItem(Set<String> values, Consumer<String> consumer) {
        for (String item : values) {
            consumer.accept(item);
        }
    }

    static void doTaskThree(int i) {

        doubleUp(i, () -> 2);

    }

    static void doubleUp(int i, Supplier<Integer> integer) {
        System.out.println(integer.get() * i);

    }


    static void doTaskFor() {

        System.out.println(findAllChars("Mississippi", 's'));

    }

    static Optional<String> findAllChars(String target, char toFind) {
        StringBuilder result = new StringBuilder();
        char[] chars = target.toCharArray();
        for (char aChar : chars) {
            if (aChar == toFind) {
                result.append(aChar);
            }
        }
        if (result.length() > 0) {
            return Optional.of(result.toString());
        } else return Optional.empty();


    }
}
