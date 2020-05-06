package ua.edu.sumdu.ta.saurav.pr2;

import java.util.Arrays;

import ua.edu.sumdu.ta.saurav.pr1.Task;

public class ArrayTaskList extends AbstractTaskList{

	Task taskArray[]= new Task[2];
	
	int count=0;
	
	/**
	 * @Saurav
	 * Method is used to add the Task object in Array*/
	@Override
	public void add(Task task) {
		if(count < taskArray.length)
		{
			taskArray[count]= task;
			count++;
		}
		else {
			Task newtaskArray[] = new Task[count+10];
			for(int i=0; i<taskArray.length; i++) {
				newtaskArray[i]= taskArray[i];
			}
			newtaskArray[count++]= task;
			taskArray = newtaskArray;
		}
		
	}

	/**
	 * @Saurav
	 * Method is used to remove the Task object from Array*/
	@Override
	public boolean remove(Task t) {
		int size = count;
        if (t == null) {
            for (int index = 0; index < size; index++)
                if (this.taskArray[index] == null) {
                    removeElement(index, size);
                    return true;
                }
        } else {
            for (int index = 0; index < size; index++)
                if (t.equals(this.taskArray[index])) {
                    removeElement(index, size);
                    return true;
                }
        }
        return false;
    }
	
	private void removeElement(int index, int size) {
		if(size > index) {
			for(int j= index; j<size-1; j++) {
				if(this.taskArray[j+1]!= null)
					taskArray[j]= taskArray[j+1];
			}
		}
		count--;
		taskArray[--size]= null; //GC work to reclaim memory
		
	}
	/**
	 * @Saurav
	 * Method is used to get the size of Array*/
	@Override
	public int size() {
		
		return count;
	}

	/**
	 * @Saurav
	 * Method is used to get the Task object based on the index number*/
	@Override
	public Task getTask(int index) throws InvalidIndexNumber {
		if(index < taskArray.length)
			return taskArray[index];
		else {
			
			String message = index + " number is greater than the size of Array";
			throw new InvalidIndexNumber(message);
		}
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("TaslListType =[");
		for (Task t : taskArray) {
			if(t != null)
				result.append(t.gettitle()+",");
			else
				break;
		}
		result.append("]");
		return result.toString();
	}

	@Override
	public boolean equals(AbstractTaskList taskList) throws Exception {
		boolean flag = false;
		if(taskList.size() == this.size()) {
		for(int i=0; i< this.size(); i++) {
			if(this.getTask(i).equals(taskList.getTask(i)))
				flag= true;
			else {
				flag= false;
			    break;
			}
		}
		}
		else
			flag = false;
		return flag;
	}
	
	
}
