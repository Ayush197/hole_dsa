import java.util.*;

class q1
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

        boolean seen[][]=new boolean[m][n];

        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };

        int r=0,c=0,di=0;

        List <Integer> list =new LinkedList<>();

        for(int i=0;i<m*n;i++)
        {
           list.add(x[r][c]);
           seen[r][c]=true;
           
           int p=r+dr[di];
           int q=c+dc[di];
            
           if(p>=0&&p<m&&q>=0&&q<n&&!seen[p][q])
           {
                r=p;
                c=q;
           }
           else
           {
               di=(di+1)%4;
               r+=dr[di];
               c+=dc[di];
           }
        }
        System.out.println(list);

    }
}