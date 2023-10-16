package org.example;
public class Owner {
    private final String name;

    public Owner(String name) {
        this.name = name;
    }

    public void interactWithPet(Pet pet) {
        System.out.println(name + " взаємодіє з " + pet.getClass().getSimpleName() + " по імені " + ((Animal) pet).getName());
        pet.play();
        pet.eat();
        pet.sleep();
    }
}