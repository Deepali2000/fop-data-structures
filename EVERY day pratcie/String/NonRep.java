
import java.util.*;
public class NonRep 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int flag=0;
		for(int i=0;i<s.length();i++)
		{	flag=1;
			for(int j=0;j<s.length();j++)
			{
				if(i!=j&& s.charAt(i)==s.charAt(j))
				{
					flag=0;
					break;
					
				}
			}
			if(flag==1)
			{
				System.out.println(s.charAt(i));
			break;
			}
		}
			if(flag==0)
			{
				System.out.println("No char");
			}
	}

}