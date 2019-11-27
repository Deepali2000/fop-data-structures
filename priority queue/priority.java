import java.util.*;
import java.util.PriorityQueue;

public class priority{

        public static void main(String[] args){
        PriorityQueue<Integer> pq =new PriorityQueue<Integer>();
            pq.add(2);
            pq.add(1);
            pq.add(4);
            pq.add(9);
            pq.add(6);
            pq.add(3);
            pq.add(5);
            System.out.println(pq.size());
            System.out.println(pq.isEmpty());
            System.out.println(pq.poll());  // by default min value ....
            System.out.println(pq.size()); //remove the elemnet afterr poll
            System.out.println(pq.peek()); // isme remove nhi hotaa
            System.out.println(pq.size());
             
            System.out.print(pq.poll());  
            System.out.print(pq.poll());  
            System.out.print(pq.poll());  
            System.out.print(pq.poll());  
            System.out.print(pq.poll());  
            System.out.println(pq.poll());  
            System.out.println(pq.isEmpty());  


     }

}