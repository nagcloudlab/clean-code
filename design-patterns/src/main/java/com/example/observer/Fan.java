package com.example.observer;

public class Fan implements DoorListener{
    public void on(DoorEvent event) {
        System.out.println("fan on with door event: "+event);
    }
    public void off(DoorEvent event) {
        System.out.println("fan off with door event: "+event);
    }
}
