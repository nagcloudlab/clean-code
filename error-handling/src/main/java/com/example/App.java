package com.example;

// User -> Car -> Insurance

import java.util.Optional;

class Insurance {
    private String name;
    public Insurance(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class Car {
    private Optional<Insurance> insurance= Optional.empty();
    public void setInsurance(Optional<Insurance> insurance) {
        this.insurance = insurance;
    }
    public Optional<Insurance> getInsurance() {
        return insurance;
    }
}

class User {
    private Optional<Car> car= Optional.empty();
    public User() {
    }
    public void setCar(Optional<Car> car) {
        this.car = car;
    }
    public Optional<Car> getCar() {
        return car;
    }
}


public class App {

    public static void main(String[] args) {

        // scenario: user has a car, car has insurance
//        Insurance insurance = new Insurance("Geico");
//        Car car = new Car();
//        car.setInsurance(insurance);
//        User user = new User();
//        user.setCar(car);
//
//        // get insurance name, of user's car
//        String insuranceName = user.getCar().getInsurance().getName();
//        System.out.println(insuranceName);

        // scenario: user has a car, car has no insurance
//
//        Car car2 = new Car();
//        User user2 = new User();
//        user2.setCar(car2);

        // get insurance name, of user's car
//        String insuranceName2 = user2.getCar().getInsurance().getName();
//        System.out.println(insuranceName2);


//        try {
//            String insuranceName2 = user2.getCar().getInsurance().getName();
//            System.out.println(insuranceName2);
//        } catch (NullPointerException e) {
//            System.out.println("Insurance not found");
//        }

//
//        if(user2.getCar() != null) {
//            if(user2.getCar().getInsurance() != null) {
//                String insuranceName2 = user2.getCar().getInsurance().getName();
//                System.out.println(insuranceName2);
//            } else {
//                System.out.println("Insurance not found");
//            }
//        } else {
//            System.out.println("Car not found");
//        }


        //----------------------------------------


        // scenario: user has car, car has insurance

//        Insurance insurance = new Insurance("Geico");
//        Car car = new Car();
//        car.setInsurance(Optional.of(insurance));
//        User user = new User();
//        user.setCar(Optional.of(car));
//
//        // get insurance name, of user's car
//        String insuranceName = user.getCar().get().getInsurance().get().getName();
//        System.out.println(insuranceName);

        // scenario: user has a car, car has no insurance

        Car car2 = new Car();
        User user2 = new User();
        user2.setCar(Optional.of(car2));

        // get insurance name, of user's car

        String insuranceName2 = user2.getCar()
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Insurance not found");
        System.out.println(insuranceName2);


    }
}
