import java.util.*;

public class anagrammm {
public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
      System.out.print("str1:");
      String s1=sc.next();
      System.out.print("str2:");
      String s2=sc.next();
      String s11=s1.toLowerCase();
      String s22=s1.toLowerCase();
 if(s1.length()!=s2.length()) 
      System.out.print("no");
      else
    {
    if(s11.contains(s22)) 
    System.out.print("yes");
    else
     System.out.print("no");
    }
}
}