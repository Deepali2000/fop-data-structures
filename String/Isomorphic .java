import java.util.*;
public class Isomorphic{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		int arr[]=new int[26];
		int count=0;
		for(int i=0;i<26;i++){
			arr[i]=27;
		}
		for(int i=0;i<c1.length;i++){
			int index=c1[i]-'a';
			int value=c1[i]-c2[i];
			if(arr[index]==27){
				count++;
				arr[index]=value;
			}
			else{
				if(arr[index]==value){
					count++;
					continue;
				}
				else{
					break;
				}
			}
		}
		if(count==c1.length){
			System.out.print("yes");
		}
		else{
			System.out.print("no");
		}


		}
	}