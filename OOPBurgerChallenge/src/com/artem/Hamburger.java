package com.artem;

public class Hamburger {
    public String breadRollType;
    private String meat;
    private boolean lettuce;
    private boolean carrot;
    private boolean tomato;
    private boolean avocado;

    public double additionalPrice;
    private double totalPrice;
    private double basePrice = 6;

    public Hamburger(String breadRollType, String meat, boolean lettuce, boolean carrot, boolean tomato, boolean avocado) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.lettuce = lettuce;
        if(lettuce)
            additionalPrice += 1;
        this.carrot = carrot;
        if(carrot)
            additionalPrice += 1;
        this.tomato = tomato;
        if(tomato)
            additionalPrice += 1;
        this.avocado = avocado;
        if(avocado)
            additionalPrice += 1;
    }

    public double getTotalPrice() {
        return additionalPrice + basePrice;
    }

    public void ultimateReceipt(){
        System.out.println("Base Price is " + basePrice);
        System.out.println("Additional price is " + additionalPrice);
        System.out.println("Total price is " + getTotalPrice());
        System.out.println("BreadType is " + breadRollType);
    }
}