package com.media.assignment;

public class Rooster extends Chicken {

	@Override
	protected void initProperties() {
		super.initProperties();
		this.sound = "Cock-a-doodle-doo";
	}
}
