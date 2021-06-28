import java.util.*;

class q2
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

        System.out.println("Enter the number to be seached");
        int k=au.nextInt();

        String flage="Not found";

        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
        if(x[i][j]==k)
        {
            flage="Found";
            break;
        }

        System.out.println(flage);
        
    }
    
}