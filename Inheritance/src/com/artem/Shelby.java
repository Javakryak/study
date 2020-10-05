package com.artem;

public class Shelby extends Car {
    private int roadServiceMonths;

    public Shelby(int roadServiceMonths) {
        super("Shelby", "2WD", 4, 2, 5, true);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate (int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        } else if (newVelocity > 30 && newVelocity <= 40){
            changeGear(4);
        } else {
            changeGear(5);
        }
        if (newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
