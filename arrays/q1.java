import java.util.*;

class q1
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the size of array");
        Scanner au= new Scanner(System.in);
        int n=au.nextInt();

        int x[]=new  int[n];
        for(int i=0;i<n;i++)
        x[i]=au.nextInt();

        for(int i=0;i<n/2;i++)
        {
            int start=x[i];
            int end=x[n-1-i];

            x[i]=end;
            x[n-1-i]=start;
            //System.out.println("start....."+x[i]+"end>>>>"+end);
        }

        for(int i=0;i<n;i++)
        System.out.println(x[i]);
        
    }
}