import java.util.Arrays;
import java.util.Scanner;

public class q7 
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=au.nextInt();

        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=au.nextInt();

        Arrays.sort(x);
        
        int store=0,rep=0;

        for(int i=0;i<n-1;i++)
        {
            if(x[i]==x[i+1])
            rep=x[i];

            if(x[i]-x[i+1]!=1)
            {
            store=x[i]-1;
            }
        }

        System.out.println(rep+" "+store);
        
        au.close();
    }
    
}
