
import java.util.*;
class item implements Comparable<item>
{
    int wt,val;
    item(int wt,int val)
    {
        this.wt=wt;
        this.val=val;
    }
    public int compareTo(item i)
    {
        return this.wt*i.val-this.val*i.wt;
    }
}
public class fractional_knapsack
 {
     static int result(item i[],int w,int n)
     {
         int res=0;
         Arrays.sort(i);
         for(int j=0;j<n;j++)
         {
             if(i[j].wt<=w)
             {
                 res+=i[j].val;
                 w-=i[j].wt;

             }
             else
             {
                 res+=i[j].val*(w/i[j].wt);
                 break;
             }
         }
         return res;
     }
     public static void main(String[] args) 
     {
     
        item arr[] = {new item(10, 60), 
            new item(40, 40), 
            new item(20, 100),
            new item(30, 120)};

       int n = 4, W = 50;
       System.out.println(result(arr,W,n));

         
     }
    
}
