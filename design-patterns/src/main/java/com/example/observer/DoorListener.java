package com.example.observer;

public interface DoorListener {
    void on(DoorEvent doorEvent);
    void off(DoorEvent doorEvent);
}
