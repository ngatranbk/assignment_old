package com.media.assignment;

class Parrot extends Bird {

	private Animal neighbor;

	public Parrot() {
		super();
	}

	public Parrot(Animal neighbor) {
		this();
		this.neighbor = neighbor;
	}

	@Override
	protected void initProperties() {
		super.initProperties();
		this.canSing = false;
	}

	@Override
	protected void say() {
		if (neighbor != null) {
			neighbor.say();
		} else {
			this.say();
		}
	}

	public Animal getNeighbor() {
		return neighbor;
	}

	public void setNeighbor(Animal neighbor) {
		this.neighbor = neighbor;
	}
}
