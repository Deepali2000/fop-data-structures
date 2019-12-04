
import java .util.*;
class graph
{  
    int v;// no of nodes
//    LinkedList<Integer> l1=new LinkedList[v];
     LinkedList<Integer> adjListArray[];
     graph (int v)
       {
            this.v=v;
            adjListArray=new LinkedList[v];
            for(int i=0;i<v;i++)
            {
                adjListArray[i]=new LinkedList<>();
            }
        }
        void addEdge(int u,int v)
        {
            adjListArray[u].add(v);
            adjListArray[v].add(u);//because undirectional graph
        }
        void print()
        {
            for(int i=0;i<v;i++)
            {
                System.out.println("Adjacency List of Vertex: "+i);
                for(Integer n:adjListArray[i])
                {
                    System.out.print(n+" ");                
                }
                System.out.println();
            }
        }
}

public class Graph1{

    public static void main(String args[]){
        graph g=new graph(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(3,4);

        g.addEdge(4,2);
        g.print();

    }

}