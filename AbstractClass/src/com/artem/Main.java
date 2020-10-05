package com.artem;

public class Main {

    public static void main(String[] args) {
	Dog dog = new Dog("Barbos");
	dog.eat();
	dog.breath();
	Parrot bird = new Parrot("Alex");
	bird.breath();
	bird.eat();
	bird.fly();

	Penguin penguin = new Penguin("Bulochka");
	penguin.fly();
	penguin.breath();
	penguin.eat();
    }
}
