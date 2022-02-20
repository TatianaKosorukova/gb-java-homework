package ru.geekbrains.lesson1;

/**
 * Java 1. Homework #1
 *
 * @author Tatiana Kosorukova
 * @version 20.02.2022
 */
public class Lesson1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 1, b = -2;
        System.out.println(a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    static void printColor() {
        int value = -2;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a = 1, b = 7;
        System.out.println(a >= b ? "a >= b" : "a <= b");
    }

}
