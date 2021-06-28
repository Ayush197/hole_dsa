import java.util.*;

class q6
{
    static int hist(int ar[],int r,int c)
    {
        Stack <Integer> lis=new Stack<>();

        int top,max_a=0,area=0;

        int i=0;
        while(i<c)
        {
            if(lis.empty()||ar[lis.peek()]<=ar[i])
            {
                lis.push(i++);
            }
            else
            {
                top=ar[lis.peek()];
                lis.pop();
                area=top*i;

                if(!lis.empty())
                {
                 area=top*(i-lis.peek()-1);
                 max_a=Math.max(area, max_a);
                }

            }

        }
        while(!lis.empty())
        {
        top=ar[lis.peek()];
        lis.pop();
        area=top*i;

        if(!lis.empty())
        {
            area=top*(i-lis.peek()-1);
            max_a=Math.max(area, max_a);
        }
        }
        return max_a;

    }
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the dimensions");

        int m=au.nextInt();
        int n=au.nextInt();

        int x[][]=new int[m][n];

        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
        x[i][j]=au.nextInt();


        

        

        int result=hist(x[0], m, n);

        for(int i=1;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(x[i][j]==1)
                x[i][j]=x[i-1][j];
            }

        result=Math.max(result, hist(x[i], m, n));
        }
        System.out.println(result);


        au.close();
    }
}
