package tester;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Scanner;

import com.core.Status;
import com.core.Task;

import utils.PenUtils;
import utils.TaskUtils;
import utils.Validate;

public class TaskManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Task> map =TaskUtils.sampleData();
		
		try(Scanner scanner = new Scanner(System.in)) {
			
			while(true) {
				System.out.println("1.Add New Task");
				System.out.println("2.Delete a Task");
				System.out.println("3.Update task Status");
				System.out.println("4.Display all pending task");
				System.out.println("5.Display all pending task for today");
				System.out.println("6.Display all task sorted by date");
				System.out.println("7.Exit");
				
				System.out.println("Enter choice:");
				
				try {
					switch (scanner.nextInt()) {
					
					case 1:
						
						//String name, String desc, LocalDate taskDate	
						System.out.println("Enter details of task(name, desc,taskDate");
						
						Task t1 = new Task(scanner.next(), scanner.next(), LocalDate.parse(scanner.next()));
						map.put(t1.getTaskID(),t1);
						System.out.println("Task Added");
						break;
						
                    case 2:
                    	System.out.println("Enter the id of task:");
                    	TaskUtils.deleteTask(scanner.nextInt(),map);
						System.out.println("Task Deleted.!");
						break;
					
                    case 3:
                    	System.out.println("Enter id of Task whose status you want to update");
                    	int id = Validate.validateTaskId(scanner.nextInt(),map);
                    	
                    	System.out.println("UPDATE STATUS:PENDING/INPROGRESS/COMPLETED");
                    	Status sc = Validate.validateStatus(scanner.next());
                    	TaskUtils.updateTask(sc,id,map);
                    	System.out.println("Status Updated");
						
						break;
						
                    case 4:
                    	Status status = Status.PENDING;
                    	map.values()
                    	.stream()
                    	.filter(p->p.getSt()==status)
                    	.forEach(p->System.out.println(p));
						break;
					
                    case 5:
                    	Status status2 =Status.PENDING;
                    	LocalDate d = LocalDate.parse("2023-10-24");
                    	map.values()
                    	.stream()
                    	 .filter(t->{
                    		 if(t.getTaskDate().compareTo(d)==0)
                    			 return true;
                    		 return false;
                    	 })
                    	.filter(t->t.getSt() == status2)
                    	.forEach(t->System.out.println(t));
						
						break;
						
                    case 6:
                    	map.values()
                    	.stream()
                    	.sorted((task1,task2) ->task1.getTaskDate().compareTo(task2.getTaskDate()))
                    	.forEach(t-> System.out.println(t));
						break;

                    case 7:
						System.exit(0);
						break;
		

					default:
						System.out.println("Invalid choice");
					}
					
				}
				catch (Exception e) {
					
					scanner.nextLine();
					
				}
			}
		} 

	}

}
