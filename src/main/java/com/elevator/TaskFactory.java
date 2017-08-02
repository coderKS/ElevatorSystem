package com.elevator;

import com.elevator.task.*;

public class TaskFactory {

	public Task getTask(int from, int to) {
		if (from < to) {
			return new UpTask(from, to);
		} else {
			return new DownTask(from, to);
		}
	}

}
