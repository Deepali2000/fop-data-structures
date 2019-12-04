import java.util.*;
public class mapimp{

public static void main(String args[])
{
    HashMap<Integer,String> map= new HashMap<>();
   map.put(0,"Audi");
   map.put(1,"BMW");
   map.put(2,"Maruti");
   map.put(3,"Jaguar");
   System.out.println(map.get(3));
   System.out.println(map.containsKey(4));
   map.put(2,"asdfghjk");
   System.out.println(map.get(2));

}
}