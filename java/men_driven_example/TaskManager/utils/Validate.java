package utils;

import java.util.HashMap;

import com.core.Status;
import com.core.Task;

import custom_exception.TaskException;

public class Validate {

	public static Status validateStatus(String next) {
		
		return Status.valueOf(next);
	}

	public static int validateTaskId(int i, HashMap<Integer, Task> map)throws TaskException {
		// TODO Auto-generated method stub
		if(!map.containsKey(i))
			 throw new TaskException("ID NOT FOUND");
		
		return i;
	}

}
