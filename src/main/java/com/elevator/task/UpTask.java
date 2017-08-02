package com.elevator.task;

public class UpTask implements Task {

	private int fromFloor;
	private int toFloor;

	public UpTask(int fromFloor, int toFloor) {
		this.fromFloor = fromFloor;
		this.toFloor = toFloor;
	}

	@Override
	public int getToFloor() {
		return toFloor;
	}

	@Override
	public int getFromFloor() {
		return fromFloor;
	}
	
}
