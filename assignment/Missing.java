import java.util.*;
class Missing
{  
     static int getMissingNo(int p[], int q)  
    { 
        int total = 1; 
        int i;
        for (i = 2; i <= (q + 1); i++) 
        { 
            total += i; 
            total -= p[i - 2]; 
        } 
        return total; 
    } 
    public static void main(String[] args) 
    { 
        int[] arr = { 1, 2, 3, 5 }; 
        System.out.println(getMissingNo(arr, arr.length)); 
    } 

} 
