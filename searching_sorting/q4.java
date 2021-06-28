import java.util.Scanner;

public class q4
 {
     public static void main(String[] args) {
         Scanner au=new Scanner(System.in);
         System.out.println("enter the number");
         int x=au.nextInt();

         int count=0;

         for(int i=1;i<x;i++)
         {
             int sqr=(int)Math.floor(Math.sqrt(i));
             if(sqr*sqr==i)
             count+=1;
             
         }
         System.out.println(count);
         au.close();
     }
    
}
