import java.util.*; 
  
class Max
{ /* A binary tree node has data, pointer to left child  
and a pointer to right child */
static class node 
{ 
    int data; 
    node left; 
    node right; 
}; 
  
// Function to create a new node 
static node newNode(int data) 
{ 
    node n1 = new node(); 
    n1.data = data; 
    n1.left = null; 
    n1.right = null; 
  
    return (n1); 
} 
  
// Function to insert a new node in BST 
static node insert(node n1, int data) 
{ 
    /* 1. If the tree is empty, return a new,      
    single node */
    if (n1 == null) 
        return (newNode(data)); 
    else 
    { 
        /* 2. Otherwise, recur down the tree */
        if (data <= n1.data) 
            n1.left = insert(n1.left, data); 
        else
            n1.right = insert(n1.right, data); 
  
        /* return the (unchanged) node pointer */
        return n1; 
    } 
} 
  
// Function to find the node with maximum value 
// i.e. rightmost leaf node 
static int maxValue(node node) 
{  
    /* loop down to find the rightmost leaf */
    node current = node; 
    while (current.right != null)  
        current = current.right; 
      
    return (current.data); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    node root = null; 
    root = insert(root, 4); 
    insert(root, 2); 
    insert(root, 1); 
    insert(root, 3); 
    insert(root, 6); 
    insert(root, 5); 
  
    System.out.println("Maximum value in BST is " + maxValue(root)); 
} 
} 
  