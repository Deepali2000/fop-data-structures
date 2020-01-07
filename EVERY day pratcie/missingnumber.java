<<<<<<< HEAD
import java.util.*;
class missingnumber
{ 
   // a represents the array 
    // n : Number of elements in array a 
    static int getMissingNo(int p[], int q)  
    { 
        int total = 1; 
        for (int i = 2; i <= (q + 1); i++) 
        { 
            total += i; 
            total -= p[i - 2]; 
        } 
        return total; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int[] arr = { 1, 2, 3, 5 }; 
        System.out.println(getMissingNo(arr, arr.length)); 
    } 
=======
import java.util.*;
class missingnumber
{ 
   // a represents the array 
    // n : Number of elements in array a 
    static int getMissingNo(int p[], int q)  
    { 
        int total = 1; 
        for (int i = 2; i <= (q + 1); i++) 
        { 
            total += i; 
            total -= p[i - 2]; 
        } 
        return total; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int[] arr = { 1, 2, 3, 5 }; 
        System.out.println(getMissingNo(arr, arr.length)); 
    } 
>>>>>>> c1cdf7413abff4047bb6a94509a98fb1846eed32
} 