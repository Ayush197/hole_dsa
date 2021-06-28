import java.util.Scanner;

public class q27
 {
     public static int check(int x[],int val)
     {
         int count=0;
         for(int i=0;i<x.length;i++)
         { 
            if(x[i]-val>0)
            count+=x[i]-val;             
         }
         return count;
     }
     static int req(int x[],int k)
     {
         int len=x.length;
         int low=0,high=x[len-1];

         while(low<=high)
         {
             int mid=(low+high)/2;

             if(check(x,mid)==k)
             return mid;

             if(check(x, mid)<k)
             high=mid-1;
             else
             low=mid+1;

             
         }
         return -1;
     }
     public static void main(String[] args) 
     {
         Scanner au=new Scanner(System.in);
         System.out.println("enter the size and the wood requires");
         int n=au.nextInt(),k=au.nextInt();

         int x[]=new int[n];
         for(int i=0;i<n;i++)
         x[i]=au.nextInt();

         int res=req(x, k);
         System.err.println(res);
         

         au.close();
         
     }
    
}
