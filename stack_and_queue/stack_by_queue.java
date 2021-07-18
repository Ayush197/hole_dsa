import java.util.*;
public class stack_by_queue 
{
    class stack
    {
        Queue<Integer> q1=new LinkedList<Integer>();
        Queue<Integer> q2=new LinkedList<Integer>();

        int cur_size;
        stack()
        {
            cur_size=0;
        }
        void push(int val)
        {
            cur_size+=1;
            q2.add(val);

            while(!q1.isEmpty())
            {
                q2.add(q1.peek());
                q1.remove();
            }

            Queue<Integer> q;
            q=q1;
            q1=q2;
            q2=q1;

        }
        void pop()
        {
            if(q1.isEmpty())
            {
                System.out.println("underflow");
                return;
            }
            q1.remove();
            cur_size--;
        }
        int  size()
        {
            return cur_size;
        }

    }
    public static void main(String[] args) {

        
        stack_by_queue ob=new stack_by_queue();
        stack s =ob.new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        //can check the size calling size function
        

    }
    
}
