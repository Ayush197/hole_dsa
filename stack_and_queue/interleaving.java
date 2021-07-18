import java.util.*;

public class interleaving {


     void interleaved(Queue<Integer> q,int size)
     {
         Stack<Integer> stk=new Stack<>();

         int half_size=size/2;
         //storing the first half of queue in the stack.
         for(int i=0;i<half_size;i++)
         stk.push(q.poll());//stk - 5 4 3 2 1 , q - 6 7 8 9 10


         //enqueue the value stored in the stack(above).
         //remember: entry takes place from rear.
         while(!stk.isEmpty())
         q.add(stk.pop());//stk - empty, q - 6 7 8 9 10 5 4 3 2 1

         //enqueue the second half of the queue by removing front and
         //adding them in the rear.
         for(int i=0;i<half_size;i++)
         q.add(q.poll());// stk - empty , q - 5 4 3 2 1 6 7 8 9 10

         //pushing the first half of the queue in the stack
         for(int i=0;i<half_size;i++)
         stk.push(q.poll());// stk - 1 2 3 4 5 , q - 6 7 8 9 10

         while(!stk.isEmpty())
         {
             q.add(stk.pop());
             q.add(q.poll());
         }





     }

    public static void main(String[] args) {
        
        interleaving ob=new interleaving();

        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        System.out.println("queue before interleaving");
        System.out.println(q);
        System.out.println("queue after interleaving");
        ob.interleaved(q, 10);
        System.out.println(q);
    }
}
