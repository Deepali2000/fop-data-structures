import java.util.*;
public class Pallindrome
{
 public static boolean Pallindorme(String str){
int i=0;
int j=str.length()-1;
while(i<j)
{
    if(str.charAt(i)!=str.charAt(j))
    {
    return false;
    }
    i++;
    j--;
}
return true;
}
public static void main(String[] args)
{
    Scanner sc=new Scanner (System.in);
    System.out.println("ENter the string");
    String str=sc.next();
    if(Pallindorme(str))
    {
        System.out.println("Number is pallindrom");

    }
    else{
        System.out.println("Number is not pallindrom");
    }
}
}