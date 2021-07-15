package stack_and_queue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class sec_max
{
    Stack<Integer> stk=new Stack<>();
    //using stack
    void sol2(ArrayList<Integer> ar)
    { 
        int len=ar.size();
        stk.push(ar.get(0));
        int next;
        for(int i=1;i<len;i++)
        {
            next=ar.get(i);
            if(!stk.isEmpty())
            {
                int cur=stk.pop();

                while(cur<next)
                {
                    System.out.println(cur+"---->"+next);
                    if(stk.isEmpty())
                    break;
                    cur=stk.pop();
                }
                if(cur>next)
                stk.push(cur);

            }
            stk.push(next);
        }
        while(!stk.isEmpty())
        {
             System.out.println(stk.pop()+" --> "+ -1);
        }


    }
    void sol1(ArrayList<Integer> ar)
    {

        int len=ar.size();
        int val;
        for(int i=0;i<len;i++)
        {
            int cur=ar.get(i);
             val=-1;
            for(int j=i+1;j<len;j++)
            {
                if(cur<ar.get(j))
                {
                    val=ar.get(j);
                    break;
                }
                
            }

            System.out.print(val+" , ");
        }
    }
    public static void main(String[] args) {
        
        System.out.println("enter the numbers and press 'd' to end");
        Scanner au=new Scanner(System.in);
        ArrayList<Integer> ar=new ArrayList<>();
        while(au.hasNextInt())
        {
            int val=au.nextInt();
            ar.add(val);
        }
        System.out.println(ar);
        //int len=ar.size();
        sec_max ob=new sec_max();
        ob.sol1(ar);
        ob.sol2(ar);
        
        au.close();
    }
}