import java.util.*;
public class copy_q4
 {
     public static void main(String[] args) {
         Scanner au=new Scanner(System.in);
         System.out.println("Enter the size");
          
         int n=au.nextInt();
         int x[]=new int[n];

         for(int i=0;i<n;i++)
         x[i]=au.nextInt();

         int low=0,high=n-1,mid=0;
         int temp=0;

         while(mid<=high)
         {
             switch (x[mid])
              {
                 case 0:
                     
                      temp=x[low];
                     x[low]=x[mid];
                     x[mid]=x[low];
                     mid+=1;
                     low+=1;
                     break;
             
                    case 1:
                    mid+=1;
                     break;

                     case 2:
                     
                     temp=x[high];
                     x[high]=x[mid];
                     x[mid]=temp;
                     high-=1;
                     break;
             }
         }
         System.out.println("THE soreted array");
        for(int i=0;i<n;i++)
        System.out.println(x[i]);


     }
    
}
