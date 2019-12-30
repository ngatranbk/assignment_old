package com.media.assignment;

import org.junit.Test;

/**
 * Unit test for Cat class.
 */
public class CatTest extends AbstractTest {

	@Test
	public void test_cat_cannot_fly() {
		Cat cat = new Cat();

		cat.fly();
		assertEquals("I cannot fly\n", os.toString());
	}

	@Test
	public void test_cat_cannot_sing() {
		Cat cat = new Cat();

		cat.sing();
		assertEquals("I cannot sing\n", os.toString());
	}

	@Test
	public void test_cat_can_walk() {
		Cat cat = new Cat();

		cat.walk();
		assertEquals("I am walking\n", os.toString());
	}

	@Test
	public void test_cat_can_swim() {
		Cat cat = new Cat();

		cat.swim();
		assertEquals("I am swimming\n", os.toString());
	}

	@Test
	public void test_cat_say_meow() {
		Cat cat = new Cat();

		cat.say();
		assertEquals("Meow\n", os.toString());
	}
}
