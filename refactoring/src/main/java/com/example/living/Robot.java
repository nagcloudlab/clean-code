package com.example.living;

public class Robot extends LivingThing{

    @Override
    public void eat() {
        System.out.println("Robot is eating");
    }

    @Override
    public void work() {
        System.out.println("Robot is working");
    }

}
