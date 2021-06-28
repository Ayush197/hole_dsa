import java.util.Arrays;
import java.util.Scanner;

public class chocol
{
    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        System.out.println("enter the m and n");
        int m=au.nextInt(),n=au.nextInt();
        int x[]=new int[m+1];
        int y[]=new int[n+1];
        for(int i=1;i<m;i++)
        x[i]=au.nextInt();
        for(int i=1;i<n;i++)
        y[i]=au.nextInt();
    
        Arrays.sort(x);Arrays.sort(y);
        int dp[][]=new int[m+1][n+1];
        for(int i=1;i<=m;i++)
        dp[i][0]=dp[i-1][0]+x[i];
        for(int i=1;i<=n;i++)
        dp[0][i]=dp[0][i-1]+y[i];

        int min=0;
        for(int i=1;i<=m;i++)
        {
             min=-1;
            for(int j=1;j<=n;j++)
            {
                  dp[i][j]=Math.min(dp[i-1][j]+x[i]*(j+1),dp[i][j-1]+y[j]*(j+1)); 
                  if(dp[i][j]>min)
                  min=dp[i][j];
            }
        }
        System.out.println(min);
       


        au.close();
        
    }
}