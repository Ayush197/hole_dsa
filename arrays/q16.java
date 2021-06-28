import java.util.*;
 class q156
 {
     public static void main(String[] args) {
         Scanner au=new Scanner(System.in);
         System.out.println("Enter the the size");
         
         int n=au.nextInt();

         int x[]=new int [n];

         for(int i=0;i<n;i++)
         x[i]=au.nextInt();

         int min=x[0];
         int max_prices=-1;

         for(int i=1;i<n;i++)
         {
             if(x[i]<min)
             min=x[i];

             if(x[i]-min>max_prices)
             {
             max_prices=x[i]-min;
            // System.out.println(x[i]);
             }
         }
         System.out.println(max_prices);
         au.close();
     }
}

