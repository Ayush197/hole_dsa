import java.util.*;
 class q31
 {
     public static void main(String[] args) {
         Scanner au=new Scanner(System.in);
         System.out.println("Enter the the size and K");
         
         int n=au.nextInt();
         
         int K=au.nextInt();

         int x[]=new int [n];

         for(int i=0;i<n;i++)
         x[i]=au.nextInt();

         
         int a=0,b=0,c=0;

         int k=n-1;
         String v="Doesn't Exist";
         Arrays.sort(x);
         for(int i=0;i<n-2;i++)
         {
             a=x[i];
             int j=i+1;
             k=n-1;
             while(j<k)
             {
                 b=x[j];
                 c=x[k];
                 if(a+b+c==K)
                 {
                     System.out.println("The triplet >>> "+a+","+b+","+c);
                     v="exist";
                     break;
                 }
                 else if(a+b+c<K)
                 j+=1;
                 else
                 k-=1;
                 
             }
             if(v.equals("exist"))
             break;
         }
         System.out.println(v);
     }
}