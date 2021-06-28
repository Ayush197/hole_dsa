import java.util.Arrays;
import java.util.Scanner;

public class candy 
{
    public static void main(String[] args) {
    
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the number of candies");
        int n=au.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=au.nextInt();

        System.out.println("Enter k");
        int k=au.nextInt();

        Arrays.sort(x);
        int lim=0,min=0;
        for(int i=0;i<n;i++)
        {
            min+=x[i];
            lim+=k;
            if(lim>=n)
            break;
        }
        System.out.println("the minimum cost "+min);
        int max=0;
        lim=0;
        for(int i=n-1;i>=0;i--)
        {
            max+=x[i];
            lim+=k;
            if(lim>=n)
            break;
        }
        System.out.println("the maximum cost"+max);


        au.close();
    }
    
}
