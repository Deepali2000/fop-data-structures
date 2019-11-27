import java.util.*;
import java.util.PriorityQueue;

class Priority1{
    int arr[]=new int[10];
    int nItems=0;
    public int size()
    {
         return nItems;
    }
    public boolean isEmpty()
    {
        //   if(nItems==0) return true;
        // return false;
        return nItems==0;
    }
    public int getPeek()
    {
       return arr[nItems-1];
    }
    public int remove()
    {  
    //    int val=arr[nItems];
    //    nItems--;
    //    return val;
           return arr[--nItems];
     }
     public void insert(int val)
     {
         if(nItems==0)
         {
             arr[0]=val;
             nItems++;
             return;
         }
        int i;
      for( i=nItems-1;i>=0;i--)
      {
           if(arr[i]>val) //max-min
           {
             arr[i+1]=arr[i];
           }
           else
           {         
             
               break;
           }
      }
      arr[i+1]=val;
      nItems++;

    }
    public void print()
    {
        for(int i=0;i<nItems;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

     }
}

public class SortArrayqueue{
    public static void main(String[] args)
    {
       // PriorityQueue<Integer> pq =new PriorityQueue<Integer>();
    Priority1  p =new Priority1();
    p.insert(5);
    p.insert(2);
    p.insert(7);
    p.insert(6);
    p.print();
    System.out.println(a.size());
    System.out.println(a.getPeek());
    System.out.println(a.remove());
    p.print();
   }
}




