import java.util.Arrays;
import java.util.Scanner;

public class sum_subset 
{
    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=au.nextInt();

        int x[]=new int[n];

        for(int i=0;i<n;i++)
        x[i]=au.nextInt();

        Arrays.sort(x);
        
        if(n<4)
        System.out.println(x[n-1]);
        else
        {
            int max_sum=0;

            for(int i=0;i<n/2;i++)
            {
                max_sum+=x[i];
            }
            int cur_sum=0;
            int count=0;
            for(int i=n-1;i>=n/2;i--)
            {
                cur_sum+=x[i];
                count++;
        
                if(cur_sum>max_sum)
                break;

            }
            System.out.println(count);
        }
        au.close();
        
    }
    
}
