package stack_and_queue;

import java.util.Stack;

public class rev_stack {

    void bottom_insertion(Stack<Integer> st, int val)
    {
        if(st.isEmpty())
        {
        st.push(val);
        return;
        }

        int popped=st.pop();
        bottom_insertion(st, val);
        st.push(popped);
    }

     void rev(Stack<Integer> stk)
     {
         if(stk.isEmpty())
         return;

         int val=stk.pop();
         rev(stk);
         bottom_insertion(stk, val);

     }
    
    public static void main(String[] args) {
        
        rev_stack ob=new rev_stack();
        Stack<Integer> stk=new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        System.out.println("the stack before reversing");
        System.out.println(stk);
        System.out.println("stack after revsersing ");
        ob.rev(stk);
        System.out.println(stk);


    }
}
