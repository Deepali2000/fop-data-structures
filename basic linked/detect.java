import java.util.*;

public class detect 
{
	static Node head;
	static class Node
	{
		int data ;Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	void detectAndRemove(Node node1)
	{
		if(node1==null||node1.next==null)
		
			return;
		Node slow=node1,fast=node1;
		slow=slow.next;
		fast=fast.next.next;
		while(fast!=null&& fast.next!=null)
		{
			if(slow==fast)
			{
				break;
			}
				slow=slow.next;
				fast=fast.next.next;
			}
		if(slow==fast)
		{
			slow=node1;
			while(slow.next!=fast.next)
			{
				slow=slow.next;
				fast=fast.next;
			}
			fast.next=null;
		}
		}
	void printlist(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
	  public static void main(String[] args) 
	    { 
	        detect list = new detect(); 
	        list.head = new Node(50); 
	        list.head.next = new Node(20); 
	        list.head.next.next = new Node(15); 
	        list.head.next.next.next = new Node(4); 
	        list.head.next.next.next.next = new Node(10); 
	  
	        // Creating a loop for testing 
	        head.next.next.next.next.next = head.next.next; 
	        list.detectAndRemove(head); 
	        System.out.println("Linked List after removing loop : "); 
	        list.printlist(head); 
	    } 
	}