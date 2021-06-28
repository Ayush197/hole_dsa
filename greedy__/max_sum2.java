import java.util.Arrays;
import java.util.Scanner;

public class max_sum2 
{

    public static void main(String[] args) {
        
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=au.nextInt();

        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=au.nextInt();

        Arrays.sort(x);
        int sum=0;

        int mod=(int)Math.pow(10, 9)+7;
        for(int i=0;i<n;i++)
        {
            sum+=x[i]*i;
            sum%=mod;
        }
        
        System.out.println(sum);
        au.close();
    }
}
