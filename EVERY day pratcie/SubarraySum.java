import java.util.*;
class SubarraySum  
{ 
    int subArraySum(int arr[], int n, int sum)  
    { 
        int sum1, i, j; 
    // Pick a starting point 
        for (i = 0; i < n; i++)  
        { 
            sum1 = arr[i]; 
    // try all subarrays starting with 'i' 
            for (j = i + 1; j <= n; j++)  
            { 
                if (sum1 == sum)  
                { 
                    int p = j - 1; 
                    System.out.println("Sum found between indexes " + i 
                            + " and " + p); 
                    return 1; 
                } 
                if (sum1 > sum || j == n) 
                    break; 
               sum1 =sum1 + arr[j]; 
            } 
        } 
        System.out.println("No subarray found"); 
        return 0; 
    } 
    public static void main(String[] args)  
    { 
        SubarraySum arraysum = new SubarraySum(); 
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
        int n = arr.length; 
        int sum = 23; 
        arraysum.subArraySum(arr, n, sum); 
    } 
} 