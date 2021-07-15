package stack_and_queue;

import java.util.Scanner;
import java.util.Stack;

public class post_exp 
{
    int post_eval(String st)
    {
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<st.length();i++)
        {
            int a=0,b=0;
            char c=st.charAt(i);

            if(Character.isDigit(c))
            {
                stk.push(c-'0');
            }
            else
            {
                 a=stk.pop();
                 if(!stk.isEmpty())
                 b=stk.pop();

                 switch(c)
                 {
                     case '+':
                     stk.push(a+b);
                     break;

                     case '-':
                     stk.push(a-b);
                     break;

                     case '*':
                     stk.push(a*b);
                     break;

                     case '/':
                     stk.push(a/b);
                     break;

                 }

                
            }
            //return stk.pop();
        }
        return stk.pop();
    }
    public static void main(String[] args) {
        
        post_exp ob=new post_exp();
        Scanner au=new Scanner(System.in);
        System.out.println("enter the expression");
        String st=au.next();

        int res=ob.post_eval(st);
        System.out.println(res);

        au.close();
    }
    
}
