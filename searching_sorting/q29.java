import java.util.Scanner;

public class q29
 {
     static int  check(int x[],int val)
     {
         int len=x.length,count=0;
         for(int i=0;i<len;i++)
         {
             int sum=x[i];
             if(sum==val)
             count++;
            
             for(int j=i+1;j<len;j++)
             {
                
                sum+=x[j];
                if(sum==val)
                {
                 count++;
                 sum=0;
                }
                
             }
             
         }
         return count;
     }
     public static void main(String[] args) {
         
        Scanner au=new Scanner(System.in);
        System.out.println("enter the n, a ,b");
        int n=au.nextInt(),a=au.nextInt(),b=au.nextInt();

        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=au.nextInt();

        //int low=0,high=x[n-1];
        int res=0;

        for(int i=a;i<=b;i++)
        res+=check(x, i);

        System.err.println("the result"+(res+1));
        au.close();
     }
    
}
