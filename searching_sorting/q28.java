import java.util.Scanner;

public class q28
 {

    static boolean check(int val,int x[],int req)
    {
        int w=0;
      
        for(int i=0;i<x.length;i++)
        {
            int curr=x[i],f=2;
            
            while(curr<=val)
            {
                w++;
                curr+=(curr*f);
                f++;
                
            }
            if(w>=req)
            return true;
            
        }
        return false;

    
    }
     public static void main(String[] args)
    {
        Scanner au=new Scanner(System.in);
        System.out.println("enter the test cases and all");
        int t=au.nextInt();

        while(t>0)
        {
            int req=au.nextInt();
            int n=au.nextInt();
            int x[]=new int[n];

            for(int i=0;i<n;i++)
            x[i]=au.nextInt();

    
            
            int low=0,high=Integer.MAX_VALUE,mid=0,ans=0;
            while(low<=high)
            {
             mid=(low+high)/2;
             
             if(check(mid, x, req))
             {
                 ans=mid;
                 high=mid-1;
             }
             else
             low=mid+1;
            }


            System.err.println("result >> "+ans);


            t--;
        }
        au.close();
         
     }
    
}
