import java.util.*;
public class PairSum {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	PairSum p=new PairSum();
	System.out.println("Enter size of First Array");
	int n=sc.nextInt();
	System.out.println("Enter size of Second Array");
	int n1=sc.nextInt();
	System.out.println("Enter the required sum");
	int sum=sc.nextInt();
	int arr[]=new int[n];
	int arr1[]=new int[n1];
	System.out.println("enter first array");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	System.out.println("enter Second array");
	for(int i=0;i<n1;i++)
	{
		arr1[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n1;j++)
		{
			if(arr[i]+arr1[j]==sum)
			{
				System.out.print(arr[i]+","+arr1[j]);
			}
		}
		System.out.println();
	}
	
}
}