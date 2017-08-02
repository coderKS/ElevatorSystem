package com.elevator;

import static org.junit.Assert.*;

import org.junit.*;

import com.elevator.task.Task;

public class TaskFactoryTest {

	private TaskFactory taskFactory;
	
	@Before
	public void setUp() {
		taskFactory = new TaskFactory();
	}
	
	@Test
	public void factory_should_return_a_task_if_the_task_is_from_lower_floor_to_higher_floor() {
		Task task = taskFactory.getTask(2,5);
		
		assertNotNull(task);
	}
	
	@Test
	public void factory_should_return_uptask_if_the_task_is_from_lower_floor_to_higher_floor() {
		Task task = taskFactory.getTask(2,5);
		
		String returnClassName = task.getClass().getName().substring(task.getClass().getName().lastIndexOf(".")+1);
		assertEquals("UpTask", returnClassName);
	}
	
	@Test
	public void factory_should_return_downtask_if_the_task_is_from_higher_floor_to_lower_floor() {
		Task task = taskFactory.getTask(5,2);
		
		String returnClassName = task.getClass().getName().substring(task.getClass().getName().lastIndexOf(".")+1);
		assertEquals("DownTask", returnClassName);
	}
}
