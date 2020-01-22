import java.util.*;
public class RotateString {

public static void main(String[] args) {
// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.print("str1:");
       String s1=sc.next();
       System.out.print("str1:");
       String s2=sc.next();
         String ans="";
         String ans2="";
         int l=s1.length();
         if(s1.length()!=s2.length())System.out.print("no");
         ans=ans+s1.substring(2)+s1.substring(0,2);
         ans2=ans2+s1.substring(l-2,l)+s1.substring(0,l-2);
         if(s2.equals(ans)|| s2.equals(ans2)) System.out.print("yes");
         else System.out.print("no");
         
       
}

}
