package com.media.assignment;

import org.junit.Test;

/**
 * Unit test for Dog class.
 */
public class DogTest extends AbstractTest {

	@Test
	public void test_dog_cannot_fly() {
		Dog dog = new Dog();

		dog.fly();
		assertEquals("I cannot fly\n", os.toString());
	}

	@Test
	public void test_dog_cannot_sing() {
		Dog dog = new Dog();

		dog.sing();
		assertEquals("I cannot sing\n", os.toString());
	}

	@Test
	public void test_dog_can_walk() {
		Dog dog = new Dog();

		dog.walk();
		assertEquals("I am walking\n", os.toString());
	}

	@Test
	public void test_dog_can_swim() {
		Dog dog = new Dog();

		dog.swim();
		assertEquals("I am swimming\n", os.toString());
	}

	@Test
	public void test_dog_say_wolf_wolf() {
		Dog dog = new Dog();

		dog.say();
		assertEquals("Woof, woof\n", os.toString());
	}
}
