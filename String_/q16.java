import java.util.*;

public class q16 
{
    public static void main(String[] args)
     {
         Scanner au=new Scanner(System.in);
         System.out.println("Enter the size of arr");
         int n=au.nextInt();

         int ar[]=new int[n];
         for(int i=0;i<n;i++)
         ar[i]=au.nextInt();
         
         int brek_point=0;

         for(int i=n-1;i>0;i--)
         {
             if(ar[i-1]<ar[i])
             {
             brek_point=i-1;
             break;
             }

         }
         System.out.println(brek_point);

         //int next_point=0;
         for(int i=n-1;i>0;i--)
         {
             if(ar[i]>ar[brek_point])
             {
                 int temp=ar[brek_point];
                 ar[brek_point]=ar[i];
                 ar[i]=temp;
                 break;
             }
         }
         Arrays.sort(ar,brek_point+1,ar.length);

         for(int i=0;i<n;i++)
         System.out.print(ar[i]+" ");
        
    }
    
}
