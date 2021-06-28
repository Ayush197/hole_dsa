import java.util.*;
public class q15 
{

    public static int changes(String x,String y,int m,int n)
    {
        if(m==0)
        return n;
        
        if(n==0)
        return m;

        if(x.charAt(m)==y.charAt(n))
        return changes(x, y, m-1, n-1);

        return 1+Math.min(changes(x, y, m, n-1),Math.min(changes(x, y, m-1, n), changes(x, y, m-1, n-1)));
    }
    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the two string");
        String x=au.next(),y=au.next();

        int m=x.length(),n=y.length();
        
         
         System.out.println(changes(x, y, m-1, n-1));

        au.close();
        
    }
    
}
