import java.util.*;
 class q30
 {
     public static void main(String[] args) {
         Scanner au=new Scanner(System.in);
         System.out.println("Enter the the size");
         
         int n=au.nextInt();
         
         int x[]=new int [n];

         for(int i=0;i<n;i++)
         x[i]=au.nextInt();

         int min=x[0],max=x[n-1];

         int trapped=0;
         for(int i=1;i<n;i++)
         {
               if(min>x[i]&&min<max)
               {
                   trapped+=(min-x[i]);
               }
         }
         System.out.println(trapped);
     }
}