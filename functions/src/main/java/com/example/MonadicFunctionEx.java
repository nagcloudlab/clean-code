package com.example;

import java.util.ArrayList;
import java.util.List;

public class MonadicFunctionEx {
    public static void main(String[] args) {

        List<Dish> menu = Dish.menu;

        // Req1: get dish names where cal < 400, ordered by cal

        System.out.println(
//                getLowCalDishNamesV1(menu)
        );
        System.out.println(
                getLowCalDishNamesV2(menu)
        );


    }

    private static List<String> getLowCalDishNamesV2(List<Dish> menu) {
        return menu.stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted((d1, d2) -> Integer.compare(d1.getCalories(), d2.getCalories()))
                .map(Dish::getName)
                .limit(1)
                .toList();
    }

    private static List<String> getLowCalDishNamesV1(List<Dish> menu) {
        // step 1: filter dishes with cal < 400
        List<Dish> lowCalDishes = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.getCalories() < 400) {
                lowCalDishes.add(dish);
            }
        }
        // step 2: sort dishes by cal
        lowCalDishes.sort((d1, d2) -> Integer.compare(d1.getCalories(), d2.getCalories()));
        // step 3: get dish names
        List<String> dishNames = new ArrayList<>();
        for (Dish dish : lowCalDishes) {
            dishNames.add(dish.getName());
        }
        return dishNames;

    }
}
