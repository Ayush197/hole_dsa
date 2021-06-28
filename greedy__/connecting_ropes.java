
import java.util.PriorityQueue;
import java.util.Scanner;

public class connecting_ropes 
{
    public static void main(String[] args) 
    {
        Scanner au=new Scanner (System.in);
        System.out.println("Enter the no. of ropes and the length of ropes");
        int n=au.nextInt();
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            int val=au.nextInt();
        q.add(val);
        }
        int sum=0,total_sum=0;
        int a=0,b=0;
        while(true)
        {
            if(q.size()==1)
            break;
            a=q.isEmpty()?0:q.peek();
            q.poll();
            b=q.isEmpty()?0:q.peek();
            q.poll();
            sum=a+b;
            q.add(sum);
            //System.out.println(q);
            total_sum+=sum;
            
            

        }
        System.out.println(total_sum);

        
        
        au.close();
        
    }
    
}
