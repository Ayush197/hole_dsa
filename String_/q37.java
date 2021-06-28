import java.util.*;
class q37
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the the two strings");
        String x=au.next(),y=au.next();

        Map <Character,String> map=new HashMap<>();
        
         int m=x.length(),n=y.length();   
        boolean dp[][]=new boolean[n+1][m+1];

        dp[n][m]=true;

        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=0;j--)
            {
                if(i==n-1&&j==m-1)
                {
                    dp[i][j]=true;
                }
                else if(i==n-1)
                dp[i][j]=false;
                else if(j==m-1)
                {
                    if(y.charAt(i)=='*')
                    dp[i][j]=dp[i+1][j];
                    else
                    dp[i][j]=false;
                }
                else
                {
                   if(y.charAt(i)=='?')
                   dp[i][j]=dp[i+1][j];
                   else if(y.charAt(i)=='*')
                   dp[i][j]=dp[i+1][j]||dp[i][j+1];
                   else if(y.charAt(i)==x.charAt(j))
                   dp[i][j]=dp[i+1][j+1];
                   else
                   dp[i][j]=false;
                }
            }

        }
        System.err.println(dp[0][0]);

            
        }
    }
