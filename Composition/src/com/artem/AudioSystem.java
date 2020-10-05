package com.artem;

public class AudioSystem {
    private String model;
    private String manufacturer;
    private int power;
    private int numSpeakers;

    public AudioSystem(String model, String manufacturer, int power, int numSpeakers) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.power = power;
        this.numSpeakers = numSpeakers;
    }

    public void powerOn (){
        System.out.println("Audio system now playing");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPower() {
        return power;
    }

    public int getNumSpeakers() {
        return numSpeakers;
    }
}
