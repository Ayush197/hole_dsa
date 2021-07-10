package stack_and_queue;

public class scratch_queue {
    
    static class queue
    {
        
        static int top,bottom,size;
        static int q[];
        queue(int cur_size)
        {
            size=cur_size;
           q=new int[size];
           
           top=bottom=size;
        }
        boolean overflow()
        {
        return top>size;
        }
        boolean underflow()
        {
            return top==bottom;
        }
        void Queue(int val)
        {
            if(overflow())
            System.out.println("overflow");
        

            q[--bottom]=val;
        }
        void dequeue()
        {
            if(underflow()||top<1)
            System.out.println("underflow");

           System.out.println(q[--top]);
           q[top]=q[--top];
        }
    }
    public static void main(String[] args) 
    {
        queue ob=new queue(4);
        ob.Queue(45);
        ob.Queue(56);
        ob.dequeue();        
    }
}
