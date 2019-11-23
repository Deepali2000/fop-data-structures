import java.util.*;
class Hash { 
   static boolean isSubset(int arr1[],int arr2[], int k, int n) 
    { 
        int i = 0; 
        int j = 0; 
        for (i = 0; i < n; i++) 
        { 
            for (j = 0; j < k; j++) 
                if(arr2[i] == arr1[j]) 
                    break; 
    
            if (j == k) 
                return false; 
        } 
        return true; 
    } 
    
    public static void main(String args[]) 
    { 
        int arr1[] = {11, 1, 13, 21, 3, 7}; 
        int arr2[] = {11, 3, 7, 1}; 
          
        int k = arr1.length; 
        int n = arr2.length; 
      
        if(isSubset(arr1, arr2, m, n)) 
            System.out.print("arr2[] is "+ "subset of arr1[] "); 
        else
            System.out.print("arr2[] is "+ "not a subset of arr1[]");  
    } 
} 
