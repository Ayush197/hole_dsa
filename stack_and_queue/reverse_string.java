package stack_and_queue;

import java.util.Scanner;

public class reverse_string 
{
    public class stack
    {
       char a[];
       int top;
       int size;
       stack(int len)
       {
         size=len;
         a=new char[len];
         top=-1;
       }
       boolean underflow()
       {
           return top==-1;
       }
       boolean overflow()
       {
           return top>size-1;
       }
       char pop()
       {
           if(underflow())
           {
              System.out.println("underflow");
               return '\0';
           }
           char popped= a[top];
           top--;
           return popped;
       }
       public void push(char val)
       {
           if(overflow())
           {
               System.out.println("overflow");
               return;
           }
           a[++top]=val;

       }
      
    }
    public String rev_string(String st,stack sk)
    {
        int len=st.length();
        if(len==0)
        return "empty string";

        for(int i=0;i<len;i++)
        {
            char val=st.charAt(i);
            sk.push(val);
        }

        String rev="";
        while(!sk.underflow())
        {
            char popped=sk.pop();
             rev+=popped;
        }
        return rev;
    }
    public static void main(String[] args) {
        
        reverse_string ob= new reverse_string();
        Scanner au=new Scanner(System.in);
        System.out.println("enter the string");
        String st=au.next();
        int len=st.length();
        stack stk=ob.new  stack(len);
        System.out.println(ob.rev_string(st, stk));
        au.close();
    }
    
}
