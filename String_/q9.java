import java.util.*;
public class q9
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);

        System.out.println("Enter the string");
        String x=au.next();

        boolean dp[][]=new boolean[x.length()][x.length()];

        int size=x.length();

        int max_len=1;

        for(int i=0;i<size;i++)
        dp[i][i]=true;
 
        int start=0;
        for(int i=0;i<size-1;i++)
        {
            if(x.charAt(i)==x.charAt(i+1))
            {
                start=i;
                max_len=2;
                dp[i][i+1]=true;
            }
        }
        
        for(int k=3;k<size;k++)
        for(int i=0;i<size-k+1;i++)
        {
            int j=i+k-1;

            if(dp[i+1][j-1]&&x.charAt(i)==x.charAt(j))
            {
                start=i;
                dp[i][j]=true;
            
            if(max_len<k)
            {
                max_len=k;
                start =i;
            }
        }
        }

        System.out.println(x.substring(start,start+max_len));
    }
}
