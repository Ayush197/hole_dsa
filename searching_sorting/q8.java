import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q8
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=au.nextInt();

        int x[]=new int[n];

        for(int i=0;i<n;i++)
        x[i]=au.nextInt();

        Map <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(x[i]))
            map.put(x[i],map.get(x[i])+1);
            else
            map.put(x[i],1);
        }

        int max=Integer.MIN_VALUE;

        for(int c: map.keySet())
        {
            if(map.get(c)>max)
            max=map.get(c);
        }
        System.err.println(max);
        au.close();
    }    
}
