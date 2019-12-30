package com.media.assignment;

import java.util.Arrays;

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
		
		// Solution E
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolphin(),
				new Frog(),
				new Dog(),
				new Butterfly(),
				new Cat()
				};
		
		System.out.println("number of animals can fly = " + Arrays.asList(animals).stream()
				.filter(Animal::isCanFly).count());
		
		System.out.println("number of animals can walk = " + Arrays.asList(animals).stream()
				.filter(Animal::isCanWalk).count());
		
		System.out.println("number of animals can sing = " + Arrays.asList(animals).stream()
				.filter(Animal::isCanSing).count());
		
		System.out.println("number of animals can swim = " + Arrays.asList(animals).stream()
				.filter(Animal::isCanSwim).count());
	}
}
