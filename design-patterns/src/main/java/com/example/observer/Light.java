package com.example.observer;

public class Light implements DoorListener {
        public void on(DoorEvent event) {
            System.out.println("light on with door event: "+event);
        }
        public void off(DoorEvent event) {
            System.out.println("light off with door event: "+event);
        }
}
