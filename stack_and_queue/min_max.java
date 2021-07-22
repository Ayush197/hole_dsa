import java.util.*;

public class min_max {


    int sum_minmax(Deque<Integer> d)
    {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<d.size();i++)
        {
            if(d.peek()>max)
            max=d.peek();

            if(d.peek()<min)
            min=d.peek();

            d.pop();
        }

        return min+max;

         
    }

    void form_subarray(int ar[],int k)
    {
        int  len=ar.length;
        Deque<Integer> d=new ArrayDeque<>();
        int sum=0;
        for(int i=0;i<len-k;i++)
        {
            for(int j=i;j<i+k;j++)
            {
               d.add(ar[j]);
            }
            sum+=sum_minmax(d);
            d.clear();

        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        
        int ar[]={2, 5, -1, 7, -3, -1, -2} ;
        int k=4;
        min_max ob=new min_max();

        ob.form_subarray(ar, k);

    }
    
}
