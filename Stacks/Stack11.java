
import java.util.*;
public class mains { 
    public static void main(String args[]) 
    { 
        Stack11 s = new Stack11(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
} 

class Stack11
{
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX];
    Stack11() 
    { 
        top = -1; 
    } 

    int peek() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top]; 
            return x; 
        } 
    }
  
    int pop() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top--]; 
            return x; 
        } 
    } 
    boolean push(int x) 
    { 
        if (top >= (MAX - 1)) 
        { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else 
        { 
            a[++top] = x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 
}
  
