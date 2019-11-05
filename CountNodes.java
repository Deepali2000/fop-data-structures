

//import deleteStart.Node;

public class CountNodes {
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
    public int countNodes() {    
        int count = 0;    
        //Node current will point to head    
        Node current = head;    
           
        while(current != null) {    
            //Increment the count by 1 for each node    
            count++;    
            current = current.next;    
        }    
        return count;    
    }    