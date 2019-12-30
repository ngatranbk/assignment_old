package com.media.assignment;

public class Animal {

	protected boolean canWalk;
	protected boolean canFly;
	protected boolean canSing;

	public Animal() {
		super();
		initProperties();
	}

	protected void initProperties() {
		this.canWalk = true;
		this.canFly = false;
		this.canSing = false;
	}

	protected void walk() {
		if (this.canWalk) {
			System.out.println("I am walking");
		} else {
			System.out.println("I cannot walk");
		}
	}
	
	protected void fly() {
		if (this.canFly) {
			System.out.println("I am flying");
		} else {
			System.out.println("I cannot fly");
		}
	}

	protected void sing() {
		if (this.canSing) {
			System.out.println("I am singing");
		} else {
			System.out.println("I cannot sing");
		}
	}
}
