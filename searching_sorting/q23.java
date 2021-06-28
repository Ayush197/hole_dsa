import java.util.Arrays;
import java.util.Scanner;

public class q23 {


    static boolean check(int val,int x[],int k)
    {
        int cows=1,p=x[0];

        for(int i=1;i<x.length;i++)
        {
            if(x[i]-p>=val)
            {
                cows++;
                p=x[i];
                if(cows==k)
                return true;
            }
        }

        return false;

    }

    static int minmax(int x[],int b)
    {
        int len=x.length;
        int low=0,high=x[len-1],max=-1;

        while(low<high)
        {
            int mid=(low+high)/2;
            if(check(mid, x, b))
            {
                if(mid>max)
                max=mid;
                low+=1;
            }
            else
            high=mid;
        }

        return max;

    }
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the test cases and all");

        int t=au.nextInt();

        while(t>0)
        {

            int a=au.nextInt(),b=au.nextInt();
            int x[]=new int[a];

            for(int i=0;i<a;i++)
            x[i]=au.nextInt();

            Arrays.sort(x);

            System.err.println(minmax(x, b));
            
            t--;
        }
        au.close();
    }
    
}
