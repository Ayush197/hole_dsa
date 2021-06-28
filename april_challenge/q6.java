import java.util.Scanner;
//worthy matrix
public class q6 {
    
    static int search(int mat[][],int m ,int n,long k)
    {
        
        if(mat==null&&m==0&&n==0)
        return 0;

        int res=0;
        int start=0,end=m*n-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            int midx=mid/n,midy=mid%n;

            if(mat[midx][midy]==k)
            res+=1;
           
            if(mat[midx][midy]<k)
            start=mid+1;
            else
            end=end-1;

        }


        return res;

    }
    
    
    public static void main(String[] args) {
        try {
            Scanner au=new Scanner(System.in);
            int t=au.nextInt();
            while(t>0)
            {
             
                int m=au.nextInt(),n=au.nextInt();
                long k=au.nextLong();
                int a[][]=new int[m][n];
                int pre[][]=new int[m][n];
                for(int i=0;i<m;i++)
                for(int j=0;j<n;j++)
                a[i][j]=au.nextInt();
               
                
                int R = a.length;
        int C = a[0].length;
 
        int psa[][] = new int[R][C];
 
        psa[0][0] = a[0][0];
 
        // Filling first row and first column
        for (int i = 1; i < C; i++)
            psa[0][i] = psa[0][i - 1] + a[0][i];
        for (int i = 1; i < R; i++)
            psa[i][0] = psa[i - 1][0] + a[i][0];
 
        
        for (int i = 1; i < R; i++)
            for (int j = 1; j < C; j++)
                psa[i][j] = psa[i - 1][j] + psa[i][j - 1]
                            - psa[i - 1][j - 1] + a[i][j];
                
                    
                for(int i=0;i<m;i++)
                {
                for(int j=0;j<n;j++)
                System.out.print(psa[i][j]+" ");
                System.out.println();
                }
               
                int res=search(psa, m, n, k);
                System.out.println(res);


                t--;
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
