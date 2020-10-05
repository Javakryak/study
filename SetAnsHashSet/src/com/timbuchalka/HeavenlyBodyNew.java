package com.timbuchalka;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBodyNew {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBodyNew> satellites;
    private String bodyType;

    public HeavenlyBodyNew(String name, double orbitalPeriod, String bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        if (bodyType.toUpperCase() == "MOON" || bodyType.toUpperCase() == "PLANET"){
            this.bodyType = bodyType;
        } else {
            System.out.println("Wrong Bodytype. May be only Planet or Moon.");
        }
    }

    public String getName() {
        return name;
    }

    public String getBodyType(){
        return this.bodyType;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBodyNew moon) {
        if (moon.getBodyType().toUpperCase() != "MOON") {
            return this.satellites.add(moon);
        } else {
            System.out.println("You can't add satellites to Moons.");
            return false;
        }
    }

    public Set<HeavenlyBodyNew> getSatellites() {
        return new HashSet<>(this.satellites);
    }


    @Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if (obj == null) {
            return false;
        }

        String objName = ((HeavenlyBodyNew) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        return this.name.hashCode() + 57;
    }
}
