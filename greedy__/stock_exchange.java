import java.util.*;

class pair implements Comparable<pair>
{
    int a,b;
    public pair(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public int compareTo(pair x)
    {
        return this.b-x.b;
    }

    
}


public class stock_exchange
{
    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter n");
        int n=au.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=au.nextInt();
        System.out.println("enter the on hand money ");
        int k=au.nextInt();

        Vector<pair> vec=new Vector<>();
        for(int i=0;i<n;i++)
        {
            vec.add(new pair(x[i],i+1));
        }
        vec.sort(null);
        

        int res=0;
        for(int i=0;i<x.length;i++)
        {
          res+=Math.min(vec.get(i).b,k/vec.get(i).a);
          k-=vec.get(i).a*Math.min(vec.get(i).b,k/vec.get(i).a);
        }
        System.out.println(res);
        au.close();        
    }
}