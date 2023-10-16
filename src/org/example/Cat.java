package org.example;

public class Cat extends Animal {
    private final int furLength;

    public Cat(String breed, String name, String color, int age, int furLength) {
        super(breed, name, color, age);
        this.furLength = furLength;
    }

    public int getFurLength() {
        return furLength;
    }

    @Override
    public void play() {
        System.out.println(getName() + " грає з м'ячиком.");
    }
}
