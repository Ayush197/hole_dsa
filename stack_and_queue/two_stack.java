package stack_and_queue;
class two_stack
{
    static class double_stack
    {
        int top1,top2;
        int a[];
        int size;
        double_stack(int size)
        {
            this.size=size;
            a=new int[size];
            top1=(size/2)+1;
            top2=top1-1;

            

        }
        void push1(int val)
        {
            if(top1<0)
            {
               System.out.println("overflow detected");
               return;
            }

            a[--top1]=val;
        }
        void push2(int val)
        {
            if(top2>size-1)
            {
              System.out.println("overflow detected");
              return;
            }
            a[++top2]=val;
        }
        void pop1()
        {
            if(top1>size/2)
            {
              System.out.println("underflow");
              return;
            }
        
            System.out.println(a[top1]);
            a[top1]=a[--top1];
        }
        void pop2()
        {
            if(top2<size/2)
            {
              System.out.println("underflow");
              return;
            }
            System.out.println(a[top2]);
            top2--;
        }


    }
    public static void main(String[] args) {
       
        int size=10;
        double_stack ob=new double_stack(size);
        ob.push1(1);
        ob.push2(3);
        ob.push2(5);
        ob.pop1();
        ob.pop2();
        ob.pop2();
    }
}