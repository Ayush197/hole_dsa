import java.util.*;
public class q13
{
    public static void main(String[] args) {
        Scanner au= new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n=au.nextInt();

        int ar[]=new int[n];

        for(int i=0;i<n;i++)
        ar[i]=au.nextInt();

        int cur_max=Integer.MIN_VALUE;
        int sum_max=0;
         
        for(int i=0;i<n;i++)
        {
            sum_max+=ar[i];
            if(cur_max<sum_max)
            cur_max=sum_max;

            if(sum_max<0)
            sum_max=0;
        }
        System.out.println(cur_max);
    }
}

