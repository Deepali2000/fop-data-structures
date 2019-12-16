
import java.util.*;

public class rotate {
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	Node head;
	void insert(int new_data)
	{
		Node new_node=new Node(new_data);
		Node current=head;
		if(head==null)
		{
			head=new_node;
			return;
		}
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=new_node;
		return;
	}
	void rotate(int k)
	{
		Node current=head;
		int count=1;
		while(count<k && current!=null)
		{
			current=current.next;
			count++;
		}
		if(current==null)
		{
			return;
		}
		Node kth=current;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=head;
		head=kth.next;
		kth.next=null;
		
	}
	public void display()
	{
		Node temp_node=head;
		while(temp_node!=null)
		{
			System.out.println(temp_node.data+" ");
			temp_node=temp_node.next;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		rotate r=new rotate();
	System.out.println("Enter number of elements");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		r.insert(sc.nextInt());
	}

		System.out.println("enter from where you want to rotate");
		r.rotate(sc.nextInt());
		r.display();
	}

}