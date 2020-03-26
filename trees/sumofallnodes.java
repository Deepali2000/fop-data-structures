import java.util.*;
    class Node
           {
                int data;
                Node left;
                Node right;
                Node(int data)
                {
                this.data=data;
                left=null;
                right=null;
                }
            }
                class BinaryTree{
                Node root;
                BinaryTree()
                {
                    root=null;
                }
                BinaryTree(int data)
                {
                    this.root=new Node(data);
                }
            int TreeSum(Node root)//to calculate the sum of all nodes in a tree
            {
                if(root==null)
                 return 0;
                return root.data+TreeSum(root.left)+TreeSum(root.right);
            }
        }
            public class sumofallnodes {
                public static void main(String[] args) {
                // TODO Auto-generated method stub
                BinaryTree bt=new BinaryTree(2);//BT with root node 2
                bt.root.left=new Node(3);//linking explicitly
                bt.root.right=new Node(5);
                bt.root.left.right=new Node(9);
                bt.root.right.left=new Node(7);//Required Tree Created
                
                System.out.println("Sum of all Nodes: "+bt.TreeSum(bt.root));
                }
            }
        