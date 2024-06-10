package com.example.observer;


import java.util.ArrayList;
import java.util.List;

public class Door {

   private List<DoorListener> listeners = new ArrayList<>();

   public void addListener(DoorListener listener) {
       listeners.add(listener);
    }

    public void removeListener(DoorListener listener) {
        listeners.remove(listener);
    }

    public void open() {
        System.out.println("Door opened");
        listeners.forEach(listener -> listener.on(new DoorEvent(1,2)));
    }

    public void close() {
        System.out.println("Door closed");
        listeners.forEach(listener -> listener.off(new DoorEvent(3,4)));
    }

}
