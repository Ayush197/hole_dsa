import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class revk_queue 
{
    void k_rev(int k,Queue<Integer> q)
    {
        if(q.isEmpty()||k>q.size()||k<=0)
        return;

        Stack<Integer> stk=new Stack<>();

        for(int i=0;i<k;i++)
        stk.push(q.poll());

        while(!stk.isEmpty())
        {
            q.add(stk.pop());

        }

        for(int i=0;i<q.size()-k;i++)
        {
            q.add(q.poll());
            
        }
    }
    public static void main(String[] args) {
        
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k=3;
        revk_queue ob=new revk_queue();
        System.out.println("queue before reversing");
        System.out.println(q);
        System.err.println("queue after reversing "+k+" elements");
        ob.k_rev(k, q);
        System.out.println(q);
    }
    
}
