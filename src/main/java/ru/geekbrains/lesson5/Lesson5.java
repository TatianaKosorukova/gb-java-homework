package ru.geekbrains.lesson5;

/**
 * Java 1. Homework #6
 *
 * @author Tatiana Kosorukova
 * @version 27.02.2022
 */
class Lesson5 {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Natalia Nikolaeva", "Manager", "nnikolaeva@company.ru", "89001002011", 45000, 27),
                new Person("Anton Antonov", "Boss", "aantonov@company.ru", "89001002099", 195000, 45),
                new Person("Irina Stepanova", "Assistant", "nnikolaeva@company.ru", "89001002022", 26000, 22),
                new Person("Timofei Petrov", "Software developer", "tpetrov@company.ru", "89001002044", 85000, 41),
                new Person("Elena Ivanova", "QA Engineer", "eivanova@company.ru", "89001002077", 50000, 35),
        };
        for (Person person : persons) {
            if (person.getAge() > 40) {
                System.out.println(person);
            }
        }
    }
}

class Person {
    private String fullname;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;


    public Person(String fullname, String position, String email, String phone, int salary, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return (fullname + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age);
    }
}
