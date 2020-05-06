package com.java.datastructure;

 class ListNode{
	
	private int data;
	public ListNode next;
	
	public ListNode(int data) {
		this.data= data;
	}
	
	public void setData(int data) {
		this.data=data;
	}
	public int getData() {
		return data;
	}
	public void setNext(ListNode next) {
		this.next=next;
	}
	public ListNode getNext() {
		return this.next;
	}
	
}
public class linkedListProblems {
	public void displayList(ListNode head) {
		ListNode currNode = head;
		if(currNode == null)
			System.out.println("No data present");
			
		while(currNode.next!= null) {
			System.out.println(currNode.getData());
			currNode= currNode.next;
		}
		System.out.println(currNode.getData());
	}
	
	public int lengthOfList(ListNode head) {
		ListNode currNode = head;
		int count =0;
		if(currNode == null)
			return count;
		while(currNode.next!= null) {
			count++;
			currNode= currNode.next;
		}
		return ++count;
	}

	public static void main(String[] args) {
		ListNode head= new  ListNode(2);
		head.setNext(new ListNode(7));
		head.next.setNext(new ListNode(3));
		head.next.next.setNext(new ListNode(5));
		head.next.next.next.setNext(new ListNode(4));
		head.next.next.next.next.setNext(new ListNode(8));
		
		linkedListProblems obj = new linkedListProblems();
		obj.displayList(head);
		System.out.println(obj.lengthOfList(head));

	}

}
