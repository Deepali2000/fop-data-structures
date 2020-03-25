import java .util.*;
public class Firstlast{
               static  int n=2;
                static void interchangeFirstLast(int m[][]) 
                { 
                    int cols = n; 
                    for (int i = 0; i < n; i++) { 
                        int p = m[i][0]; 
                        m[i][0] = m[i][n - 1]; 
                        m[i][n - 1] = p; 
                    } 
                } 
                
               
    public static void main (String[] args) { 
     
      int m[][] = { { 8, 9  }, 
                { 4, 7 }, 
                { 3, 2 }, 
                { 9, 9 } }; 

        interchangeFirstLast(m); 
        
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) 
                System.out.print(m[i][j] + " "); 
                System.out.println(); 
        } 
        } 
    } 

