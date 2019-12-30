package com.media.assignment;

public class Caterpillar extends Animal {

	@Override
	protected void initProperties() {
		super.initProperties();
		this.canFly = false;
		this.canWalk = true;
	}

}
