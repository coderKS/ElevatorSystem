package com.elevator;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class FloorTest {
	private Floor floor;

	@Before
	public void setup() {
		floor = new Floor(1, 10, new LinkedList<Task>());
	}
	
	@Test
	public void floor_getId_should_return_1() {
		assertEquals(1, floor.getId());
	}
	
	@Test
	public void floor_getNumOfPassenger_should_return_10() {
		assertEquals(10, floor.getNumOfPassenger());
	}
	
	@Test
	public void floor_getTaskList_should_return_empty_list() {
		assertTrue(floor.getTaskList().isEmpty());
	}
	
	@Test
	public void floor_setNumOfPassenger_to_7_should_return_7() {
		floor.setNumOfPassenger(7);
		assertEquals(7, floor.getNumOfPassenger());
	}
	
}
