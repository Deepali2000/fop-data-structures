import java.util.*;
public class mirrorTree {
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	static Node root;
	boolean isSymmetric(Node root)
	{
		return(isMirror(root,root));
	}
	boolean isMirror(Node root1,Node root2)
	{
		if(root1==null&&root2==null)
		{
			return true;
		}
		if(root1!=null&&root2!=null&root1.data==root2.data)
		{
			return(isMirror(root1.left,root2.right))&&(isMirror(root1.right,root2.left));
		}
		return false;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		mirrorTree m=new mirrorTree();
	 
        m.root = new Node(1); 
        m.root.left = new Node(2); 
        m.root.right = new Node(2); 
        m.root.left.left = new Node(3); 
        m.root.left.right = new Node(4); 
       m.root.right.left = new Node(4); 
        m.root.right.right = new Node(3); 
      System.out.println(m.isSymmetric(m.root));  
	}

}