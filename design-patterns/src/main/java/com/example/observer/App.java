package com.example.observer;

import java.util.concurrent.TimeUnit;


/**
 * Observer pattern
 *
 * steps to implement observer pattern:
 *
 * 1. Create a subject interface with methods to add, remove and notify observers.
 * 2. Create a concrete subject class that implements the subject interface.
 * 3. Create an observer interface with methods to update the observer.
 * 4. Create concrete observer classes that implement the observer interface.
 * 5. Register the observer with the subject.
 * 6. Notify the observer when the state of the subject changes.
 *
 */

public class App {
    public static void main(String[] args) throws InterruptedException {

        Door door = new Door();

        Light light = new Light();
        Fan fan = new Fan();

        door.addListener(light);
        door.addListener(fan);

        door.open();
        TimeUnit.SECONDS.sleep(2);
        door.close();

        door.removeListener(light);
        door.open();
        TimeUnit.SECONDS.sleep(2);
        door.close();

    }
}
