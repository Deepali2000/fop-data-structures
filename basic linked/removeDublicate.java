package st;
import java.util.*;
public class removeDublicate 
{
	static class Node
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
	void insert(int data)
	{
		Node tem=new Node(data);
		if(head==null)
		{
			head=tem;
			return;
		}
		Node cur=head;
		while(cur.next!=null)
		{
			cur=cur.next;
		}
		cur.next=tem;
	}
	void remove()
	{
		Node cur=head;
		while(cur!=null)
		{
			Node cur1=cur;
			while(cur1.next!=null)
			{
				if(cur.data==cur1.next.data)
				{
					cur1.next=cur1.next.next;
				}
				else
				{
					cur1=cur1.next;
				}
			}
			cur=cur.next;
		}
	}
	void print()
	{
		Node cur=head;
		while(cur!=null)
		{
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
	}
	public static void main(String args[])
	{
		removeDublicate d=new removeDublicate();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			d.insert(sc.nextInt());
		}
		d.remove();
		d.print();
	}
}
