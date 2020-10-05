package com.artem;

public class Healthyburger extends Hamburger {
    private boolean onion;
    private boolean egg;


    public Healthyburger(String meat, boolean lettuce, boolean carrot, boolean tomato, boolean avocado, boolean onion, boolean egg) {
        super("brownRyeBread", meat, lettuce, carrot, tomato, avocado);
        this.onion = onion;
        if (onion)
            additionalPrice += 1;
        this.egg = egg;
        if (egg)
            additionalPrice += 1;
    }
}
