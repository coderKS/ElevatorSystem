package com.elevator;

import static org.junit.Assert.*;

import java.util.LinkedList;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class FloorTest {
	private Floor floor;
	private Task task;

	@Before
	public void setup() {
		task = mock(Task.class);
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
	
	@Test
	public void floor_add_task_should_get_taskList_size_of_1() {
		floor.addTask(task);
		assertEquals(1, floor.getTaskList().size());
	}
	
	@Test
	public void floor_add_task_first_then_remove_should_get_emptytaskList() {
		floor.addTask(task);
		floor.removeTask(task);
		assertTrue(floor.getTaskList().isEmpty());
	}
}
