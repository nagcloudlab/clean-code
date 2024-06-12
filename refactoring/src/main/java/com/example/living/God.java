package com.example.living;

// Open Closed Principle - This class is open for extension and closed for modification
public class God {
//
//    public void manageHuman(Human human) {
//        human.eat();
//        human.sleep();
//        human.work();
//    }
//
//    public void manageAnimal(Animal animal) {
//        animal.eat();
//        animal.sleep();
//        animal.work();
//    }


    public void manageLivingThing(LivingThing livingThing) {
        livingThing.eat();
        livingThing.sleep();
        livingThing.work();
    }

}
