package stack_and_queue;

import java.util.Stack;

class stack_end
{
    void end_stack(Stack<Integer> stk,int val)
    {
        if(stk.isEmpty())
        stk.push(val);
        else
        {
            int popped =stk.pop();
            end_stack(stk, val);
            stk.push(popped);
        }
        
    }
    public static void main(String[] args) 
    {
        //number to be pushed at the end of stack;
        int val=42;
        Stack<Integer> stk =new Stack<>();
        stk.push(4);
        stk.push(8);
        stk.push(6);
        stk.push(9);
        stack_end ob=new stack_end();
        ob.end_stack(stk, val);
        System.out.println(stk);
        
    }
}