package com.media.assignment;

public class Chicken extends Bird {

	@Override
	protected void initProperties() {
		super.initProperties();
		this.canFly = false;
		this.canSing = false;
		this.sound = "Cluck, cluck";
	}
}
