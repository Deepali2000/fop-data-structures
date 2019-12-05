import java.util.*; 

 class Graphsm
 {

        HashMap<Integer,HashSet<Integer>> graph=new HashMap<>();
        boolean addVertex(int vertex)
        {     
            if(!graph.containsKey(vertex))
            {
                graph.put(vertex,new HashSet<>());//array list duplicate store hote hain toh we use
                return true;
            }
            return false;
        }
        void print()
        {
            System.out.println(graph.KeySet());
        }


 }
public class graphimp{

public static void  main(String[] args){
    Graphsm g= new Graphsm();
    g.addVertex(0);
    g.addVertex(1);
    g.addVertex(2);
    g.print();
}


}