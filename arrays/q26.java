import java.util.*;
 class q26
 {
     public static void main(String[] args) 
     {
         Scanner au=new Scanner(System.in);
         System.out.println("Enter the the size N and M");

         
         int n=au.nextInt();
         
         int m=au.nextInt();

         int x[]=new int [n];
         int y[]=new int [m];

         for(int i=0;i<n;i++)
         x[i]=au.nextInt();

         for(int i=0;i<m;i++)
         y[i]=au.nextInt();

         Arrays.sort(x);
         Arrays.sort(y);

         int count=0;
         for(int i=0;i<m;i++)
         {
             for(int j=i;j<n;j++)
             {
                 if(y[i]==x[j])
                 {
                 count+=1;
                 break;
                 }
             }
         }
        String flag="No";

        if(count==m)
        flag="Yes";

        System.out.println(flag);
        au.close();

     }
    
}