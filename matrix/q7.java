import java.util.*;

class q7
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

        for(int i=0;i<m;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp=x[i][j];
                x[i][j]=x[n-j-1][i];
                x[n-j-1][i]=x[n-i-1][n-j-1];
                x[n-i-1][n-j-1]=x[j][n-i-1];
                x[j][n-i-1]=temp;
            }
        }
        for(int i=0;i<m;i++)
        {
        for(int j=0;j<n;j++)
        System.out.print(x[i][j]+" ");
        System.out.println();
        }
    }
}