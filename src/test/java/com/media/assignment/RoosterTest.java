package com.media.assignment;

import org.junit.Test;

/**
 * Unit test for Rooster class.
 */
public class RoosterTest extends AbstractTest {

	@Test
	public void test_rooster_cannot_fly() {
		Rooster rooster = new Rooster();

		rooster.fly();
		assertEquals("I cannot fly\n", os.toString());
	}

	@Test
	public void test_rooster_cannot_sing() {
		Rooster rooster = new Rooster();

		rooster.sing();
		assertEquals("I cannot sing\n", os.toString());
	}

	@Test
	public void test_rooster_can_walk() {
		Rooster rooster = new Rooster();

		rooster.walk();
		assertEquals("I am walking\n", os.toString());
	}

	@Test
	public void test_rooster_cannot_swim() {
		Rooster rooster = new Rooster();

		rooster.swim();
		assertEquals("I cannot swim\n", os.toString());
	}

	@Test
	public void test_rooster_say_cook_a_doodle_doo() {
		Rooster rooster = new Rooster();

		rooster.say();
		assertEquals("Cock-a-doodle-doo\n", os.toString());
	}
}
