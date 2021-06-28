import java.util.*;
public class q30
{
    public static void main(String[] args)
     {
         Scanner au=new Scanner(System.in);
         System.out.println("enter the size of array");
         int n=au.nextInt();

         String x[]=new String[n];
         System.out.println("Enter the words");

         for(int i=0;i<n;i++)
         x[i]=au.next();

         String pre=x[0];
         
         for(int i=1;i<n;i++)
         {
             while(x[i].indexOf(pre)!=0)
             {
                 pre=pre.substring(0,pre.length()-1);
                 
                 if(pre.isEmpty())
                 break;
                               
             }
             
             if(pre.isEmpty())
             break;
         }
         System.out.println(pre);
         au.close();
        
    }
}