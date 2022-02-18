package com.warimano.SectionSixExercises.InheritanceChallenge;

public class Trailer extends Car {
    private int storageUnits;

    public Trailer(int gears, String engineType, int storageUnits, int weight) {
        super(gears, engineType, weight);
        this.storageUnits = Math.max(storageUnits, 0);
    }

    public int getStorageUnits() {
        return storageUnits;
    }

    public void setStorageUnits(int storageUnits) {
        this.storageUnits = Math.max(storageUnits, 0);
    }
}
