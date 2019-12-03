import java.util.*;
class Middle
 {
	 Node head;
	 class Node
	 {
		 int data;
		 Node next;
		 Node(int d)
		 {
			 data=d;
			 next=null;
		 }
	 }
	 //inserting node
	 public void push(int new_data)
	 {
		 Node new_node=new Node(new_data);
		 new_node.next=head;
		 head=new_node;
	 }
	 void print_middle() {
		 Node slow=head;//slow pointer
		 Node fast=head;//fast pointer
		 if(head!=null)
		 {
			 while(fast!=null&&fast.next!=null)//if fast pointer is not null and fast.next is not null then iterate fast by 2 and slow by 1
			 {
				 fast=fast.next.next;
				 slow=slow.next;
			 }
			 System.out.println("The middle element is"+slow.data);
		 }
	 }
	 public void print()
	 {
		 Node temp=head;
		 while(temp!=null)
		 {
			 System.out.println(temp.data);
		temp=temp.next;	 
		 }
		
	 }
	 public static void main(String args[])
	 {
        Middle l1=new Middle();
		
			 l1.push(1);
			 l1.push(2);
			 l1.push(3);
			 l1.push(4);
			 l1.push(5);
			 l1.print();
			 l1.print_middle();
		 
	 }

}