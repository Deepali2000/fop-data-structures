import java.util.Scanner;
class Node
{
	int key;
	Node left,right;
	
	public Node(int data)
	{
		key=data;
		left=right=null;;
	}
}
public class isBST {
	static Node root;
	 isBST()
	 {
		root=null; 
	 }
	 isBST(int data)
	 {
		 Node root=new Node(data);
		 
	 }
	 public static void insert(int key)
	 {
		 root=insertion_BST(root,key);
	 }
	public static Node insertion_BST(Node root,int key)
	{
		
		if(root==null)
		{
			root=new Node(key);
			return root;
		}
		else if(root.key>key)
		{
			root.left=insertion_BST(root.left,key);
		}
		else if(root.key<key)
		{
			root.right=insertion_BST(root.right,key);
		}
		return root;
	}
	
	public static boolean isBST(Node root, Node left, Node right){
        if (root==null)
            return true;
        if (left!=null && root.key<=left.key)
            return false;
        if (right!=null && root.key>=right.key)
            return false;
        
        return isBST(root.left, left, root) && isBST(root.right, root, right);
    }

	public static void main(String[] args) {
		isBST b=new isBST();
		Scanner s=new Scanner (System.in);
		
			System.out.println("enter number of elements");
		int n=s.nextInt();
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			int items=s.nextInt();
			b.insert(items);
		}
		
		 if (isBST(root, null, null)==true)
	            System.out.println("YES, a BST");
	        else
	            System.out.println("NO, Not a BST");
		
	}

}