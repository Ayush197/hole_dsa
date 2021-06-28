import java.util.Arrays;
import java.util.Scanner;

public class max_product
 {
     static int product(int x[])
     {
         int count_n=0,max_n=Integer.MIN_VALUE;
         int prod=1;
         for(int i=0;i<x.length;i++)
         {
             if(x[i]!=0)
             {
                 
                 max_n=(x[i]<0)?Math.max(max_n,x[i]):max_n;
                // System.out.println(max_n);
               prod*=x[i];
             }
             

         }
         System.out.println(max_n);
         return prod/max_n;
     }
     public static void main(String[] args) 
     {
         Scanner au=new Scanner(System.in);
         System.out.println("enter the size of array");
         int n=au.nextInt();
         int x[]=new int[n];
         for(int i=0;i<n;i++)
         x[i]=au.nextInt();

         Arrays.sort(x);
         System.out.println(product(x));
         
         au.close();
         
     }
    
}
