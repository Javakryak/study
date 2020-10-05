package com.artem;

import java.util.ArrayList;

public class NPC implements ISavable {
    private String name;
    private int healths;

    public NPC(String name, int healths) {
        this.name = name;
        this.healths = healths;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealths() {
        return healths;
    }

    public void setHealths(int healths) {
        healths = healths;
    }

    @Override
    public String toString() {
        return "NPC{" +
                "name='" + name + '\'' +
                ", Healths=" + healths +
                '}';
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.healths);
        return values;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        if (savedValues != null && savedValues.size()>0){
            this.name = savedValues.get(0);
            this.healths = Integer.parseInt(savedValues.get(1));
        }
    }
}
