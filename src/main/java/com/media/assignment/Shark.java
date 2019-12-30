package com.media.assignment;

public class Shark extends Fish {

	@Override
	protected void initProperties() {
		super.initProperties();
		this.size = "large";
		this.color = "grey";
		this.foodType = "other fish";
	}
}
