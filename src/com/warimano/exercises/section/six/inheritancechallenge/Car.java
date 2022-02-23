package com.warimano.exercises.section.six.inheritancechallenge;

public class Car extends Vehicle {

    private final String engineType;
    private final int gears;
    private int currentGear;

    public Car(int gears, String engineType, int weight) {
        super(weight);
        this.engineType = engineType;
        this.gears = Math.max(gears, 1);
    }

    public String getEngineType() {
        return engineType;
    }

    public int getGears() {
        return gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        if (currentGear < 1) {
            this.currentGear = 1;
        } else this.currentGear = Math.min(currentGear, this.gears);
    }
}
