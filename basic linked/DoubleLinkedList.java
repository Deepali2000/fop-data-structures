import java.util.*;
public class DoubleLinkedList {
	class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data=data;
		}
	}
	Node head;
	
	void insertTail(int new_data)
	{
		Node new_node=new Node(new_data);
		Node current=head;
		if(head==null)
		{
			head=new_node;
			return;
		}
		new_node.next=null;
		while(current.next!=null)
		{
			current=current.next;
			
		}
		current.next=new_node;
		new_node.prev=current;
		return;
	
		
	}
	void print()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	

	void reverse()
	{
		Node current=head;
		Node prev=null;
		Node next=null;
		while(current!=null)
		{
		 next=current.next;
		 current.next=prev;
			prev=current;
			current=next;
			
		}
		head=prev;
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		DoubleLinkedList d=new DoubleLinkedList();

	
		System.out.println("enter size of linked list");
		int n1=sc.nextInt();
		System.out.println("enter the linked list");
		for(int i=0;i<n1;i++)
		{
			d.insertTail(sc.nextInt());
		}

		d.reverse();
		d.print();

	}
}