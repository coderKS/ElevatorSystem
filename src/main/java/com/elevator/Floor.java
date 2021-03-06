package com.elevator;

import java.util.List;

import com.elevator.task.Task;

public class Floor {
	private int id;
	private int NumOfPassenger;
	private List<Task> taskList;

	public Floor(int id, int numOfPassenger, List<Task> tasklist) {
		this.id = id;
		this.NumOfPassenger = numOfPassenger;
		this.taskList = tasklist;
	}

	public int getId() {
		return id;
	}

	public int getNumOfPassenger() {
		return NumOfPassenger;
	}

	public void setNumOfPassenger(int numOfPassenger) {
		NumOfPassenger = numOfPassenger;
	}

	public List<Task> getTaskList() {
		return taskList;
	}

	public void addTask(Task task) {
		this.taskList.add(task);
	}
	
	public void removeTask(Task task) {
		this.taskList.remove(task);
	}
}
