package com.artem;

public class Motherboard {
    private String name;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public Motherboard(String name, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram (String programName){
        System.out.println("Program "+ programName + " is now loading...");
    }
}
