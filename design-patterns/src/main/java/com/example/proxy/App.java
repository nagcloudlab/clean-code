package com.example.structural.proxy;

public class App {
    public static void main(String[] args) {


        TrainerProxy  trainer = new TrainerProxy();

        System.out.println(trainer.getCleanCodeTraining());
        System.out.println(trainer.getJavaTraining());

    }
}
