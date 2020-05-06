package ua.edu.sumdu.ta.saurav.pr2;

import ua.edu.sumdu.ta.saurav.pr1.Task;

public abstract class AbstractTaskList {
	
	/**
	 * @Saurav
	 * method to add the task Object in the Array */
	public abstract void add(Task task);
	
	/**
	 * @Saurav
	 * method to remove the task Object in the Array */
	public abstract boolean remove(Task task);
	
	/**
	 * @Saurav
	 * method to number of tasks in the current list */
	public abstract int size() ;
	
	/**
	 * @throws InvalidIndexNumber 
	 * @Saurav
	 * get a task with such a number */
	public abstract Task getTask(int index) throws InvalidIndexNumber; 
	
	public abstract String toString();
	
	public abstract boolean equals(AbstractTaskList task) throws Exception;
	
	
}
