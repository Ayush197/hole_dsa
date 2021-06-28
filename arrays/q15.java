import java.util.*;
 class q15 
 {
     public static void main(String[] args) {
         Scanner au=new Scanner(System.in);
         System.out.println("Enter the the size");
         
         int n=au.nextInt();

         int x[]=new int [n];

         for(int i=0;i<n;i++)
         x[i]=au.nextInt();

         int count=0;
         for(int i=0;i<n-1;i++)
         for(int j=i+1;j<n-1;j++)
         if(x[i]>x[j])
         count+=1;

         System.out.println(count);
     }
    
}
