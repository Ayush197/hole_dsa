import java.util.*;

public class q23 
{
    static int pallin(String st, int start, int end,int dp[][])
    {
        if(start>end)
        return 0;

        if(dp[start][end]!=-1)
        return dp[start][end];

        if(start==end)
        return dp[start][end]=1;


        if(st.charAt(start)==st.charAt(end))
        return dp[start][end]=pallin(st, start+1, end,dp)+pallin(st, start, end-1,dp)+1;
        else
        return dp[start][end]= pallin(st, start+1, end,dp)+pallin(st, start, end-1,dp)-pallin(st, start+1, end-1,dp);

        
               
    }
    public static void main(String[] args)
     {
         Scanner au=new Scanner(System.in);

         System.out.println("Enter the string");
         String st=au.next();
         
         int dp[][]=new int[100][100];
         for(int i=0;i<100;i++)
         for(int j=0;j<100;j++)
         dp[i][j]=-1;

        int res= pallin(st, 0, st.length()-1,dp);
        System.out.println(res);
        au.close();


        
    }
    
}
