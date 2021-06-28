import java.util.*;

class q3
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


        List <Integer> list =new LinkedList<>();

        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
        list.add(x[i][j]);
        
        Collections.sort(list);

        int s=list.size();

        int median=0;

        if(s%2==0)
        {
            median=(list.get(s/2)+list.get(1+(s/2)))/2;
        }
        else
        median=list.get(1+(s/2));

        System.out.println(median);
    }
}