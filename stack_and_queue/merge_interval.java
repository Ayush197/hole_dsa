import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class merge_interval {
    
    class interval{

        int first,sec;
        interval(int first,int sec)
        {
            this.first=first;
            this.sec=sec;
        }
    }
    void merge(interval ar[])
    {
        Stack<interval> stk=new Stack<>();

        Arrays.sort(ar,new Comparator<interval>()
        {
            public int compare(interval a,interval b)
            {
                return a.first-b.first;

            }            
        });

        stk.push(ar[0]);

        for(int i=1;i<ar.length;i++)
        {
            interval top=stk.peek();

            if(top.end<ar[i].first)
            stk.push(ar[i]);
            else if(top.end<ar[i].end)
            {
                top.end=ar[i].end;
                stk.pop();
                stk.push(top);
            }
        }
        while(!stk.isEmpty())
        {
            interval val=stk.pop();
            System.out.println(val.first+" , "+val.sec);
        }

    }
    public static void main(String[] args) {
        
        merge_interval ob=new merge_interval();

        interval arr[]={

        new interval(6,8),
        new interval(1,9),
        new interval(2,4),
        new interval(4,7)
        };

       ob.merge(ar);
    }
}
