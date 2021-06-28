import java.util.*;
 class q25
 {
     public static void main(String[] args) {
         Scanner au=new Scanner(System.in);
         System.out.println("Enter the the size and K");

         List <Integer> list=new LinkedList<>();
         
         int n=au.nextInt();
         
         int k=au.nextInt();

         int x[]=new int [n];

         for(int i=0;i<n;i++)
         x[i]=au.nextInt();

         int rat=n/k;
         Arrays.sort(x);

         int prev=0,next=0,count=0;

         for(int i=0;i<n-1;i++)
         {
              prev=x[i];
              next=x[i+1];

             if(prev==next)
             {
             count+=1;

             
             
             if(count+1>rat)
             {
             list.add(prev);
             count=0;
             }
            }
            else
            count = 0;

         }
         System.out.println(list) ;
     }
}
