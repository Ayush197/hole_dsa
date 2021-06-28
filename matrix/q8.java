import java.util.*;

class q5
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the dimensions");

        int m=au.nextInt();
        int n=au.nextInt();

        int x[][]=new int[m][n];

        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
        x[i][j]=au.nextInt();

        int max[][]=new int[m][n];

        max[m-1][n-1]=x[m-1][n-1];

        int max_val=max[m-1][n-1];

        for(int i=m-2;i>=0;i--)
        {
           if(x[n-1][i]>max_val)
           max_val=x[n-2][i];

           max[n-1][i]=max_val;
        }

        
        max_val=max[m-1][n-1];

        for(int i=m-2;i>=0;i--)
        {
           if(x[i][n-1]>max_val)
           max_val=x[i][n-1];

           max[i][n-1]=max_val;
        }

        for(int i=n-2;i>=0;i--)
        {
            for(int j=m-2;j>=0;j--)
            {
                if(x[i+1][j+1]-max[i][j]>max_val)
                max_val=x[i+1][j+1]-max[i][j];

                max[i][j]=Math.max(x[i][j], Math.max(max[i+1][j], max[i][j+1]));
            }
        }
        System.out.println(max_val);

        
    }
}