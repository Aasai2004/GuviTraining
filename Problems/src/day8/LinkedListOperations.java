package day8;
import java.util.*;
public class LinkedListOperations {
	Node head;
	public void addNode(int val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
		}
		else {
//			head.next=newNode;
			Node curr=head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=newNode;
		}
	}
	public void traverse() {
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+"->");
			current = current.next;
		}
		System.out.print("null");
	}
	public void insertAtBeginning(int val) {
		Node newNode=new Node(val);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
    public void deleteBeginnig() {
    	if(head == null) {
    		System.out.println("List is Empty..");
    	}
    	else {
    		head=head.next;
    	}
    }
    public void deleteAtEnd() {
    	if(head == null) {
    		System.out.println("List is Empty");
    	}
    	else {
    		Node curr = head;
    		while(curr.next.next!=null) {
    			curr = curr.next;
    		}
    		curr.next = null;
    	}
    }
	public static void main(String[] str) {
		LinkedListOperations list=new LinkedListOperations();
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		list.addNode(50);
		list.insertAtBeginning(5);
		list.deleteBeginnig();
		list.deleteAtEnd();
		list.traverse();
		

	}

}
class Node{
	int data;
	Node next;
    Node(int d){
	    data=d;
	    next=null;
    }
    
}