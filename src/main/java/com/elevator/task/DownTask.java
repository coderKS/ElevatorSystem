package com.elevator.task;

public class DownTask implements Task {

	private int fromFloor;
	private int toFloor;

	public DownTask(int fromFloor, int toFloor) {
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
