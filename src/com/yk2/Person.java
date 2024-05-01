package com.yk2;

public class Person {
    private int age;

    public Person(int age) throws AgeExtention {
        if (age < 18) {
            throw new AgeExtention("Вознаст должен быть минимум 18 лет.");
        }
        this.age = age;
    }
}
