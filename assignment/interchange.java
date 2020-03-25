import java .util.*;
public class interchange{
               static  int n=4;
                static void interchange(int m[][]) 
                { 
                    int cols = n; 
                    for (int i = 0; i < n; i++) { 
                        int p = m[i][0]; 
                        m[i][0] = m[i][n - 1]; 
                        m[i][n - 1] = p; 
                    } 
                } 
                
               
    public static void main (String[] args) { 
     
      int m[][] = { { 8, 9,6,8  }, 
                   { 4, 7,4,3 },
                    { 7,6,2,1},
                   {3,4,3,4.0}
                   }; 
            interchange(m); 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) 
                System.out.print(m[i][j] + " "); 
                System.out.println(); 
        } 
        } 
    } 

