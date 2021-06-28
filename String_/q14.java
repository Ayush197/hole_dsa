import java.util.*;
public class q14 
{

    static int print(int p[],int n)
    {
        int k;
        if(p[n]==1)
        k=1;
        else
        k=print(p, n)+1;
        System.out.println("Line number" + " " + k + ": " +  
                    "From word no." +" "+ p[n] + " " + "to" + " " + n);

                    return k;
    }
    public static void main(String[] args) {
        
        Scanner au=new Scanner(System.in);

        System.out.println("Enter the string and the line limit");

        char st[]=au.next().toCharArray();

        int lim=au.nextInt();

        int n=st.length;

        int dp[][]=new int[n+1][n+1];

        int c[]=new int[n+1];
        int p[]=new int[n+1];
        int L_c[][]=new int[n+1][n+1];

        for(int i=1;i<n;i++)
        {
            dp[i][i]=lim-(int)st[i-1];
             for(int j=i+1;j<=n;j++)
             dp[i][j]=dp[i][j-1]-(int)st[j-1]-1;

        }

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                if(dp[i][j]<0)
                L_c[i][j]=Integer.MAX_VALUE;
                else if(dp[i][j]>0&&j==n)
                L_c[i][j]=0;
                else
                L_c[i][j]=dp[i][j]*dp[i][j];
            }
        }
        c[0]=0;
        for(int i=1;i<=n;i++)
        {
            c[i]=Integer.MAX_VALUE;
            for(int j=1;j<=n;j++)
            {
                if(c[j-1]!=Integer.MAX_VALUE&&L_c[j][i]!=Integer.MAX_VALUE&&c[j-1]+L_c[j][i]<c[i])
                {
                    c[i]=c[j-1]+L_c[j][i];
                    p[i]=j;
                }
            }
        }

        

    }
    
}
