import java.util.Scanner;

public class wine
 {
     public static void main(String[] args) 
     {
         Scanner au=new Scanner(System.in);
         System.out.println("enter the n");
         int n=au.nextInt();

         int x[]=new int[n];
         for(int i=0;i<n;i++)
         x[i]=au.nextInt();

         int cost=0;
         for(int i=1;i<n;i++)
         {
             x[i]=x[i]+x[i-1];
             cost+=Math.abs(x[i-1]);
         }
         System.out.println(cost);
         au.close();
         
     }
    
}
