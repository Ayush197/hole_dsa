import java.util.Arrays;
import java.util.Scanner;

class choclate_dis
{
    public static void main(String[] args) {
        
        Scanner au=new Scanner(System.in);
        System.out.println("enter the size and m");
        int n=au.nextInt(),m=au.nextInt();

        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=au.nextInt();

        Arrays.sort(x);
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<n-m+1;i++)
        {
            if(x[i+m-1]-x[i]<diff)
            diff=x[i+m-1]-x[i];

        }
        System.out.println(diff);
        au.close();
    }
}