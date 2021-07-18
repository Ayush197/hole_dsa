import java.util.Stack;

public class queue_by_stack {

    class queue
    {
        Stack<Integer> stk=new Stack<>();


        void bottom_insert(int val)
        {
            if(stk.isEmpty())
            {
                stk.push(val);
                return;
            }

            int popped=stk.pop();
            bottom_insert(val);

            stk.push(popped);
        }

        void add(int val)
        {
              bottom_insert(val);   
        }
        int poll()
        {
            return stk.pop();

        }
    }
    public static void main(String[] args) 
    {
        queue_by_stack ob=new queue_by_stack();
        queue q=ob.new queue();

        q.add(1);
        q.add(2);
        q.add(4);

        System.out.println("getting the first value that was inserted >>"+q.poll());
        
        
    }
    
}
