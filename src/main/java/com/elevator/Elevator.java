package com.elevator;

import com.elevator.status.*;

public abstract class Elevator implements Runnable{
	private int capacity;
	private int speed;
	private int current_floor;
	private DoorStatus doorStatus = DoorStatus.Close;
	private Status status = Status.Idle;

	
	
}
