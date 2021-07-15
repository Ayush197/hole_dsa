import java.util.Stack;

class sort_stack
{
    void sorted_stack(Stack<Integer> stk, int val)
    {
        if(stk.isEmpty()||val>stk.peek())
        {
            stk.push(val);
            return;
        }
        
        int popped=stk.pop();
        sorted_stack(stk, popped);

        stk.push(poppped);
    }
    void stack_sort(Stack<Integer> stk)
    {
        if(stk.isEmpty())
        return;

        int popped=stk.pop();

        stack_sort(stk);

        sorted_stack(stk, popped);

        
    }
    public static void main(String[] args) {
        
        Stack <Integer> stk =new Stack<>();
        sort_stack ob=new sort_stack();
        stk.push(8);
        stk.push(2);
        stk.push(9);
        stk.push(4);
        stk.push(5);
        System.out.println("stack before sorting ");
        System.out.println(stk);
        ob.stack_sort(stk);
        System.out.println("stack after sorting recursion");
        System.out.println(stk);
    }
}