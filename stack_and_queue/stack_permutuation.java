import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack_permutuation {
    
    boolean check_permutuation(Queue<Integer> p,Queue<Integer> q)
    {
        

        Stack<Integer> stk=new Stack<>();
        while(!p.isEmpty())
        {
            int cur=p.poll();
            if(cur==q.peek())
            {
                q.poll();
                while(!stk.isEmpty())
                {
                    if(stk.peek()==q.peek())
                    {
                        stk.pop();
                        q.poll();
                    }
                    else
                    break;
                }
            }
            else
            stk.push(cur);
        
        }
        
        return stk.isEmpty()&&q.isEmpty();
        
    }
    public static void main(String[] args) {
        
        stack_permutuation ob=new stack_permutuation();
        Queue<Integer> p=new LinkedList<>();
        Queue<Integer> q=new LinkedList<>();

        p.add(1);
        p.add(2);
        p.add(3);
        
        q.add(2);
        q.add(1);
        q.add(3);

        boolean res=ob.check_permutuation(p, q);

        System.out.println(res);



        
    }
}
