package com.media.assignment;

public class Cat extends Animal {

	@Override
	protected void initProperties() {
		super.initProperties();
		this.canSay = true;
		this.canSwim = true;

		this.sound = "Meow";
	}

}
