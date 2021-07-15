package stack_and_queue;
import java.util.*;


class get_min
{
    //ArrayList<Integer> ar=new ArrayList<>();

    public Stack<Integer> stk=new Stack<>();
    Stack<Integer> push(ArrayList<Integer> ar)
    {
        int len=ar.size();
        if(len==0)
        return stk;
        for(int i=0;i<len;i++)
        {
            int cur=ar.get(i);
            if(stk.isEmpty())
            stk.push(cur);
            else
            {
                int prev=stk.peek();
                if(prev>cur)
                {
                    stk.pop();
                    stk.add(prev);
                    stk.add(cur);
                }
                else
                stk.add(cur);
            }

            
        }
        return stk;
    }
        int get_minimum(Stack<Integer> stk)
        {
            return stk.pop();
        }
    
    public static void main(String[] args)
     {
         System.out.println("enter the numbers and enter any character to terminate");
         Scanner au=new Scanner(System.in);
         ArrayList<Integer> ar=new ArrayList<>();

         Stack<Integer> stk=new Stack<>();

         while(au.hasNextInt())
         {
             int val=au.nextInt();
             ar.add(val);
         } 
         //System.out.println(ar);

         get_min ob=new get_min();
         stk=ob.push(ar);
         System.out.println(ob.get_minimum(stk));


    }
}