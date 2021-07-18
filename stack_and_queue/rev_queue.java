import java.util.LinkedList;
import java.util.Queue;

public class rev_queue 
{
    
    void q_rev(Queue<Integer> q)
    {
        if(q.isEmpty())
        return;

        int popped =q.poll();
        q_rev(q);
        q.add(popped);



    }
    public static void main(String[] args) {

        rev_queue ob=new rev_queue();
        
        Queue<Integer> q=new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("queue before reversing");
        System.out.println(q);
        System.out.println("queue after reversing");
        ob.q_rev(q);
        System.out.println(q);
    }
    
}
