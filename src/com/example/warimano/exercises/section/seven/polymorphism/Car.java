package com.example.warimano.exercises.section.seven.polymorphism;

public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine() {
        return "Car starting";
    }

    public String accelerate() {
        return "Car accelerating ";
    }

    public String brake() {
        return "Car braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
