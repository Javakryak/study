package com.timbuchalka;

public class Planet extends HeavenlyBodyNew {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, "Planet");
    }

    @Override
    public boolean addMoon(HeavenlyBodyNew moon) {
        return super.addMoon(moon);
    }
}
