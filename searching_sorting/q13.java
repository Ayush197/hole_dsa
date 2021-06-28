import java.util.Scanner;

public class q13
{
    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=au.nextInt();

        int x[]=new int[n];

        for(int i=0;i<n;i++)
        x[i]=au.nextInt();
        
        int sum=0;

        int i=0;
        while(i<n)
        {
            
          if(i+1<n&&x[i]<x[i+1])
          {
          sum+=x[++i];
          }
          else
          sum+=x[i];

          i+=2;
        }
        System.out.println(sum);
        au.close();
    }
    
}
