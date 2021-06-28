import java.util.*;

class q4
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

        int min=Integer.MIN_VALUE,count=0;
        int row=0;
     for(int i=0;i<m;i++)
        {
            count=0;
        for(int j=0;j<n;j++)
        {
            if(x[i][j]==1)
            count+=1;
        }
        if(count>min)
        {
        min=count;
        row=i+1;
        }

    }
    System.out.println(row);
    }
}