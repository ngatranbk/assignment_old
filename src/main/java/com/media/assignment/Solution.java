package com.media.assignment;

public class Solution {
	public static void main(String[] args) {
		// Solution A1
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

		// Solution A2
		Duck duck = new Duck();
		duck.fly();
		duck.say();
		duck.swim();
		duck.sing();

		Chicken chicken = new Chicken();
		chicken.fly();
		chicken.say();
		chicken.swim();
		chicken.sing();

		// Solution A3
		Rooster rooster = new Rooster();
		rooster.fly();
		rooster.say();
		rooster.swim();
		rooster.sing();
		
		// Solution A4
		Dog dog = new Dog();
		Cat cat = new Cat();
		Parrot parrot = new Parrot();
		parrot.fly();
		parrot.swim();
		parrot.sing();
		parrot.setNeighbor(dog);
		parrot.say();
		
		parrot.setNeighbor(cat);
		parrot.say();
		
		parrot.setNeighbor(rooster);
		parrot.say();
	}
}
