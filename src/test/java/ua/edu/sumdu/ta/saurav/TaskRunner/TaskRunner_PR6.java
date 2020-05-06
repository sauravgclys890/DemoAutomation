package ua.edu.sumdu.ta.saurav.TaskRunner;

import ua.edu.sumdu.ta.saurav.pr1.Task;
import ua.edu.sumdu.ta.saurav.pr2.AbstractTaskList;
import ua.edu.sumdu.ta.saurav.pr2.ArrayTaskList;
import ua.edu.sumdu.ta.saurav.pr2.LinkedTaskList;

public class TaskRunner_PR6 {

	public static void main(String[] args) throws Exception {
		
		Task t1= new Task("Task1", 200, 800, 50);
		
		Task t2= new Task("Task2", 200, 800, 50);
		
		Task t3= new Task("Task3", 200, 800, 50);
		
		AbstractTaskList list1= new ArrayTaskList();

        
		list1.add(t1);
		list1.add(t2);
		list1.add(t3);
		
		System.out.println(list1.size());
		
        Task h1= new Task("Task1", 200, 800, 50);
		
        Task h2= new Task("Task2", 200, 800, 50);
		
        Task h3= new Task("Task3", 200, 800, 50);
		
		
		AbstractTaskList list2= new ArrayTaskList();


		list2.add(h1);
		list2.add(h2);
		list2.add(h3);
		
		System.out.println(list1.equals(list2));
		
		LinkedTaskList linkedList1 = new LinkedTaskList();

		linkedList1.add(t1);
		linkedList1.add(t2);
		linkedList1.add(t3);
		
		LinkedTaskList linkedList2 = new LinkedTaskList();
		
		linkedList2.add(h1);
		linkedList2.add(h2);
		linkedList2.add(h3);
		
		System.out.println(linkedList1.equals(linkedList2));

	}

}
