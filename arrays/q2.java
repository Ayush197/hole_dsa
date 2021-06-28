import java.util.Scanner;


public class q2 
{
    public static void main(String args[])
     {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=au.nextInt();
        
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=au.nextInt();
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(x[i]>max)
            max=x[i];
            if(x[i]<min)
            min=x[i];
        }
        System.out.println("Minimum value>>>"+min+"Maximum value>>"+max);
        au.close();


    }
    
}
