import java.util.*;
 class q18
 {
     public static void main(String[] args) {
         Scanner au=new Scanner(System.in);
         System.out.println("Enter the the size");
         
         int n=au.nextInt();

         int x[]=new int [n];

         for(int i=0;i<n;i++)
         x[i]=au.nextInt();
          
         Arrays.sort(x);

         int neg=0,pos=0;
        
         for(int i=0;i<n;i++)
         if(x[i]<0)
         neg+=1;
         else
         pos+=1;

         if(neg<=pos)
         {
             if(neg%2==1)
             {
                 for(int i=1;i<neg;i+=2)
                 {
                     int temp=x[i];
                     int far=x[i+neg];
                     x[i+neg]=temp;
                     x[i]=far;
                    

                 }
             }
             else
             for(int i=1;i<=neg;i+=2)
                 {
                     int temp=x[i];
                     int far=x[i+neg-1];
                     x[i+neg-1]=temp;
                     x[i]=far;
                    

                 }
         }
         else
         {
             Arrays.sort(x,Collections.reverseOrder());

             if(pos%2==1)
             for(int i=1;i<pos;i+=2)
                 {
                     int temp=x[i];
                     int far=x[i+pos];
                     x[i+pos]=temp;
                     x[i]=far;
                    

                 }
                 else
                 for(int i=1;i<=pos;i+=2)
                 {
                     int temp=x[i];
                     int far=x[i+pos-1];
                     x[i+pos-1]=temp;
                     x[i]=far;
                    

                 }

         }

     }
}
