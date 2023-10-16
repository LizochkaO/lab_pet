package org.example;

public class Main {
    public static void main(String[] args) {
        // Створення котеня
        Cat cat = new Cat("Персидська", "Умка", "Сірий", 2, 5);

        // Створення собачки
        Dog dog = new Dog("Лабрадор", "Рекс", "Золотистий", 3, true);

        // Створення власника
        Owner owner = new Owner("Лиза");

        // Взаємодія власника з котеням
        owner.interactWithPet(cat);

        // Взаємодія власника з собачкою
        owner.interactWithPet(dog);
    }
}