package ru.geekbrains.lesson6;

/**
 * Java 1. Homework #6
 *
 * @author Tatiana Kosorukova
 * @version 27.02.2022
 */
class Lesson6 {
    public static void main(String[] args) {
        IAnimal[] animals = {
                new Cat("Matroskin", false, 200),
                new Dog("Sharik", true, 500)
        };
        for (IAnimal animal : animals) {
            System.out.println(animal.swim(300));
            System.out.println(animal.run(550));
        }
    }
}

class Cat extends Animal {
    Cat(String name, boolean swim, int run) {
        super(name, swim, run);
    }

    @Override
    public String swim(int a) {
        return swim ? name + "проплыл" + a + "м" : "кот не умеет плавать";
    }

    public String run(int b) {
        return (b < 200 ? name + " пробежал " + b + "м" : name + " не пробежал " + b + "м");
    }
}

class Dog extends Animal {
    Dog(String name, boolean swim, int run) {
        super(name, swim, run);
    }

    @Override
    public String swim(int c) {
        return (c < 10 ? name + " проплыл " + c + "м" : name + " не проплыл " + c + "м");
    }

    public String run(int d) {
        return (d < 500 ? name + " пробежал " + d + "м" : name + " не пробежал " + d + "м");
    }
}

interface IAnimal {
    String swim(int a);

    String run(int a);
}

abstract class Animal implements IAnimal {
    protected String name;
    protected boolean swim;
    protected int run;

    Animal(String name, boolean swim, int run) {
        this.name = name;
        this.swim = swim;
        this.run = run;
    }

    @Override
    public String toString() {
        return (name + ", " + swim + ", " + run);
    }


