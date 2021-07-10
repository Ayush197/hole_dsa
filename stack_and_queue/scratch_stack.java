package stack_and_queue;

public class scratch_stack
 {
    static class stack
     {  
        int size;
        int top;
       static int a[];
        
         stack(int size)
         {
             this.size=size;
             a=new int[size];
             top=-1;
             
         }
         boolean underflow(int top)
         {
             return top<0;
         }
         boolean overflow(int top)
         {
             return top>this.size;
         }
         void push(int val )
         {
             if(overflow(top))
             System.out.println("underflow");

             a[++top]=val;
         }
         void pop()
         {
             if(underflow(top))
             System.out.println("overflow");
             a[top]=a[--top];

         }
         void peek()
         {
             if(underflow(top))
             System.out.println("underflow");
             System.out.println(a[top]);
         }
     }
     public static void main(String[] args) 
     {
        int size=10;
        scratch_stack ob =new scratch_stack();
        stack ob2=new stack(size);
        ob2.push(90);
        ob2.peek();

        
        
        
         
     }
 }
    

