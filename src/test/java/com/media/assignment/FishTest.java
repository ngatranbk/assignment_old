package com.media.assignment;

import org.junit.Test;

/**
 * Unit test for Fish class.
 */
public class FishTest extends AbstractTest {

	@Test
	public void test_fish_cannot_fly() {
		Fish fish = new Fish();

		fish.fly();
		assertEquals("I cannot fly\n", os.toString());
	}

	@Test
	public void test_fish_cannot_sing() {
		Fish fish = new Fish();

		fish.sing();
		assertEquals("I cannot sing\n", os.toString());
	}

	@Test
	public void test_fish_cannot_walk() {
		Fish fish = new Fish();

		fish.walk();
		assertEquals("I cannot walk\n", os.toString());
	}

	@Test
	public void test_fish_can_swim() {
		Fish fish = new Fish();

		fish.swim();
		assertEquals("I am swimming\n", os.toString());
	}
}
