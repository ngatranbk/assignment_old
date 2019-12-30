package com.media.assignment;

public class Animal {

	protected boolean canWalk;
	protected boolean canFly;
	protected boolean canSing;
	protected boolean canSwim;
	protected boolean canSay;
	protected boolean canMakingJokes;

	protected String sound;
	protected String size;
	protected String color;
	protected String foodType;

	public Animal() {
		super();
		initProperties();
	}

	protected void initProperties() {
		this.canWalk = false;
		this.canFly = false;
		this.canSing = false;
		this.canSwim = false;
		this.canSay = false;
		this.canMakingJokes = false;

		this.sound = "";
		this.size = "";
		this.color = "";
		this.foodType = "";
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

	protected void swim() {
		if (this.canSwim) {
			System.out.println("I am swimming");
		} else {
			System.out.println("I cannot swim");
		}
	}

	protected void say() {
		if (this.canSay) {
			System.out.println(this.sound);
		} else {
			System.out.println("I cannot say");
		}
	}

	protected void makeJokes() {
		if (this.canMakingJokes) {
			System.out.println("I am making jokes");
		} else {
			System.out.println("I cannot make jokes");
		}
	}

	public boolean isCanWalk() {
		return canWalk;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public boolean isCanSing() {
		return canSing;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public boolean isCanSay() {
		return canSay;
	}

	public boolean isCanMakingJokes() {
		return canMakingJokes;
	}

	public String getSound() {
		return sound;
	}

	public String getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

	public String getFoodType() {
		return foodType;
	}
}
