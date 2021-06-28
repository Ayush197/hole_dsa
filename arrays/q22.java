import java.util.*;
public class q22
 {
     public static void main(String[] args) {
         
        Scanner au=new Scanner (System.in);
        System.out.println("Enter the size");
        int n=au.nextInt();

        int x[]=new int[n];
        
        for(int i=0;i<n;i++)
        x[i]=au.nextInt();
 
                 
        int min=x[0],max=x[0];
        int product=x[0];
        for(int i=1;i<n;i++)
        {
              if(x[i]<0)
              {
                  int  temp=min;
                  min=max;
                  max=temp;
              }
              
              max=Math.max(x[i],max*x[i]);
              min=Math.min(x[i],min*x[i]);
           
              product=Math.max(max, product);

        
        }
        System.out.println("The maximum product >> "+product);
        
        au.close();
     }
}
