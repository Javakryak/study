package com.artem;

public class Challenge {
}

class Car {
    public int cylinders;
    public String name;
    public int wheels;
    public boolean engine;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

}

class BMW extends Car {
    public BMW(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "BMW -> startEngine()";
    }

    @Override
    public String brake() {
        return "BMW -> brake()";
    }

    @Override
    public String accelerate() {
        return "BMW -> accelerate()";
    }
}