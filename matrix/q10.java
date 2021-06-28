import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q10
{
    public static void main(String[] args)
     {
         Scanner au=new Scanner(System.in);
         System.out.println("Enter the dimensons");
         int n=au.nextInt();
         int m=au.nextInt();

         int x[][]=new int[n][m];

         for(int i=0;i<n;i++)
         for(int j=0;j<m;j++)
         x[i][j]=au.nextInt();

         Map <Integer,Integer> map=new HashMap<>();

         for(int i=0;i<n;i++)
         map.put(x[0][i], 1);

         for(int i=1;i<n;i++)
         {
             for(int j=0;j<m;j++)
             {
                 if(map.get(x[i][j])!=null&&map.get(x[i][j])==i )
                 {
                    map.put(x[i][j], i+1);

                    if(i==m-1)
                    System.out.println(x[i][j]+" ");
                 }
             }
         }


        
    }    
}
