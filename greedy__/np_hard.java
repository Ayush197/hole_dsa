
import java.util.ArrayList;
import java.util.Arrays;

class np_hard
{
    static int find_max(int z[])
    {
        int max=0;
        for(int i=0;i<z.length;i++)
        {
            if(z[i]>max)
            max=i;
        }
        return max;
    }
    static void placed_warehouse(int weights[][],int k,int n)
    {
        int x[]=new int[n];
        Arrays.fill(x, Integer.MAX_VALUE);
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        for(int i=1;i<=k;i++)
        {
            list.add(sum);
            
            for(int j=0;j<n;j++)
            {
                x[j]=Math.min(x[j], weights[sum][j]);
            }
            sum=find_max(x);
        }
    }
    public static void main(String[] args) 
    {
        int n = 4;
        int[][] weights = new int[][]{ { 0, 4, 8, 5 },
                                       { 4, 0, 10, 7 },
                                       { 8, 10, 0, 9 },
                                       { 5, 7, 9, 0 } };
        int k = 2;
        placed_warehouse(weights, k, n);
        
    }
}