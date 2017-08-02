package com.elevator.task;

import static org.junit.Assert.*;

import org.junit.*;

import com.elevator.task.DownTask;

public class DownTaskTest {
	
	private DownTask task;
	
	@Before
	public void setUp() {
		task = new DownTask(5, 2);
	}
	
	@Test
	public void can_return_origin_floor() {
		Integer fromFloor = task.getFromFloor();
		
		assertEquals(new Integer(5), fromFloor);
	}
	
	@Test
	public void can_return_destination_floor() {
		Integer toFloor = task.getToFloor();
		
		assertEquals(new Integer(2), toFloor);
	}
}