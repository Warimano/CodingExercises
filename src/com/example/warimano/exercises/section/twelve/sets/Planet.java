package com.example.warimano.exercises.section.twelve.sets;

public class Planet extends HeavenlyBody{
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody heavenlyBody) {
        if (heavenlyBody.getKey().getBodyType().equals(BodyTypes.MOON)) {
            return super.addSatellite(heavenlyBody);
        } else {
            return false;
        }
    }
}
