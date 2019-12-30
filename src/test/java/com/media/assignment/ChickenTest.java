package com.media.assignment;

import org.junit.Test;

/**
 * Unit test for Chicken class.
 */
public class ChickenTest extends AbstractTest {

	@Test
	public void test_chicken_cannot_fly() {
		Chicken chicken = new Chicken();

		chicken.fly();
		assertEquals("I cannot fly\n", os.toString());
	}

	@Test
	public void test_chicken_cannot_sing() {
		Chicken chicken = new Chicken();

		chicken.sing();
		assertEquals("I cannot sing\n", os.toString());
	}

	@Test
	public void test_chicken_can_walk() {
		Chicken chicken = new Chicken();

		chicken.walk();
		assertEquals("I am walking\n", os.toString());
	}

	@Test
	public void test_chicken_cannot_swim() {
		Chicken chicken = new Chicken();

		chicken.swim();
		assertEquals("I cannot swim\n", os.toString());
	}

	@Test
	public void test_chicken_say_cluck_cluck() {
		Chicken chicken = new Chicken();

		chicken.say();
		assertEquals("Cluck, cluck\n", os.toString());
	}
}
