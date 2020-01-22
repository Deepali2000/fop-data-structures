import java.util.*;
public class Frequent{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        String arr[]=new String [n];
        int [ ]arr1=new int[n];
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.next();
        }
        for (i=0;i<n;i++)
        {
            arr1[i]=0;
        }
        for(j=0;j<n;j++)
        {
            for(i=0;i<n;i++){
                if(arr[j]==arr[i]&&i!=j)
                arr1[j]++;
            }
        }
        int max=0;
        int count=0;
        for(i=0;i<n;i++){
            if(arr1[i]>max)
            {
                max=arr1[i];
                count=i;
            }
        }
        System.out.println(arr[count]);
}
}
