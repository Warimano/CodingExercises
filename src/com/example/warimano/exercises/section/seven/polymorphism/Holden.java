package com.example.warimano.exercises.section.seven.polymorphism;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden starting";
    }

    @Override
    public String accelerate() {
        return "Holden accelerating";
    }

    @Override
    public String brake() {
        return "Holden braking";
    }
}
