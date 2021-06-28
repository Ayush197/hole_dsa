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

        List <Integer> list=new LinkedList<>();


        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
        list.add(x[i][j]);

        Collections.sort(list);

        System.out.println(list);

        int v=0;
        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
        {
        x[i][j]=list.get(v);
        v+=1;
        }

        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
        System.out.println(x[i][j]+" ");



    }
}