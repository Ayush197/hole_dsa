import java.util.*;

public class q29
 {
     public static void main(String[] args) 
     {
         Scanner au=new Scanner(System.in);
         System.out.println("Enter the size");
         
         int n=au.nextInt();

         int x[]=new int[n];

         for(int i=0;i<n;i++)
         x[i]=au.nextInt();

         int profit=0;
         for(int i=0;i<n-1;i++)
         {
             int sub=x[i]-x[i+1];
             if(sub>0)
             profit+=sub;
         }
         System.out.println(profit);
         au.close();

     }
}