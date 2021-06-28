import java.util.Scanner;

public class smallest_number
 {
     public static void main(String[] args)
      {
          Scanner au=new Scanner(System.in);
          System.out.println("enter the sum and the no of digits");
          int sum=au.nextInt(),k=au.nextInt();
          
          int x[]={1,2,3,4,5,6,7,8,9};

          int idx=8,count=0,num=0,w=0;
          while(idx>=0)
          {
               if(num+x[idx]<=sum)
               {
               count+=x[idx]*(int)Math.pow(10, w);
               num+=x[idx];
               w+=1;
               }
               else
               idx-=1;

            
          }
          System.out.println(count);
        

          
          au.close();
         
     }
    
}
