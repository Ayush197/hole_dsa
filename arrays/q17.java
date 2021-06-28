import java.util.*;
 class q17
 {
     public static void main(String[] args) {
         Scanner au=new Scanner(System.in);
         System.out.println("Enter the the size and K");
         
         int n=au.nextInt();
         
         int k=au.nextInt();

         int x[]=new int [n];

         for(int i=0;i<n;i++)
         x[i]=au.nextInt();
         
         int sum=0,count=0;

         for(int i=0;i<n;i++)
         {
             for(int j=i+1;j<n;j++)
             {
                 sum=x[j]+x[i];
                 if(sum==k)
                 {
                 count+=1;
                 x[i]=0;
                 }
             }

            
         }
         System.out.println("the pairs are >>>"+count);
         au.close();
     }
}