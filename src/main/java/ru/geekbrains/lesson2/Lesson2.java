package ru.geekbrains.lesson2;

/**
 * Java 1. Homework #2
 *
 * @author Tatiana Kosorukova
 * @version 20.02.2022
 */
public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(isSumBetween(2, 12) ? "true" : "false");

        checkPositive(-2);

        System.out.println(isNegative(2));

        writeStringXTimes("Homework", 5);
    }

    static boolean isSumBetween(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    static void checkPositive(int a) {
        System.out.println(a >= 0 ? "Positive" : "Negative");
    }

    static boolean isNegative(int a) {
        return a < 0;
    }

    static void writeStringXTimes(String a, int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(a);
        }
    }

}
