package stack_and_queue;

import java.util.Arrays;

public class n_stacks
 {
     class kstack
     {
         int a[];
         int top[];
         int next[];
         int free;
         kstack(int k,int size)
         {
             a=new int[size];
             top=new int[k];
             a=new int[size];
             //initializing top array with -1
             Arrays.fill(top,-1);
             //initializing 'next' array from 1 t0 size-1,
             free=0;
            for(int i=0;i<size-1;i++)
            next[i]=i+1;
             //and last index with -1 to indicate the end 
             next[size-1]=-1;
             
         }
         boolean overflow()
         {
             return free==-1;
         }
         boolean underflow(int stack_num)
         {
             return top[stack_num]==-1;
         }
         void push(int val,int stack_num)
         {
            if(overflow())
            {
                System.out.println("overflow");
                return;
            }
            int i=free;
            free=next[i];

            next[i]=top[stack_num];
            top[stack_num]=i;

            a[i]=val;
         }
         void pop(int sn)
         {
             if(underflow(sn))
             {
                System.out.println("underflow");
                return;
             }
             int i=top[sn];
             top[sn]=next[i];

             next[i]=free;
             free=i;
             
            System.out.println(a[i]);




         }
     }
     public static void main(String[] args) 
     {
          //create object of n_stack and call k_stack with it.
          //it kinda like bubble sort , remember just kind of.         
     }
    
}
