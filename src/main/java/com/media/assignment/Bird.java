package com.media.assignment;

public class Bird extends Animal {

	@Override
	protected void initProperties() {
		super.initProperties();
		this.canFly = true;
		this.canSing = true;
		this.canSay = true;
	}

}
