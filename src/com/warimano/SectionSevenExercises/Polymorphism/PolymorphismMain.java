package com.warimano.SectionSevenExercises.Polymorphism;

public class PolymorphismMain {
    public static void main(String[] args) {
        Car car = new Car(8, "Base Car");
        printActions(car);

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        printActions(mitsubishi);

        Ford ford =  new Ford(6, "Ford Falcon");
        printActions(ford);

        Holden holden = new Holden(6, "Holden Commodore");
        printActions(holden);
    }

    public static void printActions(Car car) {
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
    }
}
