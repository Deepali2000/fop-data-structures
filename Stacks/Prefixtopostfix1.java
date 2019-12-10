import java.util.*; 
import java.util.Stack;
  
class Prefixtopostfix1 
{ 
  

        static boolean isOperator(char x)  
        { 
            switch (x)  
            { 
                case '+': 
                case '-': 
                case '/': 
                case '*': 
                return true; 
            } 
            return false; 
        } 
  static String preToPost(String pre_exp) 
    { 
    
        Stack<String> st= new Stack<String>(); 

        int length = pre_exp.length(); 




        .
        for (int i = length - 1; i >= 0; i--)  
        { 
        if (isOperator(pre_exp.charAt(i)))  
            { 
                String op1 = st.peek(); 
                st.pop(); 
                String op2 = st.peek(); 
                st.pop(); 
                
                String temp = op1 + op2 + pre_exp.charAt(i); 
            // String temp1 = op1 +pre_exp.charAt(i)+ op2 ;
    
            st.push(temp); 
                //st.push(temp1);
        } 
            else
            { 
                
                st.push( pre_exp.charAt(i)+""); 
            } 
        } 
            return st.peek(); 
    } 
    
    public static void main(String args[])  
    { 
        String pre_exp = "*-A/BC-/AKL"; 
        System.out.println("Postfix : " + preToPost(pre_exp)); 
    } 
} 