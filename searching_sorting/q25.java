import java.util.Scanner;

public class q25
{
    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        System.out.println("enterr a , b,c");

        int a=au.nextInt();

        int i=5,count=1,sub=5;

         while(true)
         {
             if(count%5==0)
             i=i-5;
             if(count==a)
             break;
             
             i+=5;

             count++;

         } 
         System.err.println(i);

    }
}