package com.example.behavior;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//---
//
// 1. Imperative style
//- solving any using step-by-step approach
//intention + implementation mixed together

// 2. Declarative style
// by primitive parameterization
// by behavior ( function ) parameterization

public class InventoryApp {

    public static void main(String[] args) {

        List<Apple> inventory = List.of(
            new Apple("green", 80),
            new Apple("green", 155),
            new Apple("red", 120)
        );

        // Req-1 : filter green apples
        System.out.println(
//                filterGreenApples(inventory)
//                filterApplesByColor(inventory, "green")
//                filterApples(inventory, "green", 0, true)
                 filterApples(inventory, apple -> "green".equals(apple.getColor()))
        );

        // Req-2 : filter red apples
        System.out.println(
//                filterRedApples(inventory)
//                filterApplesByColor(inventory, "red")
//                filterApples(inventory, "red", 0, true)
                filterApples(inventory, apple -> "red".equals(apple.getColor()))
        );

        // Req-3 : filter apples by weight
        System.out.println(
//                filterApplesByWeight(inventory, 150)
//                filterApples(inventory, "", 150, false)
                filterApples(inventory, apple -> apple.getWeight() == 155)
        );

        // Req-4 : filter apples by color and weight
        System.out.println(
                filterApples(inventory, apple -> "green".equals(apple.getColor()) && apple.getWeight() == 80)
        );

    }


    // single focused method
    // open for extension, closed for modification
    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

//    private static List<Apple> filterApples(List<Apple> inventory, String color, int weight, boolean flag) {
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple : inventory) {
//            if ((flag && apple.getColor().equals(color)) || (!flag && apple.getWeight() > weight)) {
//                result.add(apple);
//            }
//        }
//        return result;
//    }

//    private static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple : inventory) {
//            if (apple.getWeight() > weight) {
//                result.add(apple);
//            }
//        }
//        return result;
//    }
//
//    private static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple : inventory) {
//            if (color.equals(apple.getColor())) {
//                result.add(apple);
//            }
//        }
//        return result;
//    }

//    private static List<Apple> filterGreenApples(List<Apple> inventory) {
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple : inventory) {
//            if ("green".equals(apple.getColor())) {
//                result.add(apple);
//            }
//        }
//        return result;
//    }
//
//    private static List<Apple> filterRedApples(List<Apple> inventory) {
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple : inventory) {
//            if ("red".equals(apple.getColor())) {
//                result.add(apple);
//            }
//        }
//        return result;
//    }

}
