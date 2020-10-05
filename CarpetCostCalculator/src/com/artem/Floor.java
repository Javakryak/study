package com.artem;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        if (width > 0) {
            this.width = width;
        } else this.width = 0d;
        if (length > 0) {
            this.length = length;
        } else this.length = 0d;
    }

    public double getArea (){
        return this.length*this.width;
    }
}
