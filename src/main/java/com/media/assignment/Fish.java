package com.media.assignment;

public class Fish extends Bird {

	@Override
	protected void initProperties() {
		super.initProperties();
		this.canFly = false;
		this.canSing = false;
		this.canWalk = false;
		this.canSwim = true;
	}
}
