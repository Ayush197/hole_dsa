package stack_and_queue;

import java.util.Scanner;
import java.util.Stack;

class exp
{
    Stack<Character> expression(String st, Stack<Character> stk)
    {
         for(int i=0;i<st.length();i++)
         {
             stk.push(st.charAt(i));
         }
         return stk;
    }
    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        System.out.println("enter the expression");
        String st=au.next();
        Stack<Character> stk =new Stack<>();
        au.close();
        
    }
}