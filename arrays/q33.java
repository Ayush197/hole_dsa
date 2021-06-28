import java.util.*;
public class q33
{
    public static void main(String[] args)
     {
         Scanner au= new Scanner(System.in);
         System.out.println("Enter the size of array and (a,b)");
         int n=au.nextInt();
         
         int x[]=new int [n];

         for(int i=0;i<n;i++)
         x[i]=au.nextInt();

         int a=au.nextInt();
         int b=au.nextInt();
         
        
    
         
         int idx=0;
         int beg=0,end=n-1;
         while(beg<=end)
         {
             
                   if(x[idx]<a)
                   {
                       int temp=x[beg];
                       x[beg]=x[idx];
                       x[idx]=temp;
                       beg+=1;
                       idx+=1;
                       
                    }
                    else if(x[idx]>b)
                    {
                        int temp=x[end];
                        x[end]=x[idx];
                        x[idx]=temp;
                        end-=1;
                    }
                    else
                    idx+=1;
            
         }
        }
}