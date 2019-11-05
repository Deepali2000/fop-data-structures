
//import deleteStart.Node;

public class RemoveDuplicate {
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
    public void removeDuplicate() {  
        //Node current will point to head  
        Node current = head, index = null, temp = null;  
 
        if(head == null) {  
            return;  
        }  
        else {  
            while(current != null){  
                //Node temp will point to previous node to index.  
                temp = current;  
                //Index will point to node next to current  
                index = current.next;  
 
                while(index != null) {  
                    //If current node's data is equal to index node's data  
                    if(current.data == index.data) {  
                        //Here, index node is pointing to the node which is duplicate of current node  
                        //Skips the duplicate node by pointing to next node  
                        temp.next = index.next;  
                    }  
                    else {  
                        //Temp will point to previous node of index.  
                        temp = index;  
                    }  
                    index = index.next;  
                }  
                current = current.next;  
            }  
        }  
    }  
 
    //display() will display all the nodes present in the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
 
    public static void main(String[] args) {  
 
        RemoveDuplicate sList = new RemoveDuplicate();  
 
        //Adds data to the list  
        sList.addNode(1);  
        sList.addNode(2);  
        sList.addNode(3);  
        sList.addNode(2);  
        sList.addNode(2);  
        sList.addNode(4);  
        sList.addNode(1);  
 
        System.out.println("Originals list: ");  
        sList.display();  
 
        //Removes duplicate nodes  
        sList.removeDuplicate();  
 
        System.out.println("List after removing duplicates: ");  
        sList.display();  
    }  

}


