

//import deleteStart.Node;

public class DeleteEnd {
    class Node{  
        int data;  
        Node next;  
 
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
    public Node head = null;  
    public Node tail = null;  
    public void addNode(int data) {  
        Node newNode = new Node(data);  
          if(head == null) {  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            tail.next = newNode;  
            tail = newNode;  
        }  
    }  
    public void deleteFromEnd() {  
             if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {  
            //Checks whether the list contains only one element  
            if(head != tail ) {  
                Node current = head;  
                //Loop through the list till the second last element such that current.next is pointing to tail  
                while(current.next != tail) {  
                    current = current.next;  
                }  
                //Second last element will become new tail of the list  
                tail = current;  
                tail.next = null;  
            }  
            //If the list contains only one element  
            //Then it will remove it and both head and tail will point to null  
            else {  
                head = tail = null;  
            }  
        }  
    }  
 
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
 
    public static void main(String[] args) {  
 
        DeleteEnd sList = new DeleteEnd();  
 
        //Adds data to the list  
        sList.addNode(1);  
        sList.addNode(2);  
        sList.addNode(3);  
        sList.addNode(4);  
 
        //Printing original list  
        System.out.println("Original List: ");  
        sList.display();  
 
        while(sList.head != null) {  
            sList.deleteFromEnd();  
            System.out.println("Updated List: ");  
            sList.display();  
        }  
    }  
}  