import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class max_sum3 
{
    static void max_diff(int x[])
    {


        Vector<Integer> vec=new Vector<>();

        int n=x.length;
        for(int i=0;i<n/2;i++)
        {
            vec.add(x[i]);
            vec.add(x[n-i-1]);
        }

        if(n%2!=0)
        vec.add(x[n/2]);

        int res=0;
        //System.out.println(vec.size());

        for(int i=0;i<n-1;i++)
        {
        res+=Math.abs(vec.get(i)-vec.get(i+1));
       // System.out.println(i);
        }

        res+=Math.abs(vec.get(0)-vec.get(n-1));

        System.out.println("the maximum result"+res);

    }
    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=au.nextInt();

        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=au.nextInt();

        Arrays.sort(x);
        max_diff(x);


        au.close();
        
    }
    
}
