package com.artem;

public class Deluxehamburger extends Hamburger {
    public boolean coke;
    public boolean chips;

    public Deluxehamburger(String breadRollType, String meat, boolean coke, boolean chips) {
        super(breadRollType, meat, false, false, false, false);
        this.coke = coke;
        if (coke)
            additionalPrice += 1;
        this.chips = chips;
        if (chips)
            additionalPrice += 1;
    }
}
