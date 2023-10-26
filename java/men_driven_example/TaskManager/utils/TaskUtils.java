package utils;

import java.time.LocalDate;
import java.util.HashMap;

import com.core.Status;
import com.core.Task;

import custom_exception.TaskException;

public class TaskUtils {

	public static HashMap<Integer, Task> sampleData() {
		// TODO Auto-generated method stub
		HashMap<Integer, Task> map = new HashMap<Integer, Task>();
//String name, String desc, LocalDate taskDate		
		map.put(1, new Task("abc", "For lab exam", LocalDate.parse("2023-10-10")));
		map.put(2, new Task("pqr", "For CCEE exam", LocalDate.parse("2023-05-12")));
		map.put(3, new Task("XYZ", "For Placement exam", LocalDate.parse("2021-10-01")));
		map.put(4, new Task("lmn", "For viva", LocalDate.parse("2022-02-10")));
	
		return map;
	}

	public static void deleteTask(int id,HashMap<Integer, Task> map) throws TaskException{
		// TODO Auto-generated method stub
		if(map.remove(id) == null)
			throw new TaskException("Task Not Found");
		
	    System.out.println("Task Deleted");
		
		
		
	}

	public static void updateTask(Status sc, int id, HashMap<Integer, Task> map) {
		
		Task t1 = map.get(id);
		t1.setSt(sc);	
		
	}
	
	

}
