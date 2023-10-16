package org.example;

public class Dog extends Animal {
    private final boolean isFriendly;

    public Dog(String breed, String name, String color, int age, boolean isFriendly) {
        super(breed, name, color, age);
        this.isFriendly = isFriendly;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    @Override
    public void play() {
        System.out.println(getName() + " грає зі смачною кісточкою.");
    }
}