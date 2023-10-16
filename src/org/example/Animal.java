package org.example;
public abstract class Animal implements Pet {
    private final String breed;
    private final String name;
    private final String color;
    private final int age;

    public Animal(String breed, String name, String color, int age) {
        this.breed = breed;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void eat() {
        System.out.println(name + " їсть.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " спить.");
    }
}
