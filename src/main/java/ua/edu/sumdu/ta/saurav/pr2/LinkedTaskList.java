package ua.edu.sumdu.ta.saurav.pr2;

import java.util.Arrays;

import ua.edu.sumdu.ta.saurav.pr1.Task;

public class LinkedTaskList extends AbstractTaskList{

	Node head;
	int count;
	
	   static class Node { 
	        Task data; 
	        Node next; 
	        Node(Task t) 
	        { 
	            data = t; 
	            next = null; 
	        } 
	    } 
	 
	   /**
		 * @Saurav
		 * Method is used to add the object in LinkedList Array*/
	@Override
	public void add(Task task) {
		
		Node new_node = new Node(task); 
		new_node.next = null;
		if (this.head == null) { 
            this.head = new_node; 
        } 
		
		
		else { 
           
            Node last = this.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
   
            last.next = new_node; 
        } 
		
		count++;
	}

	/**
	 * @Saurav
	 * Method is used to remove the Task object from Linked List Array*/
	@Override
	public boolean remove(Task task) {
		boolean flag = false;
		 Node currNode = this.head, prev = null; 
		 if (currNode == null)
			 return flag;
		 
		 if (currNode != null && currNode.data == task) { 
	            this.head = currNode.next; 
	            count--;
	            flag= true;
	        } 
		 while (currNode != null && currNode.data != task) { 
	            prev = currNode; 
	            currNode = currNode.next; 
	        } 
		 if (currNode != null) { 
	            prev.next = currNode.next; 
	            count--;
	            flag = true;
	        } 
	   return flag;
	}

	@Override
	public int size() {

		return count;
		
	}

	/**
	 * @Saurav
	 * Method is used to get  the Task object in Linked List Array*/
	@Override
	public Task getTask(int index) {
		
		Node currNode = head;

		if (index > count || index < 0){
		    throw new IndexOutOfBoundsException();
		}

		if (index <= count && index >= 0) {
		    for (int i = 0; i < index; i++) {
		    	currNode = currNode.next;
		    }
		}
		return currNode.data;
	}
	
	@Override
	public String toString() {
		Node currNode = head;
		StringBuilder result = new StringBuilder();
		result.append("TaslListType =["+ currNode.data.gettitle());
		for (int i = 0; i < size()-1; i++) {
	    	currNode = currNode.next;
	    	if(currNode.data != null)
	    		result.append(","+currNode.data.gettitle());
	    	else
	    		break;
	    }
		result.append("]");
		return result.toString();
	}

	@Override
	public boolean equals(AbstractTaskList taskList) throws Exception {
		boolean flag= false;
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
			flag= false;
		
		return flag;
	}
	
}
