package ua.edu.sumdu.ta.saurav.TaskRunner;



import ua.edu.sumdu.ta.saurav.pr1.Task;
import ua.edu.sumdu.ta.saurav.pr2.AbstractTaskList;
import ua.edu.sumdu.ta.saurav.pr2.ArrayTaskList;
import ua.edu.sumdu.ta.saurav.pr2.InvalidIndexNumber;
import ua.edu.sumdu.ta.saurav.pr2.LinkedTaskList;

public class TaskRunner_PR1 {

	public static void main(String[] args) throws InvalidIndexNumber   {
		
Task t1= new Task("Task1", 200, 800, 50);
		
Task t2= new Task("Task2", 200, 800, 50);

Task t3= new Task("Task3", 200, 800, 50);

Task t4= new Task("Task4", 200, 800, 50);

Task t5= new Task("Task5", 200, 800, 50);

Task t6= new Task("Task6", 200, 800, 50);

Task t7= new Task("Task7", 200, 800, 50);

Task t8= new Task("Task8", 200, 800, 50);

Task t9= new Task("Task9", 200, 800, 50);

Task t10= new Task("Task10", 200, 800, 50);

Task t11= new Task("Task11", 200, 800, 50);

Task t12= new Task("Task12", 200, 800, 50);

		
AbstractTaskList list= new ArrayTaskList();


list.add(t1);
list.add(t2);
list.add(t3);
list.add(t4);
list.add(t5);
list.add(t6);
list.add(t7);
list.add(t8);
list.add(t9);
list.add(t10);
list.add(t11);
list.add(t12);

System.out.println(list.size());

System.out.println(list.remove(t3));
System.out.println(list.size());

Task returnTask1 = list.getTask(2);

System.out.println(returnTask1.gettitle());

Task returnTask2 = list.getTask(3);

System.out.println(returnTask2.gettitle());

System.out.println(list.toString());

LinkedTaskList linkedList = new LinkedTaskList();

linkedList.add(t1);
linkedList.add(t2);
linkedList.add(t3);
linkedList.add(t4);

System.out.println(linkedList.toString());

Task checkEquals1= new Task("Task1", 200, 800, 50);

Task checkEquals2= new Task("Task1", 200, 800, 50);

System.out.println(checkEquals1.equals(checkEquals2));

Task oneTimeTask1= new Task("OneTimeTask1", 100);

Task oneTimeTask2= new Task("OneTimeTask1", 100);

System.out.println(oneTimeTask1.equals(oneTimeTask2));

	}

}
