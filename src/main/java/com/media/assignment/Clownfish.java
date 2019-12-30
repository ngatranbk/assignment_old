package com.media.assignment;

public class Clownfish extends Fish {

	@Override
	protected void initProperties() {
		super.initProperties();
		this.size = "small";
		this.color = "orange";
		this.canMakingJokes = true;
	}
}
