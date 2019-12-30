package com.media.assignment;

import org.junit.Test;

public class ParrotTest extends AbstractTest {

	@Test
	public void test_parrot_can_fly() {
		Parrot parrot = new Parrot();

		parrot.fly();
		assertEquals("I am flying\n", os.toString());
	}

	@Test
	public void test_parrot_cannot_sing() {
		Parrot parrot = new Parrot();

		parrot.sing();
		assertEquals("I cannot sing\n", os.toString());
	}

	@Test
	public void test_parrot_can_walk() {
		Parrot parrot = new Parrot();

		parrot.walk();
		assertEquals("I am walking\n", os.toString());
	}
	
	@Test
	public void test_parrot_can_say_same_as_its_neighbor_dog() {
		Parrot parrot = new Parrot();

		Dog dog = new Dog();
		parrot.setNeighbor(dog);
		parrot.say();
		assertEquals("Woof, woof\n", os.toString());
	}
	
	@Test
	public void test_parrot_can_say_same_as_its_neighbor_cat() {
		Parrot parrot = new Parrot();

		Cat cat = new Cat();
		parrot.setNeighbor(cat);
		parrot.say();
		assertEquals("Meow\n", os.toString());
	}
	
	@Test
	public void test_parrot_can_say_same_as_its_neighbor_rooster() {
		Parrot parrot = new Parrot();

		Rooster rooster = new Rooster();
		parrot.setNeighbor(rooster);
		parrot.say();
		assertEquals("Cock-a-doodle-doo\n", os.toString());
	}
}
