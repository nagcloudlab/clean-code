package com.example.living;

public class App {
    public static void main(String[] args) {
        God god = new God();

        Human human = new Human();
        Animal animal = new Animal();
        Robot robot = new Robot();

//        System.out.println("---");
//        god.manageHuman(human);
//        System.out.println("---");
//        god.manageAnimal(animal);
//        System.out.println("---");

        System.out.println("---");
        god.manageLivingThing(human);
        System.out.println("---");
        god.manageLivingThing(animal);
        System.out.println("---");
        god.manageLivingThing(robot);
        System.out.println("---");


    }
}
