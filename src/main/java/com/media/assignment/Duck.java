package com.media.assignment;

public class Duck extends Bird {

	@Override
	protected void initProperties() {
		super.initProperties();
		this.canSwim = true;
		this.canSing = false;
		this.sound = "Quack, quack";
	}
}
