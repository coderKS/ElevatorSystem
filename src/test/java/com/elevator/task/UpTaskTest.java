package com.elevator.task;

import static org.junit.Assert.*;

import org.junit.*;

import com.elevator.task.UpTask;

public class UpTaskTest {
	
	private UpTask task;
	
	@Before
	public void setUp() {
		task = new UpTask(2, 5);
	}
	
	@Test
	public void can_return_origin_floor() {
		Integer fromFloor = task.getFromFloor();
		
		assertEquals(new Integer(2), fromFloor);
	}
	
	@Test
	public void can_return_destination_floor() {
		Integer toFloor = task.getToFloor();
		
		assertEquals(new Integer(5), toFloor);
	}
}
