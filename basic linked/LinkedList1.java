import java.util.*;
class Node{
    int data;
    Node next=null;
    Node(int data){
        this.data=data;
    }
}
public class LinkedList1
{
    static Node insertathead(Node head,int data)
         {  if(head==null)
             {
                 return new Node(data);
             }
            Node temp=new Node(data);
            temp.next=head;
            head=temp;
            return head;
         }
    static Node insertatend(Node head,int data)
     {    if(head==null)
       {
           return new Node(data);
       }
       Node temp=new Node(data);
       Node ptr=head;
       while(ptr.next!=null)
       {
       ptr=ptr.next;
       }
       ptr.next=temp;
       return head;
   }

    public static void main(String[] args)
    {
        Node head=new Node(5);
        Node Second=new Node(6);
        Node Third =new Node(7);
        Node fourth=new Node(8);
        head.next=Second;
        head.next.next=Third;//second.next=third;
        head.next.next.next=fourth;
        Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        head=insertathead(head,4);
        temp=head;
        while(temp!=null)
        {
        System.out.println(temp.data+" ");
        temp=temp.next;
        }
        head=insertatend(head, 9);
        temp=head;
        while(temp!=null)
        {
        System.out.println(temp.data+" ");
        temp=temp.next;
        }

    }
}