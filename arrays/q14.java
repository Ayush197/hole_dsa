import java.util.*;

public class q14
 {
     public static void main(String[] args) 
     {
         Scanner au=new Scanner(System.in);
         System.out.println("Enter the size");
         int n=au.nextInt();

         int x[]=new int[n];

         for(int i=0;i<n;i++)
         x[i]=au.nextInt();

         int i=n-2;

         while(i>=0&&x[i]>=x[i+1])
         i--;
        
         int c=n-1;

         if(i>=0)
         {
         while(c>0&&x[c]<=x[i])
         c-=1;
         }

         //swapping the numbers..
         // 135 432
         if(i==-1)
         i=0;

    
         int temp=x[i];
         x[i]=x[c];
         x[c]=temp;

         Arrays.sort(x,i,n-1);

         for(int j=0;j<n;j++)
         System.out.print(x[j]+" ");

         
     }
    
}
